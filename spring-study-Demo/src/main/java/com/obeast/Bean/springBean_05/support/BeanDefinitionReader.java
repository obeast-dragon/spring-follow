package com.obeast.Bean.springBean_05.support;

import com.obeast.Bean.springBean_05.BeansException;
import com.obeast.Bean.springBean_05.core.io.Resource;
import com.obeast.Bean.springBean_05.core.io.ResourceLoader;

/**
 * @author wxl
 * Date 2022/9/15 22:09
 * @version 1.0
 * Description: Bean定义读取接口
 * 这里需要注意 getRegistry()、getResourceLoader()，都是用于提供给后面三个方法的工具，加载和注册，这两个方法的实现会包装到抽象类中，以免污染具体的接口实现方法。
 */
public interface BeanDefinitionReader {

	BeanDefinitionRegistry getRegistry();

	ResourceLoader getResourceLoader();

	void loadBeanDefinitions(Resource resource) throws BeansException;

	void loadBeanDefinitions(Resource... resource) throws BeansException;

	void loadBeanDefinitions(String location) throws BeansException;


}
