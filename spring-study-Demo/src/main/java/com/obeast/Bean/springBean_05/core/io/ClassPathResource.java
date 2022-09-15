package com.obeast.Bean.springBean_05.core.io;

import com.obeast.Bean.springBean_05.utils.ClassUtils;
import org.springframework.util.Assert;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author wxl
 * Date 2022/9/15 21:29
 * @version 1.0
 * Description: 处理资源加载流
 * 这一部分的实现是用于通过 ClassLoader 读取ClassPath 下的文件信息，具体的读取过程主要是：classLoader.getResourceAsStream(path)
 */
public class ClassPathResource implements Resource{
	private final String path;

	private ClassLoader classLoader;

	public ClassPathResource(String path) {
		this(path,  null);
	}

	public ClassPathResource(String path, ClassLoader classLoader) {

		Assert.notNull(path, "path cannot be null");
		this.path = path;
		this.classLoader = (classLoader != null ? classLoader : ClassUtils.getDefaultClassLoader());
	}


	@Override
	public InputStream getInputStream() throws IOException {
		InputStream is = classLoader.getResourceAsStream(path);
		if (is == null) {
			throw new FileNotFoundException(
					this.path + " cannot be opened because it does not exist");
		}
		return is;
	}
}
