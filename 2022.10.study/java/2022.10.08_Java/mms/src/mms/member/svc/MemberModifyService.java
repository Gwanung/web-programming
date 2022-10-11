package mms.member.svc;

import java.sql.Connection;
import static mms.member.db.JdbcUtil.*;

import mms.member.dao.MemberDAO;
import mms.member.vo.Member;

public class MemberModifyService {
	public Member getOldMember(String name) {
		
		Member oldMember = null;
		Connection con = getConnection();
		MemberDAO dao = new MemberDAO(con);
		oldMember = dao.selectOldMember(name);
		close(con);
		return oldMember;
	}
	
	public boolean modifyMember(Member updateMember) {
		
		boolean isModifySuccess = false;
		Connection con = getConnection();
		MemberDAO dao = new MemberDAO(con);
		int updateCount = dao.updateMember(updateMember);
		if(updateCount > 0) {
			isModifySuccess= true;
			commit(con);
		}
		else {
			isModifySuccess=false;
			rollback(con);
		}
		
		return isModifySuccess;
	}
}
