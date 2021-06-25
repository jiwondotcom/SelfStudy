package study_0625;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MemberCRUD {
	/*싱글톤 처리*/
	private MemberCRUD() {}
	private static MemberCRUD memberCrud = new MemberCRUD(); 
	public static MemberCRUD getInstance() {
		return memberCrud;
	}

	
	
	// 1. SELECT - 회원 정보
	public static ArrayList<Member> getMemberList(Connection con) {
		ArrayList<Member> list = new ArrayList<Member>();
		Statement stmt = null;
		ResultSet rs = null;
		
		String sql = "SELECT * FROM MEMBER ORDER BY MemberCode";

		try {
			stmt = con.createStatement();
			// MEMBER 테이블에서 memberCode 오름차순으로 가져온다. sql에 대입
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				list.add(new Member(rs.getInt(1), rs.getString(2), rs.getString(3),
						rs.getString(4), rs.getInt(5), rs.getString(6), rs.getString(7)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list; // list 반환
			   }
	
	
	
	// 2. INSERT - 회원 추가
	public Member insertMember(Connection con, Member member) {
		
		PreparedStatement pstmt = null;
		
		String insertSql = "INSERT INTO MEMBER VALUES"
				+ " (MEMBER_CODE_PK.NEXTVAL, ?, ?, ?, ?, ?, ?)";
		// MEMBER 테이블 내에 프라이머리 키(PK)인 memberCode는 시퀀스로 설정
		// 외 다른 컬럼에 차례대로 값을 입력해나간다.
		
		try {
			pstmt = con.prepareStatement(insertSql);
			
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getPassWord());
			pstmt.setString(3, member.getmName());
			pstmt.setInt(4, member.getAge());
			pstmt.setString(5, member.getPhoneNum());
			pstmt.setString(6, member.getEmail());
			
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return member;
	}
	
	
	
	// 3. UPDATE - 회원정보 수정
	public void updateMember(Connection con, Member member) { 

		PreparedStatement pstmt = null;
		
		String updateSql = "UPDATE MEMBER SET ID = ?, PASSWORD = ?, MNAME = ?, AGE = ?, PHONENUM = ?, EMAIL = ?"
				+ "WHERE MEMBERCODE = ?";
		// 멤버코드에 따라 회원정보를 각각 정보를 업데이트한다. (수정한다.)
		
		try {
			pstmt = con.prepareStatement(updateSql);
			
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getPassWord());
			pstmt.setString(3, member.getmName());
			pstmt.setInt(4, member.getAge());
			pstmt.setString(5, member.getPhoneNum());
			pstmt.setString(6, member.getEmail());
			pstmt.setInt(7, member.getMemberCode());
			
			pstmt.executeUpdate();
	
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	// 4. DELETE - 회원 삭제
	public void deleteMember (Connection con, Member member) {
		
		PreparedStatement pstmt = null;
		
		String deleteSql = "DELETE FROM MEMBER WHERE MEMBERCODE = ?";
		
		try {
			pstmt = con.prepareStatement(deleteSql);
			
			pstmt.setInt(1, member.getMemberCode());
			// memberCode가 해당되는 MEMEBER 테이블 내에 데이터를 삭제한다.
		
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
	}
	
}
