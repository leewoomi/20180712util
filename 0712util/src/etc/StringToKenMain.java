package etc;

import java.util.StringTokenizer;

public class StringToKenMain {

	public static void main(String[] args) {
		String msg = "I'm woomi";
		String data = "90,30,20,60";

		// msg를 공백단위로 분할해서 출력
		// 1. split 메소드 이용
		String[] ar = msg.split(" ");
		for (String token : ar) {
			System.out.println(token);
		}
		System.out.println("-------------------");
		//2. StringTokenizer 
		StringTokenizer st = new StringTokenizer(msg, " ");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextElement());
		}

		// data를 단위로 분할해서 합계를 구하라
	
		String [] arr = data.split(",");
		int sum = 0;
		for (String dat : arr) {
			System.out.println(dat);
			sum = sum + Integer.parseInt(dat);
		}
		System.out.println("합계 : "+ sum);
	
	}

}
