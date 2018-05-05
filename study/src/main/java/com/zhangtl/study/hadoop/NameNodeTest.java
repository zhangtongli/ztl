package com.zhangtl.study.hadoop;

import org.apache.hadoop.hdfs.server.namenode.NameNode;
import org.apache.hadoop.util.NativeCodeLoader;
import org.apache.hadoop.util.Shell;

public class NameNodeTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//Shell.getHadoopHome()
		String home = System.getenv("HADOOP_HOME");
		//System.out.println(home);
		//System.out.println(NativeCodeLoader.isNativeCodeLoaded());
		//String[] arg = {"-format"};
		NameNode.main(args);
	}

}
