package com.obeast.Bean.springBean_04.test.service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wxl
 * Date 2022/9/15 15:48
 * @version 1.0
 * Description:
 */
public class UserDao {
	private static Map<String, String> hashMap = new HashMap<>();

	static {
		hashMap.put("10001", "老六");
		hashMap.put("10002", "八杯水");
		hashMap.put("10003", "阿毛");
	}

	public String queryUserName(String uId) {
		return hashMap.get(uId);
	}
}
