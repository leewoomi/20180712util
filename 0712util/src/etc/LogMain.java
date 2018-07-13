package etc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LogMain {

	public static void main(String[] args) {
		// log file의 내용을 읽을 수 있는 Scanner 만들기
		File f = new File("C:\\이우미\\자바_C\\자바\\log.txt");
		HashSet<String> set = new HashSet<String>();
		try {
			Scanner sc = new Scanner(f);
			// 합계를 저장할 변수

			int sum = 0;
			while (sc.hasNextLine()) {
				String temp = sc.nextLine();
				// 공백으로 분할
				String[] ar = temp.split(" ");
				//10번째 데이터 확인
				//set.add(ar[9]);
				//10번째 문자열을 정수로 변환해서 sum에 더하기
				sum = sum+Integer.parseInt(ar[9]);
				

			}
			System.out.println("트래픽 합계:"+sum);
			//System.out.println(set);
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
