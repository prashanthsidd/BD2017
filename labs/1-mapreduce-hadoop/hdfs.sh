#Download the book from gutenburg site to HOME dir
curl http://www.gutenberg.org/cache/epub/21688/pg21688.txt > ${HOME}/book.txt
#Copy the file into HDFS systems
bin/hdfs dfs -put ${HOME}/book.txt /user/prashanthsidd/input