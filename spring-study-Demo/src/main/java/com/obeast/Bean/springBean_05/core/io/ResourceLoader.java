package com.obeast.Bean.springBean_05.core.io;

/**
 * @author wxl
 * Date 2022/9/15 21:51
 * @version 1.0
 * Description: 包装资源加载器
 * 按照资源加载的不同方式，资源加载器可以把这些方式集中到统一的类服务下进行处理，外部用户只需要传递资源地址即可，简化使用。
 */
public interface ResourceLoader {

	/**
	 * Pseudo URL prefix for loading from the class path: "classpath:"
	 */
	String CLASSPATH_URL_PREFIX = "classpath:";


	/**
	 * Description: 获取Resource
	 * @author wxl
	 * Date: 2022/9/15 21:59
	 * @param location  location 地址
	 * @return com.obeast.Bean.springBean_05.core.io.Resource
	 */
	Resource getResource(String location);
}

