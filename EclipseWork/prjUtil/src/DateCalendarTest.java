import java.util.Calendar;
import java.util.Date;

public class DateCalendarTest {
	public static void main(String[] args) {
		// TODO Date클래스와 Calendar클래스의 차이점
		
		//********* Date클래스
		Date date = new Date();
		System.out.println(date);
		System.out.println(new Date());
		System.out.println(new Date().toString());
		
		DateCalendarTest test = new DateCalendarTest();
		System.out.println(test.toString());
		
		//********* Calendar클래스
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1);
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.HOUR));
	}
}
