package etc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerMain {

	public static void main(String[] args) {
		// 키보드로부터 한 줄을 입력받아서 출력
		Scanner sc = new Scanner(System.in);

		System.out.println("이름 입력 : ");
		// 한 줄을 입력받는 객체
		String msg = sc.nextLine();
		System.out.println(msg);

		// 공백 단위로 구분해서 입력받기
		System.out.println("이름 입력 : ");
		String str = sc.next();
		System.out.println(str);

		// 스캐너를 사용하면 마지막에 닫아 주어야 함.
		sc.close();

		// 문자열로 부터 받기
		sc = new Scanner("Hello Java !!!!");
		// System.out.println(sc.next());
		System.out.println(sc.next());

		// File 객체 만들기
		File f = new File("C:\\Users\\503-08\\Desktop\\test.txt");
		try {
			sc = new Scanner(f);
		while(sc.hasNext()) {
			System.out.println(sc.next());
		}
		sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
