package LF.faq.model.service;

import static LF.common.JDBCTemplate.*;


import java.sql.Connection;
import java.util.ArrayList;

import LF.faq.model.dao.FaqDao;
import LF.faq.model.vo.Faq;

public class fService {

	public static ArrayList<Faq> selectfList() {
			Connection conn = getConnection();
			
			ArrayList<Faq> flist = new FaqDao().selectfList(conn);
			
			
			
			close(conn);
			
		return flist;
	}

	public int insertFaq(Faq f) {
		Connection conn = getConnection();
		
		int result = new FaqDao().insertFaq(conn, f);
		
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		
		close(conn);
		
		System.out.println(result);
		
		return result;
	}

}
