package mms.member.svc;

import static mms.member.db.JdbcUtil.*;

import java.sql.Connection;
import java.util.ArrayList;

import mms.member.dao.MemberDAO;
import mms.member.vo.Member;

public class MemberListService {
	public ArrayList<Member> getMemberList(){
		Connection con = getConnection(); 
		MemberDAO dao = new MemberDAO(con);
		ArrayList<Member> memberList = dao.selectMemberList();
		close(con);
		
		return memberList;
	}
}
