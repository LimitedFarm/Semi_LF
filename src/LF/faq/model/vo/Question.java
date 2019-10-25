package LF.faq.model.vo;

import java.io.Serializable;
import java.sql.Date;

public class Question implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5125197934127788563L;
	
	private int qId; 		//1:1문의사항 시퀀스 번호
	private String cId;		//질문자 
	private String qTitle; 	//문의 제목
	private String qContent; //문의내용
	private Date qDate;		//문의 일자
	private String Status; //문의 상태
	private String fId;		//파일 번호
	private int Inquirytype; //질문 타입
	
	//int cId와 fId는 조인한 결과값을 담기위해 string으로 
	
	public Question() {}

	public Question(int qId, String cId, String qTitle, String qContent, Date qDate, String status, String fId,
			int inquirytype) {
		this.qId = qId;
		this.cId = cId;
		this.qTitle = qTitle;
		this.qContent = qContent;
		this.qDate = qDate;
		Status = status;
		this.fId = fId;
		Inquirytype = inquirytype;
	}

	public int getqId() {
		return qId;
	}

	public void setqId(int qId) {
		this.qId = qId;
	}

	public String getcId() {
		return cId;
	}

	public void setcId(String cId) {
		this.cId = cId;
	}

	public String getqTitle() {
		return qTitle;
	}

	public void setqTitle(String qTitle) {
		this.qTitle = qTitle;
	}

	public String getqContent() {
		return qContent;
	}

	public void setqContent(String qContent) {
		this.qContent = qContent;
	}

	public Date getqDate() {
		return qDate;
	}

	public void setqDate(Date qDate) {
		this.qDate = qDate;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public String getfId() {
		return fId;
	}

	public void setfId(String fId) {
		this.fId = fId;
	}

	public int getInquirytype() {
		return Inquirytype;
	}

	public void setInquirytype(int inquirytype) {
		Inquirytype = inquirytype;
	}

	@Override
	public String toString() {
		return "Question [qId=" + qId + ", cId=" + cId + ", qTitle=" + qTitle + ", qContent=" + qContent + ", qDate="
				+ qDate + ", Status=" + Status + ", fId=" + fId + ", Inquirytype=" + Inquirytype + "]";
	}
	
	
}
