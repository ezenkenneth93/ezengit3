package study.jsp.mysite.model;

public class Member {
	private int MemberNo;
	private String MemberName;
	


	public int getMemberNo() {
		return MemberNo;
	}



	public void setMemberNo(int memberNo) {
		MemberNo = memberNo;
	}



	public String getMemberName() {
		return MemberName;
	}



	public void setMemberName(String memberName) {
		MemberName = memberName;
	}



	@Override
	public String toString() {
		return "Member [MemberNo=" + MemberNo + ", MemberName=" + MemberName + "]";
	}



}
