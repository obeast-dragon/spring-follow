package com.obeast.Bean.springBean_05.core.io;

import org.springframework.util.Assert;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/**
 * @author wxl
 * Date 2022/9/15 21:45
 * @version 1.0
 * Description: 远程文件资源处理
 * 通过 HTTP 的方式读取云服务的文件，我们也可以把配置文件放到 GitHub 或者 Gitee 上。
 */
public class UrlResource implements Resource{

	private URL url;

	public UrlResource(URL url) {
		Assert.notNull(url, "url cannot be null");
		this.url = url;
	}

	@Override
	public InputStream getInputStream() throws IOException {
		URLConnection urlConnection = this.url.openConnection();
		try {
			return urlConnection.getInputStream();
		}
		catch (IOException e) {
			if (urlConnection instanceof HttpURLConnection){
				((HttpURLConnection)urlConnection).disconnect();
			}
			throw e;
		}
	}
}
