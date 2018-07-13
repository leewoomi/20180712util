package random;

import java.util.ArrayList;
import java.util.Random;

public class SlotMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list = new ArrayList<>();
		list.add("!");
		list.add("@");
		list.add("#");
		list.add("$");
		list.add("%");
		list.add("^");
		list.add("&");
		list.add("*");
		// 자주 나오게 하고 싶은 것은 추가해 준다.
		list.add("!");
		list.add("@");
		list.add("#");

		String slot = "";
		Random r = new Random();
		// list에 있는 모양 3개를 랜덤하게 추출해서 slot에 추가
		for (int i = 0; i < 3; i++) {
			slot = slot + list.get(r.nextInt(list.size()));
		}
		System.out.println(slot);
		// 3개의 문자가 동일한지 확인
		char slot1= slot.charAt(0);
		char slot2= slot.charAt(1);
		char slot3= slot.charAt(2);
		if(slot1 == slot2 && slot2 ==slot3) {
			System.out.println("축하합니다!!!!!");
		}
		// 앞에 2개 문자만 동일한지 확인
		else if(slot1 == slot2) {
			System.out.println("2등 입니다.");
		}
		// 기 이외의 경우
		else {
			System.out.println("꽝");
		}

	}

}
