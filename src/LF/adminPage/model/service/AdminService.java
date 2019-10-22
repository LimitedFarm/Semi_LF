package LF.adminPage.model.service;


import static LF.common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.ArrayList;

import LF.adminPage.model.dao.AdminDao;
import LF.adminPage.model.vo.CReportList;
import LF.member.model.vo.Customer;
import LF.member.model.vo.Seller;
public class AdminService {
	
	public AdminService() {}

	public int getCuListCount() {
		Connection conn = getConnection();
		
		int result = new AdminDao().getCuListCount(conn);
		
		close(conn);
		
		return result;
	}

	public ArrayList<Customer> selectCustomer(int currentPage, int limit) {
		Connection conn = getConnection();
		
		ArrayList<Customer> cuInfo = new AdminDao().selectCustomer(conn, currentPage, limit);
		
		close(conn);
		
		return cuInfo;
	}

	public Customer searchCustomer(String searchId) {
		Connection conn = getConnection();
		
		Customer searchCu = new AdminDao().searchCustomer(conn, searchId);
		
		close(conn);
		
		return searchCu;
	}
	
	// 판매자 정보 찾기
	public ArrayList<Seller> selectSeller(int currentPage, int limit) {
		Connection conn = getConnection();
		
		ArrayList<Seller> seInfo = new AdminDao().selectSeller(conn, currentPage, limit);
		
		close(conn);
		
		return seInfo;
	}

	public int getSeListCount() {
		Connection conn = getConnection();
		
		int result = new AdminDao().getSeListCount(conn);
		
		close(conn);
		
		return result;
	}

	public Seller searchSeller(String searchbName) {
		Connection conn = getConnection();
		
		Seller seInfo = new AdminDao().searchSeller(conn, searchbName);
		
		close(conn);
		
		return seInfo;
	}

	public int updateSellerAuth(int sid, String bStatus) {
		Connection conn = getConnection();
		
		int result = new AdminDao().updateSellerAuth(conn, sid, bStatus);
		
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		
		close(conn);
		
		return result;
	}

	public ArrayList<CReportList> selectcReport(int currentPage, int limit) {
		Connection conn = getConnection();
		
		ArrayList<CReportList> crInfo = new AdminDao().selectcReport(conn, currentPage, limit);
		
		close(conn);
		
		return crInfo;
	}

	public int crCount() {
		Connection conn = getConnection();
		
		int result = new AdminDao().getCReportCount(conn);
		
		return result;
	}
	
	
	
}
