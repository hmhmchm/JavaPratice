import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int month = in.nextInt();
		int year = 2020;
		int numDays = 0;
		
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			numDays = 31;
			break;
		case 4: case 6: case 9: case 11:
			numDays = 30;
			break;
		case 2:
			if(((year%4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)) //윤년 
				numDays = 29;
			else
				numDays = 28;
			break;
		default:
			System.out.println("잘못된 달입니다.");
			break;
		}
		System.out.println(month + "월 달은 " + numDays + "일 입니다.");

	}

}
