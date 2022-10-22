package mvc.model;

import java.util.ArrayList;

public class MemberDAO {
	private static MemberDAO instance;
	
	public MemberDAO() {
	}

	public static MemberDAO getInstance() {
		if(instance == null)
			instance = new MemberDAO();
		
		return instance;
	}
	
	public ArrayList<MemberDAO> getMemberList()
}
