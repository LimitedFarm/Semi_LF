package LF.product.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.simple.JSONObject;

import com.google.gson.Gson;

import LF.product.model.service.ProductService;
import LF.product.model.vo.ListObj;
import LF.product.model.vo.pList;

/**
 * Servlet implementation class ProductMngListServlet
 */
@WebServlet("/productMngList.prod")
public class PrMngListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PrMngListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Servlet을 만들면 vo클래스가 필요하다는 생각을 하자!(vo클래스의 객체(request에 담긴 값으로 생성된)를 dao까지 넘길꺼니깐)
		
		//sid 받아주기
		int sid = Integer.valueOf(request.getParameter("sid"));
		
		// 두개의 서비스를 호출할꺼기 때문에 서비스 객체를 참조형 자료형 변수로 담아두자
		ProductService pService = new ProductService();
				
		// 게시판 리스트 갯수 구하기
		int listCount = pService.getListCount(sid);
				
				//-------------페이징 처리 추가----------------
				// 페이지 수 처리용 변수 선언
				int currentPage;	//현재 페이지를 표시할 변수
				int limit;			//한 페이지에 게시글이 몇개가 보여질지와 한 페이지에서 처리가능한 페이지 수
				
				// ex) 총 123개의 게시글이 있다면..
				// 		<<1 2 3 4 5 6 7 8 9 10>> 이후에도 페이지가 더 있어야 한다.
				//		<<11 12 13>>		<--여기서 11이 startPage, 13이 endPage, 13이 maxPage
				
				// * currentPage - 현재 페이지
				// 기본 게시판은 1페이지부터 시작함
				currentPage = 1;	//1 페이지를 default로 가져가자
				// 하지만, 페이지 전환시 전달받은 현재 페이지가 있을 시 해당 페이지를 currentPage로 적용
				if(request.getParameter("currentPage")!=null) {
					currentPage = Integer.parseInt(request.getParameter("currentPage"));
				}
				
				// * limit - 한 페이지에 보여질 목록 갯수
				limit = 5;
//				// 자 위에서 계산된 모든 페이지 관련 변수들을 request에 담아서 보내야 될텐데 너무 많다!
//				// 그래서 페이지 정보를 공유할 vo 객체 PageInfo를 만들러 가자!(page정보만 지닌 객체를 만들어서 넘기기 위해)
				ListObj lo = new ListObj(currentPage,limit,sid);
				
				// 게시판 리스트 조회해오기 (판매글 리스트 조회해오기)
				ArrayList<pList> list = ProductService.selectList(currentPage, limit, sid);
				
				ServletContext context = this.getServletContext();
				RequestDispatcher view = null;
				HttpSession session = request.getSession();
				if(list !=null) {
					view = request.getRequestDispatcher("views/seller/ProductMng.jsp");
					session.setAttribute("list", list);	// 현재 페이지에 화면에 뿌려질 게시글이 담긴 객체
					session.setAttribute("lo", lo); // 페이지에 관련된 정보가 담긴 객체
							
					view.forward(request, response);
				}else {
					view = request.getRequestDispatcher("/views/common/errorPage.jsp");
					request.setAttribute("msg", "게시판 리스트 조회 실패!");
					
					view.forward(request, response);
				}
				
				
				
				//boardListView.jsp 페이지 만들러 ㄱㄱ씽
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
