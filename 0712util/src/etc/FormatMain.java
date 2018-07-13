package etc;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date date = new Date();
		int money = 2323000;
		// 0000년 00월 00일 요일 00시 00분 00초 형식으로
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 EEE a hh:mm:ss");
		String msg = sdf.format(date);
		System.out.println(msg);
		// 2,323,000로 출력
		DecimalFormat dcf = new DecimalFormat("\u00A4 #,##0");
		msg = dcf.format(money);
		System.out.println(msg);

	}

}
