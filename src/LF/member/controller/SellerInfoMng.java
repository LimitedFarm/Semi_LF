package LF.member.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import LF.member.model.service.SellerService;
import LF.product.model.vo.pAttachment;

/**
 * Servlet implementation class SellerInfoMng
 */
@WebServlet("/sellerInfoMng.selr")
public class SellerInfoMng extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SellerInfoMng() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int fid = Integer.valueOf(request.getParameter("fid"));
		SellerService pService = new SellerService();
			
		// 2. 해당 게시판의 사진들 리스트 조회!
		
		pAttachment image = pService.selectImage(fid);
			
			
		if(image != null) {
			HttpSession session = request.getSession();
			session.setAttribute("image",  image);
			request.getRequestDispatcher("views/seller/SellerInfo.jsp").forward(request, response);
					System.out.println("image Servlet : " + image);
		}else {
						request.setAttribute("msg", "사진게시판 상세보기 실패!");
						request.getRequestDispatcher("views/common/errorPage.jsp").forward(request, response);
						
					}
					
					//thumbnailDetailView.jsp 생성하기
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
