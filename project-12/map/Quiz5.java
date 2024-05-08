package map;

import java.util.Collection;
import java.util.HashMap;

public class Quiz5 {

	public static void main(String[] args) {
		MemberHashMap memberHashMap = new MemberHashMap();
		
		System.out.println("memberHashMap을 생성하고 4명의 회원을 추가하세요!");
		memberHashMap.addMember(new Member(1001, "둘리"));
		memberHashMap.addMember(new Member(1002, "또치"));
		memberHashMap.addMember(new Member(1003, "도우너"));
		memberHashMap.addMember(new Member(1004, "고길동"));
		
		memberHashMap.showAllMember();
		
		System.out.println();
		
		System.out.println("memberHashMap에 1004번 회원이 있으면 삭제하세요!");
		memberHashMap.removeMember(1004);
		memberHashMap.showAllMember();
		

	}

}

class MemberHashMap {
//	HashMap< Integer, Member> map = new HashMap<>();
	HashMap< Integer, Member> map; // map선언
	
	public MemberHashMap() {
		map = new HashMap<>();
	}
	
	void addMember(Member member) {
		map.put(member.memberId, member);
	}
	
	void removeMember(int memberId) {
		
		// 해당 아이디가 존재하면 삭제하고 메소드 종료
		if (map.containsKey(memberId)) {
			map.remove(memberId);
			System.out.println(memberId+"번 회원을 삭제하였습니다");
			return;
			}
		// 없으면 에러메세지 출력
		System.out.println(memberId+"번 회원이 존재하지 않습니다");
	}
	
	void showAllMember( ) {
//		for(int key: map.keySet()) {
//			System.out.println(map.get(key).toString());
//		}
//		
		Collection<Member> values = map.values(); // set으로 쓸수있는건 collection으로도 사용가능
		for (Member member : values) {
			System.out.println(member);
		}
	}
}
