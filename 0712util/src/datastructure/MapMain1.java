package datastructure;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class MapMain1 {

	public static void main(String[] args) {
		// LinkedHashMap - 순서대로
		// LinkedHashMap<String, Object> map = new LinkedHashMap<>();
		// TreeMap - 가나다 , ABC 한글이 마지막 !
		TreeMap<String, Object> map = new TreeMap<>();
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		map.put("name", name);
		map.put("나이", 24);
		map.put("School", "동서울대");

		// 전체를 한번에 출력 -toString이 재정의 되어 있음
		System.out.println(map);
		// 순서 상관 없이 항목별로 출력
		System.out.println("-----------------------------------");
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println(key + ":" + map.get(key));
		}

	}
}
