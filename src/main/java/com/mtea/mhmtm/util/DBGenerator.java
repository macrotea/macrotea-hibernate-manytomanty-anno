package com.mtea.mhmtm.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * 数据库生成器
 * 
 * @author macrotea@qq.com
 * @date 2012-11-29 下午9:57:07
 * @version 1.0
 * @note
 */
public class DBGenerator {
	// 修改
	public static final String DB = "db_hibernate_demo";
	public static final String USER = "root";
	public static final String PASS = "admin";

	public static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	public static final String INIT_URL = "jdbc:mysql://localhost:3306/mysql";

	public static void main(String[] args) throws Exception {
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(INIT_URL, USER, PASS);
			stmt = conn.createStatement();
			String sql = "CREATE DATABASE IF NOT EXISTS " + DB;
			stmt.executeUpdate(sql);
			System.out.println(String.format("创建数据库: %s 成功!",DB));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			stmt.close();
			conn.close();
		}
	}
}
