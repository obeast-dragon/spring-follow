package com.obeast.originalSpringTest.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author wxl
 * Date 2022/8/30 10:50
 * @version 1.0
 * Description:
 */
@Configuration
@ComponentScan(basePackages = "com.obeast.originalSpringTest.aop")
// 开启AOP支持
// 该注解中会使用Import注解导入后置处理器及注册自定义Bean用来完成AOP功能
@EnableAspectJAutoProxy
public class AopConfig {
}
