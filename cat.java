import java.io.*;
import apache.org.hadoop.fs.FileInputStream;
import apache.org.hadoop.conf.Configuration;
import apache.org.hadoop.io.IOUtils;
import apache.org.hadoop.fs.Path;
import java.net.URI;

class cat{

public static void main(String [] args){
String addr="hdfs://localhost:9000/hare.txt";
Configuration conf=new Configuration();
conf.set("fs.hdfs.impl","org.apache.hadoop.hdfs.DistributedFileSystem");
FileSystem fs=FileSystem.get(URI.create(addr),conf);
FileInputStream in=fs.open(new Path(addr));
IOUtils.copyBytes(in,System.out,4096,false);
IOUtils.closeStream(in);
}

}