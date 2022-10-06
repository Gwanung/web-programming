package mms.member.controller;
import java.util.Scanner;

import mms.member.action.Action;
public class MemberController {
	public void processRequest(Action action, Scanner sc) {
		try {
			action.execut(sc);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
