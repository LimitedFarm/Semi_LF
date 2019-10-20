package LF.adminPage.model.service;


import static LF.common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.ArrayList;

import LF.adminPage.model.dao.AdminDao;
import LF.member.model.vo.Customer;
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

	public int getSearchIdCount(String searchId) {
		Connection conn = getConnection();
		
		int result = new AdminDao().getSearchIdCount(conn, searchId);
		
		close(conn);
		
		return result;
	}
	
	
	
}
