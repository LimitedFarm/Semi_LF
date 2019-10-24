package LF.member.model.service;

import java.sql.Connection;
import java.util.ArrayList;

import LF.product.model.vo.pAttachment;
import LF.member.model.dao.MenubarDao;
import LF.member.model.dao.SellerDao;
import LF.member.model.vo.Seller;
import static LF.common.JDBCTemplate.*;

public class SellerService {

	public int registSeller(Seller seller, ArrayList<pAttachment> fileList) {
		
		Connection conn = getConnection();
		SellerDao sDao = new SellerDao();
		int result1 = sDao.registSeller(conn, seller);
		
		if(result1>0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		
		close(conn);
		
		Connection conn2 = getConnection();
		int result2 = sDao.registImage(conn2, fileList, seller);

		if(result2>0) {
			commit(conn2);
		}else {
			rollback(conn2);
		}
		close(conn2);
		
		return result2;
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


	public Seller selectSeller(int sid) {
		Connection conn = getConnection();
		
		Seller seInfo = new SellerDao().selectSeller(conn, sid);
		
		close(conn);
		
		return seInfo;
	}

}
