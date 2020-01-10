import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {

	public static void main(String[] args) {
		Date now = new Date();
		Calendar c = Calendar.getInstance();
		
		System.out.println("현재 시간은 " + c.get(Calendar.HOUR_OF_DAY) +
				"시" + c.get(Calendar.MINUTE) + "분 입니다.");
		
		if(c.get(Calendar.HOUR_OF_DAY) > 4 && c.get(Calendar.HOUR_OF_DAY) < 12) {
			System.out.println("Good Morning");
		}else if(c.get(Calendar.HOUR_OF_DAY) < 18) {
			System.out.println("Good Afternoon");
		}else if(c.get(Calendar.HOUR_OF_DAY) < 22) {
			System.out.println("Good Evening");
		}else {
			System.out.println("Good Night");
		}
	}

}
