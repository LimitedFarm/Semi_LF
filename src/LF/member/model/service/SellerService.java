package LF.member.model.service;

import java.sql.Connection;
import java.util.ArrayList;

import LF.product.model.vo.pAttachment;
import LF.member.model.dao.SellerDao;
import LF.member.model.vo.Seller;
import static LF.common.JDBCTemplate.*;

public class SellerService {

	public int registSeller(Seller seller, ArrayList<pAttachment> fileList) {
		
		Connection conn = getConnection();
		
		SellerDao sDao = new SellerDao();
		System.out.println("service1");
		int result1 = sDao.registImage(conn, fileList);
		
		if(result1>0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		System.out.println("service2");
		ArrayList<pAttachment> list = sDao.getFid(conn, fileList);
		
		close(conn);
		
		
		Connection conn2 = getConnection();
		
		System.out.println("service3");
		int result2 = sDao.registSeller(conn2, seller);
		
		
		System.out.println("service4");
		
		int result = 0;
		
		if(result2>0) {
			commit(conn2);
			result =1;
		}else {
			rollback(conn2);
		}
		
		System.out.println("service5");
		close(conn2);
		System.out.println("service6");

		return result;
	}

	public int updateSeller(Seller seller) {
		Connection conn = getConnection();
		
		int result = new SellerDao().updateSeller(conn, seller);
		
		if(result > 0)
			commit(conn);
		else
			rollback(conn);
		
		close(conn);
		
		return result;
	}

}
