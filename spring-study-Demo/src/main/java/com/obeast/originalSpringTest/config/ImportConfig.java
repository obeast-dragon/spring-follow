package com.obeast.originalSpringTest.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author wxl
 * Date 2022/8/29 14:59
 * @version 1.0
 * Description:
 */

@Configuration
// 给容器中导入一个类型为MyBeanNameAware的组件
// 此处的value为一个数组，可以指定多个，即同时给容器中导入多个组件.
@Import(value = MyBeanNameAware.class)
public class ImportConfig {
}
