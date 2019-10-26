package LF.member.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
		response.setContentType("text/html;charset=utf-8");
		
		String userId = request.getParameter("loginId");
		String userPwd = request.getParameter("loginPwd");
		// 회원 정보 가져오기
		Customer loginInfo = new MenubarService().selectLoginDate(userId, userPwd);
		Seller seInfo = null;
		Admin adInfo = null;

		System.out.println("loginInfo : " + loginInfo);
		HttpSession session = null;
		if(loginInfo.getGroupNum().equals("1")) {
			session = request.getSession();
			
			session.setAttribute("loginUser", loginInfo);
			// 일반 회원 정보 전달
		}else if(loginInfo.getGroupNum().equals("2")) {
			seInfo = new MenubarService().selectSeller(loginInfo.getCid());
			System.out.println("seInfo : " + seInfo);

			session = request.getSession();
			// 판매자 정보 전달
			session.setAttribute("loginUser", loginInfo);
			session.setAttribute("sellerUser", seInfo);
		}else {
			adInfo = new MenubarService().selectAdmin(loginInfo.getCid());

			session = request.getSession();
			// 어드민 정보 전달
			session.setAttribute("loginUser", loginInfo);
			session.setAttribute("adminUser", adInfo);
		}
		
		
		session.setMaxInactiveInterval(10);
		
		response.sendRedirect("views/common/menubar.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
