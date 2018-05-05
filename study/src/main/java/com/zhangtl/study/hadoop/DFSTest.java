package com.zhangtl.study.hadoop;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.hdfs.server.namenode.FSDirectory;
import org.apache.hadoop.hdfs.server.namenode.INode;

public class DFSTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Configuration conf = new Configuration();
		FileSystem fs = FileSystem.get(conf );
		
		//fs.mkdirs(new Path("/tt/dir1/"));
		FSDataOutputStream  out = fs.create(new Path("/test/1.txt"));
		out.writeUTF("hello");
		out.flush();
		out.close();
		//FSDirectory.normalizePath("/tt");
		//INode.getPathComponents("/tt");
	}

}
