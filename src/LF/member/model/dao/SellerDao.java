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

	
	

	public int registImage(Connection conn, ArrayList<pAttachment> fileList) {
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = prop.getProperty("insertpAttachment");
		System.out.println("registImage1");
		try {
			for(int i=0; i<fileList.size();i++) {
				pAttachment at = fileList.get(i);
				pstmt=conn.prepareStatement(query);
				pstmt.setString(1, at.getFileName());
				pstmt.setString(2, at.getChangeName());
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





	public ArrayList<pAttachment> getFid(Connection conn, ArrayList<pAttachment> fileList) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		System.out.println("getfid1");
		String query = prop.getProperty("getfId");
		try {
			for(int i=0; i<fileList.size();i++) {
				pAttachment at = fileList.get(i);
				
				System.out.println(at.getChangeName());
				pstmt=conn.prepareStatement(query);
				pstmt.setString(1, at.getChangeName());
				
				rs=pstmt.executeQuery();
			}
			while(rs.next()) {
				fileList.get(0).setfId(rs.getInt("fid"));
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
			close(rs);
		}
		System.out.println("getfid2");
		return fileList;
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
			pstmt.setInt(8,35);
			
			System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
			System.out.println(seller.getbName());
			System.out.println(seller.getbNum());
			System.out.println(seller.getCpNum());
			System.out.println(seller.getAcNum());
			System.out.println(seller.getAcName());
			System.out.println(seller.getBankName());
			System.out.println(seller.getCid());
			System.out.println(35);
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
	
}
