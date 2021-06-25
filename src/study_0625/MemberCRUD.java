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

	
	
	// 1. SELECT
	public static ArrayList<Member> getMemberList(Connection con) {
		ArrayList<Member> list = new ArrayList<Member>();
		Statement stmt = null;
		ResultSet rs = null;
		
		String sql = "SELECT * FROM MEMBER ORDER BY MemberCode";

		try {
			stmt = con.createStatement();
			// MEMBER 테이블에서 membercode 오름차순으로 가져온다. sql에 대입
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
	
	
	
	// 2. INSERT
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
