package random;

import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class LottoMain {

	public static void main(String[] args) {
		// 1부터 45까지의 숫자 6개를 랜덤하게 저장해서 출력
		// 랜덤한 숫자를 얻기 위해 랜덤 인스턴스를 생성

		Random r = new Random();
		TreeSet<Integer> lotto = new TreeSet<>();
	

			
			while (lotto.size() < 6) {
				lotto.add(r.nextInt(45) + 1);
			}
		

		for (int x : lotto) {
			System.out.print(x + "\t");
		}
		System.out.println();

	}

}
