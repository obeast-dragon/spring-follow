package com.obeast.originalSpringTest.service.impl;

import com.obeast.originalSpringTest.service.TestService;
import org.springframework.stereotype.Service;

/**
 * @Author wxl
 * @Create 2022/5/8 19:01
 */
@Service(value = "TestService")
public class TestServiceImpl implements TestService {
	@Override
	public void sayHello(String name) {
		System.out.println("老六：" + name);
	}
}

