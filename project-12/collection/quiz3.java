package collection;

import java.util.ArrayList;

public class quiz3 {

	public static void main(String[] args) {
		
		System.out.println("MemberArrayList를 생성하고 4명의 회원을 추가하세요!");
//		MemberArrayList<Member> list = new MemberArrayList<Member>();
		
		MemberArrayList list = new MemberArrayList();
		list.addMember(new Member(1001,"둘리"));
		list.addMember(new Member(1002,"또치"));
		list.addMember(new Member(1003,"도우너"));
		list.addMember(new Member(1004,"고길동"));
		list.showAllMember();
		
		System.out.println();
		System.out.println("MemberArrayList에 1004번 회원이 있으며 삭제하세요!");
		list.removeMember(1004);
		list.showAllMember();

	}

}
// 회원 관리 클래스
class MemberArrayList{
//	private ArrayList<Member> list = new ArrayList<>();
	// 회원 목록
	ArrayList<Member> list; // 리스트 선언
	
	public MemberArrayList() {
		list = new ArrayList<Member>(); // 리스트 생성 생성자를 호출하는 시점에 리스트를 생성해야함
	}

	void addMember(Member member) {
		list.add(member);
	}
	
	public void removeMember(int memberId) {
		
		for(int i = 0; i < list.size(); i++) {
			
//			Member member = list.get(i);
//			int id = member.memberID;
//			
//			if (id == memberId) {
//				list.remove(i);
//				System.out.println(memberId+"번 회원을 삭제하였습니다.");
//				return ;
//			}
			
			if (list.get(i).memberID == memberId) {
				list.remove(i);
				System.out.println(memberId+"번 회원을 삭제하였습니다.");
				return ;
				}
		}
		System.out.println(memberId+"번 회원이 존재하지 않습니다.");
	}
	
	void showAllMember() {
		for(int i = 0; i < list.size(); i++) {
			System.out.println("Menber [memberID=" + list.get(i).memberID + ", memberName=" +  list.get(i).memberName + "]");
		}
	}
}