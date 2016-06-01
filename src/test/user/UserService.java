package test.user;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.servlet.http.HttpServletRequest;

import test.servlet.PersistenceManager;

public class UserService {

	public boolean checkLogin(javax.servlet.http.HttpServletRequest req) {
		EntityManager em = PersistenceManager.getEntityManager();
		String id = req.getParameter(User.ID);
		String pw = req.getParameter(User.PASSWORD);

		User user = UserDao.getUser(em, id);

		if (user != null) {
			// System.out.println(user.getPw() + pw);
			if (user.getPw().equals(pw))
				em.close();
			return true;
		}
		em.close();
		return false;
	}
	/*
	 * public void findUser(EntityManager em, String id) {
	 * 
	 * 
	 * 
	 * em.close(); }
	 */

}
