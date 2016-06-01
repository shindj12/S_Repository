package test.user;

import java.sql.*;

import javax.persistence.EntityManager;

public class UserDao {

	public static User getUser(EntityManager em, String id) {
		Connection con = null;
		User user = null;
		
		em.persist(insertUser(em, id));
		user = em.find(User.class, id);

		
/*		try {
			Class.forName("com.mysql.jdbc.Driver");

		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {

//			con = DriverManager.getConnection(DB.getJDBCurl(), DB.getDbUser(),
//					DB.getDbPassword());
			con = DriverManager.getConnection("jdbc:mysql://test.cluster-cmjofcvaooxw.ap-northeast-1.rds.amazonaws.com:3306/do", DB.getDbUser(), DB.getDbPassword());

			java.sql.Statement st = null;

			ResultSet rs = null;
			st = con.createStatement();

			rs = st.executeQuery("use " + DB.getDbName());

			rs = st.executeQuery("SELECT * FROM User WHERE ID='" + id + "'");


			while (rs.next()) {


				if (rs.getString(User.ID).equals(id)) {
					user = new User();

					user.setName(rs.getString(User.NAME));
					user.setId(rs.getString(User.ID));
					user.setPw(rs.getString(User.PASSWORD));

				}

			}
			st.close();
			rs.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		return user;
	}
	public static User insertUser(EntityManager em, String id) {
		User user = new User();
		user.setId("test");
		user.setName("sdj");
		user.setPw("1234");
		return user;
	}
}
