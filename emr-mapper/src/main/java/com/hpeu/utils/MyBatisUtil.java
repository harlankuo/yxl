package com.hpeu.utils;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
  * 工具类
 * @title MyBatisUtil.java
 * @author 姚臣伟
 * @company 慧与（中国）
 * @date 2019年10月28日
 */
public class MyBatisUtil {
	private static SqlSessionFactory factory;
	static {
		try {
			InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
			factory = new SqlSessionFactoryBuilder().build(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	  * 获取SqlSession
	 * @return 返回SqlSession
	 */
	public static SqlSession openSession() {
		return factory.openSession();
	}
	
	/**
	 * 通过指定的类型来获取SqlSession
	 * @param execType
	 * @return
	 */
	public static SqlSession openSession(ExecutorType execType) {
		return factory.openSession(execType);
	}
	
}
