package LF.member.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;
import static LF.common.JDBCTemplate.*;

import LF.product.model.vo.pAttachment;
import LF.member.model.vo.Seller;

public class SellerDao {
	
	private Properties prop = new Properties();
	
	public SellerDao() {
		//항상 seller=query.properties 값 불러오도록 초기셋팅하기
		String fileName = SellerDao.class.getResource("/LF/sql/member/seller-query.properties").getPath();
		
		try {
			prop.load(new FileReader(fileName));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	

	public int registImage(Connection conn, ArrayList<pAttachment> fileList, Seller seller) {
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = prop.getProperty("insertpAttachment");
		System.out.println("registImage1");
		try {
			for(int i=0; i<fileList.size();i++) {
				pAttachment at = fileList.get(i);
				pstmt=conn.prepareStatement(query);
				pstmt.setString(1, at.getFileName());
				pstmt.setString(2, at.getChangeName()+seller.getSid());
				pstmt.setString(3, at.getFilePath());
				
				result += pstmt.executeUpdate();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		System.out.println(result + "regiImage");
		System.out.println("registImage2");
		
		// fileList가 가진 파일 갯수만큼의 행이 모두 insert가 되었다면
		if(result == fileList.size())
			return result;
		else
			return 0;
	}





	
	
	public int registSeller(Connection conn, Seller seller) {
		PreparedStatement pstmt = null;
		int result = 0;
		System.out.println("regiSeller1");
		String query = prop.getProperty("insertSeller");
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, seller.getbName());
			pstmt.setString(2, seller.getbNum());
			pstmt.setString(3, seller.getCpNum());
			pstmt.setString(4, seller.getAcNum());
			pstmt.setString(5, seller.getAcName());
			pstmt.setString(6, seller.getBankName());
			pstmt.setInt(7, seller.getCid());
			
			System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
			System.out.println(seller.getbName());
			System.out.println(seller.getbNum());
			System.out.println(seller.getCpNum());
			System.out.println(seller.getAcNum());
			System.out.println(seller.getAcName());
			System.out.println(seller.getBankName());
			System.out.println(seller.getCid());
			System.out.println("beforeResult");
			
			result += pstmt.executeUpdate();
			System.out.println(result);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		System.out.println("regiSeller2");
		return result;
	}




	public int updateSeller(Connection conn, Seller seller) {
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = prop.getProperty("updateSeller");
		
		try {
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, seller.getBankName() );
			pstmt.setString(2, seller.getAcNum());
			pstmt.setString(3, seller.getAcName());
			pstmt.setInt(4, seller.getSid());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		return result;
	}




	public Seller selectSeller(Connection conn, int sid) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Seller seInfo = new Seller();
		String query = prop.getProperty("selectSeller");
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, sid);
			System.out.println(sid);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				System.out.println("if문");
				seInfo = new Seller(rs.getInt("sid"),
									rs.getString("bStatus"),
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
				System.out.println("seller : " + seInfo);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rs);
		}
		
		return seInfo;

	}

}
