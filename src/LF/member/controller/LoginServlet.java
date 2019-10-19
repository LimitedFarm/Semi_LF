package LF.member.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import LF.member.model.service.MenubarService;
import LF.member.model.vo.*;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login.me")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId = request.getParameter("userId");
		String userPwd = request.getParameter("userPwd");
		
		Customer loginInfo = new MenubarService().selectLoginDate(userId, userPwd);
		Seller seInfo = null;
		Admin adInfo = null;

		System.out.println(loginInfo);
		
		if(loginInfo.getGroupNum().equals("1")) {
			
		}else if(loginInfo.getGroupNum().contentEquals("2")){
			seInfo = new MenubarService().selectSeller(loginInfo.getCid());
			System.out.println(seInfo);
		}else {
			adInfo = new MenubarService().selectAdmin(loginInfo.getCid());
			System.out.println(adInfo);
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
