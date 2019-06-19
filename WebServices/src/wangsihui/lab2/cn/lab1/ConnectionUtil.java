package wangsihui.lab2.cn.lab1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author WangShiHui
 * @date 16.06.2019
 */
public class ConnectionUtil {
	static {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException ex) {
			Logger.getLogger(PostgreDao.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
	
	private static final String JDBC_URL = "jdbc:postgresql://localhost:5432/mvideo";
	private static final String JDBC_USER = "mvideo";
	private static final String JDBC_PASSWORD = "admin";

	public static Connection getConnection() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
		} catch (SQLException ex) {
			Logger.getLogger(ConnectionUtil.class.getName()).log(Level.SEVERE, null, ex);
		}
		return connection;
	}
}
