package com.obeast.springOwnTest.config;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author wxl
 * Date 2022/8/29 14:47
 * @version 1.0
 * Description:
 */
public class LinuxConditional implements Condition {
	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		Environment environment = context.getEnvironment();
		String osName = environment.getProperty("os.name");
		return osName !=null && osName.contains("Linux");
	}
}
