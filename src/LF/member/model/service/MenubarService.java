package LF.member.model.service;

import static LF.common.JDBCTemplate.*;

import java.sql.Connection;

import LF.member.model.dao.MenubarDao;
import LF.member.model.vo.Admin;
import LF.member.model.vo.Customer;
import LF.member.model.vo.Seller;

public class MenubarService {
	
	public MenubarService() {}

	public Customer selectLoginDate(String userId, String userPwd) {
		Connection conn = getConnection();
		
		Customer cuInfo = new MenubarDao().selectCustomer(conn, userId, userPwd);
		
		
		close(conn);
		
		return cuInfo;
	}

	public Seller selectSeller(int cid) {
		Connection conn = getConnection();
		
		Seller seInfo = new MenubarDao().selectSeller(conn, cid);
		
		close(conn);
		
		return seInfo;
	}

	public Admin selectAdmin(int cid) {
		Connection conn = getConnection();
		
		Admin adInfo = new MenubarDao().selectAdmin(conn, cid);
		
		close(conn);
		
		return adInfo;
	}
	
	
}
