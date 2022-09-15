package com.obeast.Bean.springBean_05;

/**
 * @author wxl
 * Date 2022/9/15 11:52
 * @version 1.0
 * Description:
 */
public class BeansException extends RuntimeException {

	public BeansException(String message) {
		super(message);
	}

	public BeansException(String message, Throwable cause) {
		super(message, cause);
	}
}
