package com.zhangtl.study.redis;

import redis.clients.jedis.Jedis;

public class RedisTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("test");
		Jedis jedis = new Jedis("localhost",6379);
		//jedis.set("foo", "bar");
		String value = jedis.get("foo");
		System.out.println(value); 
	}

}
