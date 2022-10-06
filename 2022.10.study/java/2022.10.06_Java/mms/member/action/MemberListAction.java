package mms.member.action;

import java.util.ArrayList;
import java.util.Scanner;

import mms.member.svc.MemberListService;
import mms.member.util.ConsoleUtil;
import mms.member.vo.Member;

public class MemberListAction implements Action {

	@Override
	public void execut(Scanner sc) throws Exception {
		ConsoleUtil cu = new ConsoleUtil();
		MemberListService memberListService = new MemberListService();
		memberListService.getMemberList();
		ArrayList<Member> memberList = memberListService.getMemberList();
		cu.printMemberList(memberList);
	}

}
