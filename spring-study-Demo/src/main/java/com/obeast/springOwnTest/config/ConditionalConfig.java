package com.obeast.springOwnTest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConditionalConfig {
   @Bean("linuxCalc")
   // 指定创建Bean的条件实现类
   @Conditional(value = LinuxConditional.class)
   public LinuxCalc calc() {
      return new LinuxCalc();
   }
}