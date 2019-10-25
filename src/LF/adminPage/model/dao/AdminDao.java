package LF.adminPage.model.dao;

import static LF.common.JDBCTemplate.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;

import LF.adminPage.model.vo.CReportList;
import LF.member.model.vo.Customer;
import LF.member.model.vo.Seller;

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
						rs.getString("address2"),
						rs.getString("address3"),
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
										rs.getString("address2"),
										rs.getString("address3"),
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

	public ArrayList<Seller> selectSeller(Connection conn, int currentPage, int limit) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<Seller> seInfo = new ArrayList();
		String query = prop.getProperty("selectSeller");
		
		int startRow = (currentPage-1)*limit +1;	
		int endRow = startRow + limit -1;
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, startRow);
			pstmt.setInt(2, endRow);
			rs = pstmt.executeQuery();
			
			
			while(rs.next()) {
				Seller s = new Seller(rs.getInt("sid"),
									rs.getString("bstatus"),
									rs.getString("bName"),
									rs.getString("bNum"),
									rs.getString("cpNum"),
									rs.getString("acNum"),
									rs.getString("acName"),
									rs.getString("bankName"),
									rs.getDate("sJoinDate"),
									rs.getDate("sModifyDate"),
									rs.getInt("cid"),
									rs.getInt("fid"));
				
				seInfo.add(s);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
			close(rs);
		}
		
		return seInfo;
	}

	public int getSeListCount(Connection conn) {
		Statement stmt = null;
		ResultSet rs = null;
		int result =0;
		
		String query = prop.getProperty("getSeListCount");
		
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

	public Seller searchSeller(Connection conn, String searchbName) {
		PreparedStatement pstmt = null;
		ResultSet rs= null;
		Seller seInfo = null;
		String query = prop.getProperty("searchSeller");
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, searchbName);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				seInfo = new Seller(rs.getInt("sid"),
						rs.getString("bstatus"),
						rs.getString("bName"),
						rs.getString("bNum"),
						rs.getString("cpNum"),
						rs.getString("acNum"),
						rs.getString("acName"),
						rs.getString("bankName"),
						rs.getDate("sJoinDate"),
						rs.getDate("sModifyDate"),
						rs.getInt("cid"),
						rs.getInt("fid"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rs);
		}
		
		return seInfo;
	}

	public int updateSellerAuth(Connection conn, int sid, String bStatus) {
		PreparedStatement pstmt = null;
		int result = 0;
		String query = prop.getProperty("updateSellerAuth");
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, bStatus);
			pstmt.setInt(2, sid);
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}

	public ArrayList<CReportList> selectcReport(Connection conn, int currentPage, int limit) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<CReportList> crInfo = new ArrayList();
		String query = prop.getProperty("selectcReport");
		
		int startRow = (currentPage-1)*limit +1;	
		int endRow = startRow + limit -1;
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, startRow);
			pstmt.setInt(2, endRow);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				CReportList sr = new CReportList(rs.getInt("crid"),
												rs.getInt("cid"),
												rs.getString("noContent"),
												rs.getDate("report_date"),
												rs.getString("status"),
												rs.getInt("sale_id"),
												rs.getString("userid"),
												rs.getString("pname"));
				crInfo.add(sr);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rs);			
		}

		return crInfo;
	}

	public int getCReportCount(Connection conn) {
		Statement stmt = null;
		ResultSet rs = null;
		int result = 0;
		String query = prop.getProperty("getCReportCount");
		
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
	
}
