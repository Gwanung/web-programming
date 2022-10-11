package mms.member.action;

import java.util.Scanner;

import mms.member.svc.MemberModifyService;
import mms.member.util.ConsoleUtil;
import mms.member.vo.Member;

public class MemberModifyAction implements Action{

	@Override
	public void execute(Scanner sc) throws Exception {
		ConsoleUtil cu = new ConsoleUtil();
		String name = cu.getName("수정할", sc);
		MemberModifyService service = new MemberModifyService();
		Member member = service.getOldMember(name);
		Member updateMember = cu.getUpdateMember(sc, member);
		
		boolean isModifySuccess = service.modifyMember(updateMember);
		if(isModifySuccess)
			cu.printAddSuccessMessage(updateMember);
		else
			cu.printModifyFailMessage(updateMember);
	}
	
}
