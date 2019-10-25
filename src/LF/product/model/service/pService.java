package LF.product.model.service;

import static LF.common.JDBCTemplate.close;
import static LF.common.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.util.ArrayList;

import LF.product.model.dao.ProductDao;
import LF.product.model.vo.ProductList;

public class pService {

	public ArrayList<ProductList> selectList() {
			Connection conn = getConnection();
		
			ArrayList<ProductList> plist = new ProductDao().selectList(conn);
			
			close(conn);
		return plist;
	}

}
