package com.obeast.Bean.springBean_05.utils;

/**
 * @author wxl
 * Date 2022/9/15 21:32
 * @version 1.0
 * Description:
 */
public class ClassUtils {

	public static ClassLoader getDefaultClassLoader(){
		ClassLoader cl = null;
		try{
			cl = Thread.currentThread().getContextClassLoader();

		}catch (Throwable ex) {
			// Cannot access thread context ClassLoader - falling back to system class loader...
		}
		if (cl == null){
			// No thread context class loader -> use class loader of this class.
			cl = ClassUtils.class.getClassLoader();
		}
		return cl;
	}
}
