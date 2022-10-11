package mms.member.dao;
import static  mms.member.db.JdbcUtil.close;
import mms.member.vo.Member;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDAO {
	Connection con;
	
	public MemberDAO(Connection con) {
		this.con = con;
	}
	
	public int insertMember(Member newMember) {
		int insertCount = 0;
		
		PreparedStatement pstmt = null;  //sql 패키지에서 제공하는 것
		String sql = "insert into member values(member_id_seq.nextval, ?, ?, ?, ?, ?)";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1,  newMember.getName());
			pstmt.setString(2,  newMember.getAddr());
			pstmt.setString(3,  newMember.getNation());
			pstmt.setString(4,  newMember.getEmail());
			pstmt.setInt(5,  newMember.getAge());
			insertCount = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		return insertCount;
	}// insertMember()
	
	public ArrayList<Member> selectMemberList(){
		ArrayList<Member> memberList = null;
		PreparedStatement pstmt = null;
		String sql = "select * from member";
		ResultSet rs = null;
		try {
			pstmt = con.prepareStatement(sql);
			rs= pstmt.executeQuery();
			memberList = new ArrayList<Member>();
			while(rs.next()) {
				Member member = new Member(rs.getInt("id"),rs.getString("name"), rs.getString("addr"), rs.getString("nation"), rs.getString("email"), rs.getInt("age"));
				memberList.add(member);	
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(rs);
			close(pstmt);
		}
		return memberList;
	}// selectMemberList()
	
	public Member selectOldMember(String name) {
		Member oldMember = null;
		PreparedStatement pstmt = null;
		String sql = "select * from member where name=?";
		ResultSet rs = null;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, name);
			rs= pstmt.executeQuery();
			if(rs.next()) {
				oldMember = new Member(rs.getInt("id"),rs.getString("name"), rs.getString("addr"), rs.getString("nation"), rs.getString("email"), rs.getInt("age"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(rs);
			close(pstmt);
		}
		
		return oldMember;
	}//selectOldMember()
	
//	update member set addr = '서울시', nation ='미국', email ='hdg@naver.com', age ='20' where name ='홍길동';
	public int updateMember(Member updateMember) {
		int updateCount = 0;
		PreparedStatement pstmt = null;  //sql 패키지에서 제공하는 것
		String sql = "update member set addr =?, nation =?, email =?, age =? where name =?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1,  updateMember.getAddr());
			pstmt.setString(2, updateMember.getNation());
			pstmt.setString(3,  updateMember.getEmail());
			pstmt.setInt(4,  updateMember.getAge());
			pstmt.setString(5,  updateMember.getName());
			updateCount = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		return updateCount;
	}//updateMember()
	
	public int deleteMember(String name) {
		
		int deleteCount = 0;
		PreparedStatement pstmt = null;  //sql 패키지에서 제공하는 것
		String sql = "delete member where name=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, name);
			deleteCount = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		return deleteCount;
	}//deleteMember()
	
}//MemberDAO
