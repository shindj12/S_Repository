package test.user;

public class DB {
	private static final String dbUrl="test.cluster-cmjofcvaooxw.ap-northeast-1.rds.amazonaws.com";
	private static final String dbPort = "3306";
	private static final String dbName = "do";
	private static final String dbUser = "root";
	private static final String dbPassword = "sdsd1212";
	
	public static String getDbUrl() {
		return dbUrl;
	}
	public static String getDbPort() {
		return dbPort;
	}
	public static String getDbName() {
		return dbName;
	}
	public static String getDbUser() {
		return dbUser;
	}
	public static String getDbPassword() {
		return dbPassword;
	}
	public static String getJDBCurl() {
		return "jdbc:mysql://" + dbUrl + ":" + dbPort;
	}
	
	
}
