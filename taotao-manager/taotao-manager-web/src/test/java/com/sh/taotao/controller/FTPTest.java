package com.sh.taotao.controller;

import java.io.File;
import java.io.FileInputStream;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.junit.Test;

import com.sh.taotao.common.utils.FtpUtil;

public class FTPTest {

	@Test
	public void testFtpClient() throws Exception {
		//创建一个FtpClient对象
		FTPClient ftpClient = new FTPClient();
		//创建ftp连接。默认是21端口
		ftpClient.connect("192.168.2.136", 21);
		//登录ftp服务器，使用用户名和密码
		ftpClient.login("bona", "123456");
		//上传文件。
		//读取本地文件
		FileInputStream inputStream = new FileInputStream(new File("E:\\images\\2.jpg"));
		//设置上传的路径
		if (!ftpClient.makeDirectory("/var/www/images/2019")) {
			System.out.print("ddddebug:");
		} 
		ftpClient.changeWorkingDirectory("/var/www/images/2019");
		//修改上传文件的格式
		ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
		//第一个参数：服务器端文档名
		//第二个参数：上传文档的inputStream
		ftpClient.storeFile("testUpload2.jpg", inputStream);
		//关闭连接
		ftpClient.logout();
		
	}
	
	@Test
	public void testFtpUtil() throws Exception {
		FileInputStream inputStream = new FileInputStream(new File("E:\\images\\3.jpg"));
		FtpUtil.uploadFile("192.168.2.136", 21, "bona", "123456", "/home/ftpuser/www/images", "/2019/05/04", "testUpload3.jpg", inputStream);
		
	}
}
