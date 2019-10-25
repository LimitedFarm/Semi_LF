package LF.faq.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;

import com.oreilly.servlet.MultipartRequest;

import LF.common.MyFileRenamePolicy;
import LF.faq.model.vo.Pattachment;
import LF.faq.model.vo.Question;
import LF.member.model.vo.Customer;

/**
 * Servlet implementation class OboInsertServlet
 */
@WebServlet("/Oboinsert.oi")
public class OboInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OboInsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//multipart/form-date로 전송  lib에 cos.jar 파일 필요
		
		//enctype이 multipart/form date로 전송되었는지 확인
		if(ServletFileUpload.isMultipartContent(request)) {
			
			//1-1 전송파일 용량을 제한 
			
			int maxSize = 1024 * 1024 * 8; //바이트 단위 (바이트 > 키로바이트 > 메가바이트)
			
			String root = request.getSession().getServletContext().getRealPath("/"); //넘어오는 파일경로
			System.out.println("파일경로 : " + root);
			
			//파일경로 저장(web/OboUploadFile/)
			String savePath = root + "OboUploadFile/";
			
			MultipartRequest multiRequest = new MultipartRequest(request, savePath, maxSize, "UTF-8", new MyFileRenamePolicy());
			
			//다중 파일을 묶어서 업로드하기때문에 컬렌셕을 이용 파일 이름을 저장할 ArrayList 생성
			ArrayList<String> change_name = new ArrayList<String>();
	
			//원본 파일 이름을 저장할 ArrayList 
			ArrayList<String> file_name = new ArrayList<String>();
			
			//getFileNames() 폼에서 전송된 파일리스트들의 name을 반환
			Enumeration<String> files = multiRequest.getFileNames();
			while(files.hasMoreElements()) {
				
				//전송순서 역순으로 파일을 가져온다.
				String name = files.nextElement();
				
				if(multiRequest.getFilesystemName(name) != null) {
					change_name.add(multiRequest.getFilesystemName(name));
				
					file_name.add(multiRequest.getOriginalFileName(name));
				}
				
			}
		
			//파일 외 문의 제목 , 내용 , cid 등등 받아오기
			
			String InquiryType = multiRequest.getParameter("inquiryType");
			
			//이메일 받아와서 합치기
			if(multiRequest.getParameter("selfdomain") == null) {
				String Email = multiRequest.getParameter("emailId") + "@" + multiRequest.getParameter("sampledomin");
			}else {
				String Email = multiRequest.getParameter("emailId") + "@" + multiRequest.getParameter("selfdomain");
			}
			//SMS 자동발송용으로 넘겨왓는데 api가 유료 ㅠ
			String Phone = multiRequest.getParameter("firPnum") + multiRequest.getParameter("midPnum") + multiRequest.getParameter("endPnum");
			
			String Title = multiRequest.getParameter("title");
			
			String Content = multiRequest.getParameter("content");
			
			String Qwriter = String.valueOf(((Customer)request.getAttribute("loginUser")).getCid());
			
			//Question 객체만들기
			
			Question q = new Question();
			
			q.setcId(Qwriter);
			q.setqTitle(Title);
			q.setqContent(Content);
			q.setInquirytype(Integer.valueOf(InquiryType));
			
			ArrayList<Pattachment> fileList = new ArrayList<Pattachment>();
		
			for(int i = file_name.size()-1 ; i>=0;i--) {
				Pattachment pa = new Pattachment();
				pa.setFilePath(savePath);
				pa.setFileName(file_name.get(i));
				pa.setFileName(change_name.get(i));
				
				fileList.add(pa);
			}
			
			
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
