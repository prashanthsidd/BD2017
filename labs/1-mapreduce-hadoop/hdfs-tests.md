`Teragen command used `

bin/hadoop jar share/hadoop/mapreduce/hadoop-mapreduce-examples-2.8.0.jar teragen -Ddfs.block.size=16777216 -Dmapred.map.tasks=6 50000000 /user/prashanthsidd/terasort_inp

`Teragen time duration`

1m54.234s

`Terasort command used`

time bin/hadoop jar share/hadoop/mapreduce/hadoop-mapreduce-examples-2.8.0.jar terasort /user/prashanthsidd/terasort_inp /user/prashanthsidd/terasort_out

`Terasort time duration`

15m27.471s