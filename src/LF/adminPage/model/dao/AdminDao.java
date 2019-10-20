package LF.adminPage.model.dao;

import static LF.common.JDBCTemplate.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;

import LF.member.model.vo.Customer;

public class AdminDao {
	Properties prop = new Properties();

	public AdminDao() {
		String fileName = AdminDao.class.getResource("/LF/sql/admin/admin-query.properties").getPath();

		try {
			prop.load(new FileReader(fileName));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public ArrayList<Customer> selectCustomer(Connection conn, int currentPage, int limit) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<Customer> cuInfo = new ArrayList();
		String query = prop.getProperty("selectCustomer");
		
		int startRow = (currentPage-1)*limit +1;	
		int endRow = startRow + limit -1;
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, startRow);
			pstmt.setInt(2, endRow);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Customer customer = new Customer(rs.getInt("cid"),
						rs.getString("userid"),
						rs.getString("userPwd"),
						rs.getString("userName"),
						rs.getString("address"),
						rs.getString("phone"),
						rs.getString("email"),
						rs.getDate("joinDate"),
						rs.getDate("modifyDate"),
						rs.getString("groupNum"),
						rs.getString("status")
						);
				
				cuInfo.add(customer);
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rs);
		}
		
		
		return cuInfo;
	}
	
	// 일반 회원의 리스트 도출
	public int getCuListCount(Connection conn) {
		Statement stmt = null;
		ResultSet rs = null;
		int result =0;
		
		String query = prop.getProperty("getCuListCount");
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			
			if(rs.next()) {
				result = rs.getInt(1);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(stmt);
			close(rs);
		}
		
		
		return result;
	}

	public Customer searchCustomer(Connection conn, String searchId) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Customer searchCu = null;
		String query = prop.getProperty("searchCustomer");
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, searchId);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				searchCu = new Customer(rs.getInt("cid"),
										rs.getString("userid"),
										rs.getString("userPwd"),
										rs.getString("userName"),
										rs.getString("address"),
										rs.getString("phone"),
										rs.getString("email"),
										rs.getDate("joinDate"),
										rs.getDate("modifyDate"),
										rs.getString("groupNum"),
										rs.getString("status")
										);
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rs);
		}
		
		
		return searchCu;
	}

	public int getSearchIdCount(Connection conn, String searchId) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int result =0;
		
		String query = prop.getProperty("getSearchIdCount");
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, searchId);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				result = rs.getInt(1);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rs);
		}
		
		
		return result;
	}
	
}
