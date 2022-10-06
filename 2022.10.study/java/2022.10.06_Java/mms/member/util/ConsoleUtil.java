package mms.member.util;

import java.util.ArrayList;
import java.util.Scanner;
import mms.member.vo.Member;

public class ConsoleUtil {
		public Member getNewMember(Scanner sc) {
			
			System.out.println("등록할 회원 정보를 입력하세요");
			
			System.out.print("이름 :  ");
			String name = sc.next();
			
			System.out.print("주소 : ");
			String addr = sc.next();
			
			System.out.println("국가 : ");
			String nation = sc.next();
			
			System.out.print("이메일 :  ");
			String email = sc.next();
			
			System.out.print("나이 :  ");
			int age = sc.nextInt();
			
			return new Member(name, addr, nation, email, age);
		}//getNewMember
		
		public void printAddSuccessMessage(Member newMember) {
			System.out.println(newMember.getName() + "회원 정보 추가 성공");
		}
		
		public void printAddFailMessage(Member newMember) {
			System.out.println(newMember.getName() + "회원 정보 추가 실패");
		}
		
		public void printMemberList(ArrayList<Member> memberList) {
			for(int i=0; i<memberList.size(); i++) {
				System.out.println(memberList.get(i));	
			}
		}
}//ConsoleUtil	
