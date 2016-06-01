package test.servlet;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

import javax.persistence.Cache;
import javax.persistence.EntityGraph;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnitUtil;
import javax.persistence.Query;
import javax.persistence.SynchronizationType;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.metamodel.Metamodel;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import test.user.UserController;
import test.user.UserService;

public class DispatcherServlet extends HttpServlet {

	private static final long serialVersionUID = 6609859794535220136L;
	private UserController userController;
	private static final String contextRoot = "/test/";

	@Override
	public void init() throws ServletException {
		super.init();
		userController = new UserController();
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
		PersistenceManager.getInstance().close();
	}

	@Override
	protected void service(javax.servlet.http.HttpServletRequest req,
			javax.servlet.http.HttpServletResponse resp)
			throws javax.servlet.ServletException, java.io.IOException {

		String uri = req.getRequestURI();
		System.out.println(uri);

		if (getUri("api/login").equalsIgnoreCase(uri)) {
			
			req = userController.mapping("", req, resp);
			RequestDispatcher d = req.getRequestDispatcher("/result.jsp");
			d.forward(req, resp);

		}  else {
			resp.sendRedirect(getUri("login.jsp"));
		}
	}
	private String getUri(String uri) {
		return contextRoot + uri;
	}

}
