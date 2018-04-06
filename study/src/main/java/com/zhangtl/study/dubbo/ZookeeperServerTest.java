package com.zhangtl.study.dubbo;

import org.apache.zookeeper.server.quorum.QuorumPeerMain;

public class ZookeeperServerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arg = {"12345","zookeeper_data"};
		QuorumPeerMain.main(arg);
	}

}
