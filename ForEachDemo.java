import java.util.Scanner;

public class ForEachDemo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int scores[] = new int[5];
		int sum = 0;
		
		for(int i = 0; i < scores.length; i ++) {
			scores[i] = in.nextInt();// 쓰기 읽기 둘 다 가능
		}
		
		for(int s : scores) {
			sum += s; // 읽기만 가능
		}
		
		System.out.println("평균 = " + sum / 5.0);

	}

}
