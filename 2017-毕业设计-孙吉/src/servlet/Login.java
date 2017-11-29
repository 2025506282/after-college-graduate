package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import constant.CommmonConstant;
import exception.ParameterException;
import model.User;
import service.UserService;
import service.impl.UserServiceImpl;
import util.MD5Util;


@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter(CommmonConstant.USER_NAME);
		String password = request.getParameter(CommmonConstant.PASSWORD);
		password = MD5Util.GetMD5Code(password);
		System.out.println(password);
		UserService userService = new UserServiceImpl();
		PrintWriter out = response.getWriter();
		try {
			User user = (User)userService.login(userName, password);
			user.setPassword(null);
			out.print(Boolean.TRUE.toString());
		} catch (ParameterException e) {
			out.print("用户名或密码错误");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
