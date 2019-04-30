package study.jsp.mysite.model;

public class Member {
	private int MemberNo;

	public int getMemberNo() {
		return MemberNo;
	}

	public void setMemberNo(int memberNo) {
		MemberNo = memberNo;
	}

	@Override
	public String toString() {
		return "Member [MemberNo=" + MemberNo + "]";
	}
	
}
