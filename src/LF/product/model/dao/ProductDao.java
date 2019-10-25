package LF.product.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import com.sun.org.apache.regexp.internal.recompile;

import LF.product.model.vo.ProductList;
import static LF.common.JDBCTemplate.*;


public class ProductDao {
	private Properties prop = new Properties();
	
	
	
	public ProductDao() {
	
		String fileName = ProductDao.class.getResource("/LF/sql/productlist/productlist-query.properties").getPath();
	
			try {
				prop.load(new FileReader(fileName));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
	}



	public ArrayList<ProductList> selectList(Connection conn) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<ProductList> plist = new ArrayList();
		
		String query = prop.getProperty("selectpList");
		
		try {
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				ProductList p = new ProductList(rs.getInt("pId"),
												rs.getString("pName"),
												rs.getInt("pPrice"),
												rs.getString("pAdd"),
												rs.getString("fPath"),
												rs.getInt("CateId"));
				plist.add(p);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
			close(rs);
		}
		
		
		
		
		return plist;
	}

}
