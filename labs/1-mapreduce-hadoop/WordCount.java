/**
 * Created by sid on 01.05.17.
 * The program is based on the Word Count example available under
 * http://hadoop.apache.org/docs/r2.8.0/hadoop-mapreduce-client/hadoop-mapreduce-client-core/MapReduceTutorial.html
 */

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

import java.io.IOException;
import java.util.StringTokenizer;

public class WordCount {
    public static class CustomMapper extends Mapper<Object, Text, Text, IntWritable>{

        private final static IntWritable one = new IntWritable(1);
        private Text word = new Text();

        public void map(Object key, Text value, Context context){
            StringTokenizer stringTokenizer = new StringTokenizer(value.toString());
            while(stringTokenizer.hasMoreTokens()){
                word.set(stringTokenizer.nextToken());
                try {
                    context.write(word, one);
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static class CustomReducer extends Reducer<Text, IntWritable, Text, IntWritable>{

            public IntWritable result = new IntWritable();

            public void reduce(Text key, Iterable<IntWritable> values, Context context){
                int sum = 0;
                for(IntWritable value : values){
                    sum = sum + value.get();
                }

                result.set(sum);
                try {
                    context.write(key, result);
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
    }

    public static void main(String args[]) throws Exception{
        if(args.length == 0){
            System.out.println("Usage : hadoop jar WordCount.jar inputFile outputFile");
            System.exit(0);
        }
        System.out.println("Number of arguments passed " + args.length);

        Configuration conf = new Configuration();
        Job job = Job.getInstance(conf, "Word Count");
        job.setJarByClass(WordCount.class);
        job.setMapperClass(CustomMapper.class);
        job.setCombinerClass(CustomReducer.class);
        job.setReducerClass(CustomReducer.class);
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(IntWritable.class);
        FileInputFormat.addInputPath(job, new Path(args[0]));
        FileOutputFormat.setOutputPath(job, new Path(args[1]));
        System.exit(job.waitForCompletion(true)? 0: 1);
    }

}
