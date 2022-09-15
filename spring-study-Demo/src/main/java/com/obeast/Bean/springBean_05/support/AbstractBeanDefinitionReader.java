package com.obeast.Bean.springBean_05.support;


import com.obeast.Bean.springBean_05.core.io.DefaultResourceLoader;
import com.obeast.Bean.springBean_05.core.io.ResourceLoader;

/**
 * @author wxl
 * Date 2022/9/15 22:14
 * @version 1.0
 * Description: BeanDefinitionReader接口抽象实现类
 * 职责：只是实现getRegistry()、getResourceLoader()
 */
public abstract class AbstractBeanDefinitionReader implements BeanDefinitionReader{

	private final BeanDefinitionRegistry registry;

	private ResourceLoader resourceLoader;

	public AbstractBeanDefinitionReader(BeanDefinitionRegistry registry) {
		this(registry, new DefaultResourceLoader());
	}

	public AbstractBeanDefinitionReader(BeanDefinitionRegistry registry, ResourceLoader resourceLoader) {
		this.registry = registry;
		this.resourceLoader = resourceLoader;
	}

	@Override
	public BeanDefinitionRegistry getRegistry() {
		return registry;
	}

	@Override
	public ResourceLoader getResourceLoader() {
		return resourceLoader;
	}

}
