package kh.s13.palette.review.model.vo;

import java.util.List;

public class ProductReviewVo {
	
//	RNO      NOT NULL NUMBER              
//	PID      NOT NULL VARCHAR2(100)       
//	MID      NOT NULL VARCHAR2(50)        
//	RCONTENT NOT NULL VARCHAR2(2000 CHAR) 
//	RDATE             TIMESTAMP(6)  
	
	private int rno;
	private String mname;
	private String mname2;
	private String pname;
	private String rcontent;
	private String rdate;
	
	private List<String> rfilepath;

	
	
	
	public ProductReviewVo() {
		super();
	}
	public ProductReviewVo(int rno, String mname, String mname2, String pname, String rcontent, String rdate,
			List<String> rfilepath) {
		super();
		this.rno = rno;
		this.mname = mname;
		this.mname2 = mname2;
		this.pname = pname;
		this.rcontent = rcontent;
		this.rdate = rdate;
		this.rfilepath = rfilepath;
	}
	@Override
	public String toString() {
		return "ProductReviewVo [rno=" + rno + ", mname=" + mname + ", mname2=" + mname2 + ", pname=" + pname
				+ ", rcontent=" + rcontent + ", rdate=" + rdate + ", rfilepath=" + rfilepath + "]";
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getMname2() {
		return mname2;
	}
	public void setMname2(String mname2) {
		this.mname2 = mname2;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getRcontent() {
		return rcontent;
	}
	public void setRcontent(String rcontent) {
		this.rcontent = rcontent;
	}
	public String getRdate() {
		return rdate;
	}
	public void setRdate(String rdate) {
		this.rdate = rdate;
	}
	public List<String> getRfilepath() {
		return rfilepath;
	}
	public void setRfilepath(List<String> rfilepath) {
		this.rfilepath = rfilepath;
	}
		
	
}
