package com.obeast.Bean.springBean_05.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author wxl
 * Date 2022/9/15 21:28
 * @version 1.0
 * Description:资源加载器
 */
public interface Resource {

	/**
	 * Description: 获取流
	 * @author wxl
	 * Date: 2022/9/15 21:44
	 * @return java.io.InputStream
	 */
	InputStream getInputStream() throws IOException;
}
