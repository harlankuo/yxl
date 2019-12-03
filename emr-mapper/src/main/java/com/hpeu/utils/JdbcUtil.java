package com.hpeu.utils;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import javax.sql.DataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.hpeu.exception.JdbcException;

public class JdbcUtil {
	private static DataSource dataSource;
	private static ThreadLocal<Connection> thread;
	static {
		Properties prop =new Properties();
		try {
			prop.load(JdbcUtil.class.getClassLoader().getResourceAsStream("db.properties"));
			dataSource = DruidDataSourceFactory.createDataSource(prop);
			thread=new ThreadLocal<Connection>();
		} catch (IOException e) {
			
			throw new JdbcException("读取配置文件出错，错误信息为："+e.getMessage());
		} catch (Exception e) {
			
			throw new JdbcException("获取数据源连接池出错，错误信息为：" + e.getMessage());
		}
	}
	
	public static DataSource getDataSource() {
		return dataSource;
	}
	
	public static Connection getConnection() {
		Connection conn = thread.get();
		try {
			if (conn==null) {
				conn=dataSource.getConnection();
				thread.set(conn);
			}
			return conn;
		} catch (SQLException e) {
			throw new JdbcException("获取连接对象出错，错误信息为：" + e.getMessage());
		}
	}
	
	/**
	 * 关闭连接对象
	 * @param conn 连接对象
	 */
	public static void release(Connection conn) {
		if (null != conn) {
			try {
				conn.setAutoCommit(true);
				conn.close();
			} catch (SQLException e) {
			}
		}
	}
	
	/**
	 * 关闭资源
	 * @param pst 执行SQL对象
	 * @param rs 结果集对象
	 */
	public static void release(PreparedStatement pst, ResultSet rs) {
		if (null != pst) {
			try {
				pst.close();
			} catch (SQLException e) {
			}
		}
		if (null != rs) {
			try {
				rs.close();
			} catch (SQLException e) {
			}
		}
	}
}
