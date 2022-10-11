package mms.member.action;

import java.util.Scanner;

import mms.member.svc.MemberRemoveService;
import mms.member.util.ConsoleUtil;

public class MemberRemoveAction implements Action{

	@Override
	public void execute(Scanner sc) throws Exception {
		ConsoleUtil cu = new ConsoleUtil();
		String name = cu.getName("삭제할", sc);
		MemberRemoveService service = new MemberRemoveService();
		boolean removeSuccess = service.removeMember(name);
		
		if(removeSuccess)
			cu.printRemoveSuccessMessage(name);
		else
			cu.printRemoveFailMessage(name);
	}

}
