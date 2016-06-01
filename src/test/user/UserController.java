package test.user;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserController {
	public  javax.servlet.http.HttpServletRequest mapping(String service, javax.servlet.http.HttpServletRequest req,
			javax.servlet.http.HttpServletResponse resp)
			throws javax.servlet.ServletException, java.io.IOException {
		// loginController.doLogin(req, res);
		String msg = null;
//		UserController contoller  = new UserController(emf);
//		controller.login();
		UserService userService = new UserService();
		if (userService.checkLogin(req)) {
			msg = "login";
		} else {
			msg = "can't login";
		}

		req.setAttribute("msg", msg);
		return req;
	}

/*	private byte[] readView(String path) throws IOException {
		FileInputStream fileInputStream = null;

		File file = new File(path);

		byte[] bFile = new byte[(int) file.length()];

		fileInputStream = new FileInputStream(file);
		fileInputStream.read(bFile);
		fileInputStream.close();

		return bFile;
		//
		// for (int i = 0; i < bFile.length; i++) {
		// System.out.print((char) bFile[i]);
		// }
	}*/


}
