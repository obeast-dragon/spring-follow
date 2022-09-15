package com.obeast.Bean.springBean_05.core.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author wxl
 * Date 2022/9/15 21:41
 * @version 1.0
 * Description: 文件资源处理
 * 通过指定文件路径的方式读取文件信息，这部分大家肯定还是非常熟悉的，经常会读取一些txt、excel文件输出到控制台。
 */
public class FileSystemResource  implements Resource{

	private File file;

	private final String path;

	public FileSystemResource(File file) {
		this.file = file;
		this.path = file.getPath();
	}

	public FileSystemResource(String path) {
		this.file = new File(path);
		this.path = path;
	}


	@Override
	public InputStream getInputStream() throws IOException {
		return new FileInputStream(file);
	}
}
