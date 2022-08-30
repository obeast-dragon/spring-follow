package com.obeast.springOwnTest.Aware;

import com.obeast.springOwnTest.DI.UserDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan({"com.obeast.springOwnTest.Aware"})
public class AutowiredConfig {

}