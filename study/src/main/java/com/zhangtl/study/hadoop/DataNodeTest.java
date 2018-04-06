package com.zhangtl.study.hadoop;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hdfs.server.datanode.DataNode;

public class DataNodeTest {

	public static void main(String[] args) throws IOException {
		String[] arg = { "-help" };
		Configuration conf = new Configuration();
		//DataNode.main(args);
		DataNode dn = DataNode.instantiateDataNode(args, conf);
		System.out.println("------------------------");
		dn.runDatanodeDaemon();
	}

}
