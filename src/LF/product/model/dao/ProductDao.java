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

import LF.product.model.vo.pList;

import static LF.common.JDBCTemplate.*;

public class ProductDao {
	Properties prop = new Properties();

	public ProductDao() {
		String fileName = ProductDao.class.getResource("/LF/sql/product/product-query.properties").getPath();
		
		try {
			prop.load(new FileReader(fileName));
		} catch (FileNotFoundException e) {		
			e.printStackTrace();
		} catch (IOException e) {	
			e.printStackTrace();
		}
	}
	public int getListCount(Connection conn, int sid) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		int listCount = 0;
		
		String query = prop.getProperty("getListCount");
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, sid);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				listCount=rs.getInt(1);	// 쿼리에서의 resultSet 컬럼 값(count(*))을 뽑아내서 int listCount에 담음
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
			close(rs);
		}
		return listCount;
	}
	
	public ArrayList<pList> selectList(Connection conn, int currentPage, int limit, int sid) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<pList>list = null;
		
		String query = prop.getProperty("selectList");
		
		// 쿼리문 실행시 조건절에 넣을 변수들(rownum에 대한 조건 시 필요)
		int startRow = (currentPage-1)*limit +1;	//(2-1) * 5 + 1
		// ex) 2page면 시작 번호가 11번일 것이다.
		int endRow = startRow + limit -1;		//(6+5) - 1
		
		try {
			pstmt = conn.prepareStatement(query);
			
			pstmt.setInt(1, sid);
			pstmt.setInt(2, startRow);
			pstmt.setInt(3, endRow); 	// 1은 게시판 타입을 의미함 -> 1=일반게시판, 2=사진게시판
			
			rs=pstmt.executeQuery();
			list = new ArrayList<pList>();	// 컬렉션(ArrayList)는 반드시 기본생성자로 초기화 해놓고 활용하자!!
			
			while(rs.next()) {
				
				pList b = new pList(rs.getInt("pid"),
									rs.getInt("sid"),
									rs.getString("pname"),
									rs.getInt("pprice"),
									rs.getInt("pcount"),
									rs.getString("paddress"),
									rs.getString("pday"),
									rs.getString("pperiod"),
									rs.getString("ptext1"),
									rs.getString("ptext2"),
									rs.getString("ptext3"),
									rs.getString("ptext4"),
									rs.getString("ptext5"),
									rs.getString("pnotice"),
									rs.getString("pdelivery"),
									rs.getDate("crearedate"),
									rs.getDate("pmodifydate"),
									rs.getString("status"),
									rs.getInt("cateid")
						);
				list.add(b);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstmt);
		}

		return list;
	}
	

}
