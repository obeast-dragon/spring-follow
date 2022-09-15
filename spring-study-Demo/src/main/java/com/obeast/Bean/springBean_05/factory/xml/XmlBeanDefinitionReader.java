package com.obeast.Bean.springBean_05.factory.xml;

import com.obeast.Bean.springBean_05.BeansException;
import com.obeast.Bean.springBean_05.core.io.Resource;
import com.obeast.Bean.springBean_05.core.io.ResourceLoader;
import com.obeast.Bean.springBean_05.support.AbstractBeanDefinitionReader;
import com.obeast.Bean.springBean_05.support.BeanDefinitionRegistry;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author wxl
 * Date 2022/9/15 22:29
 * @version 1.0
 * Description:  XML 文件的解析
 *
 */
public class XmlBeanDefinitionReader extends AbstractBeanDefinitionReader {

	public XmlBeanDefinitionReader(BeanDefinitionRegistry registry) {
		super(registry);
	}

	public XmlBeanDefinitionReader(BeanDefinitionRegistry registry, ResourceLoader resourceLoader) {
		super(registry, resourceLoader);
	}

	@Override
	public void loadBeanDefinitions(Resource resource) throws BeansException {
		try {
			try (InputStream inputStream = resource.getInputStream()){
				doLoadBeanDefinitions(inputStream);
			}
		}catch (IOException | ClassNotFoundException e){
			throw new BeansException("IOException parsing XML document from " + resource, e);
		}
	}

	@Override
	public void loadBeanDefinitions(Resource... resource) throws BeansException {
		for (Resource resource1 : resource) {
			loadBeanDefinitions(resource1);
		}
	}

	@Override
	public void loadBeanDefinitions(String location) throws BeansException {
		ResourceLoader resourceLoader = getResourceLoader();
		Resource resource = resourceLoader.getResource(location);
		loadBeanDefinitions(resource);
	}


	protected void doLoadBeanDefinitions(InputStream inputStream) throws ClassNotFoundException{

	}
}
