package com.obeast.springOwnTest.Aware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class TestMain {
   public static void main(String[] args) {
      ApplicationContext acx =
     new AnnotationConfigApplicationContext(AutowiredConfig.class);
      System.out.println(acx);
   }
}