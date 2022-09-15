package com.obeast.Bean.springBean_05.core.io;

import org.springframework.util.Assert;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author wxl
 * Date 2022/9/15 22:02
 * @version 1.0
 * Description: ResourceLoader接口实现
 * 主要是把三种不同类型的资源处理方式进行了包装，分为：判断是否为ClassPath、URL以及文件。
 */
public class DefaultResourceLoader implements ResourceLoader{
	@Override
	public Resource getResource(String location) {
		Assert.notNull(location, "location cannot be null");
		if (location.startsWith(CLASSPATH_URL_PREFIX)){
			return new ClassPathResource(location.substring(CLASSPATH_URL_PREFIX.length()));
		}
		else {
			try {
				URL url = new URL(location);
				return new UrlResource(url);
			} catch (MalformedURLException e) {
				throw new RuntimeException(e);
			}
		}
	}
}
