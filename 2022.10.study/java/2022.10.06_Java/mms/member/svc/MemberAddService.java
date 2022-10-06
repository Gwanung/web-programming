package mms.member.svc;
import static mms.member.db.JdbcUtil.*;

import java.sql.Connection;

import mms.member.dao.MemberDAO;
import mms.member.vo.Member;
public class MemberAddService {
	public boolean addMember(Member newMember) {
		boolean isInsertSuccess = false;
		Connection con = getConnection(); 
		MemberDAO dao = new MemberDAO(con);
		int insertCount = dao.insertMember(newMember);
		if(insertCount > 0) {
			commit(con);
			isInsertSuccess = true;
		}else {
			rollback(con);
		}
		return isInsertSuccess;
	}
}
