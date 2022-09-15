package com.obeast.Bean.springBean_02;

/**
 * @author wxl
 * Date 2022/9/15 8:39
 * @version 1.0
 * Description: BeanFactory 工厂接口
 */
public interface BeanFactory {

	Object getBean(String beanName);
}
