package com.obeast.Bean.springBean_05.factory;

/**
 * @author wxl
 * Date 2022/9/15 8:23
 * @version 1.0
 * Description: 单例模式接口
 */
public interface SingletonBeanRegistry {

	Object getSingleton(String beanName);
}
