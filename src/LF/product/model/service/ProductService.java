package LF.product.model.service;

import static LF.common.JDBCTemplate.close;
import static LF.common.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.util.ArrayList;

import LF.product.model.dao.ProductDao;
import LF.product.model.vo.pList;

public class ProductService {

	public int getListCount(int sid) {
		Connection conn = getConnection();
		
		int listCount = new ProductDao().getListCount(conn, sid);
		
		close(conn);
		
		return listCount;
	}

	public static ArrayList<pList> selectList(int currentPage, int limit, int sid) {
		Connection conn = getConnection();
		
		ArrayList<pList> list = new ProductDao().selectList(conn, currentPage, limit, sid);
		
		close(conn);
		
		return list;
	}

}
