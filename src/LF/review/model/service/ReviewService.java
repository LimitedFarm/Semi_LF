package LF.review.model.service;

import static LF.common.JDBCTemplate.close;
import static LF.common.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.util.ArrayList;

import LF.review.model.dao.ReviewDao;
import LF.review.model.vo.Review;

public class ReviewService {
	
	public int getListCount(int sid) {
		Connection conn = getConnection();
		System.out.println("SErvice SID : " + sid);
		int listCount = new ReviewDao().getListCount(conn, sid);
		System.out.println("Service listCount : " + listCount);
		close(conn);
		
		return listCount;
	}
	

	public static ArrayList<Review> selectList(int currentPage, int limit, int sid) {
		Connection conn = getConnection();
		
		System.out.println("currentPage, limit , sid : " + currentPage + "," + limit + "," + sid);
		ArrayList<Review> list = new ReviewDao().selectList(conn, currentPage, limit, sid);
		
		System.out.println("list : " + list);
		close(conn);
		
		return list;
	}
}
