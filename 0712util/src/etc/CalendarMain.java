package etc;

import java.util.Calendar;
import java.util.Date;

public class CalendarMain {

	public static void main(String[] args) {
		//1995.11.14
		Calendar BDay = Calendar.getInstance();
	
		BDay.set(Calendar.YEAR, 1995);
		BDay.set(Calendar.MONTH,10);
		BDay.set(Calendar.DAY_OF_MONTH, 14);
		//System.out.println(BDay);
		//Date date = new Date(BDay.getTimeInMillis());
		//System.out.println(date);
	
		Calendar toDay = Calendar.getInstance();
		long gap = toDay .getTimeInMillis() - BDay.getTimeInMillis();
		System.out.println("태어난지 "+ gap/24/60/60/1000+"일 지남");

	}

}
