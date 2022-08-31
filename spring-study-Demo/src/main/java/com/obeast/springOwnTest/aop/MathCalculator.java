package com.obeast.springOwnTest.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MathCalculator {
   public int div(int i, int j) {
      return i / j;
   }


	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
		MathCalculator mathCalculator = context.getBean(MathCalculator.class);
		mathCalculator.div(2, 0);

	}
}