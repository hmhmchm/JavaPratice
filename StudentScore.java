import java.util.Arrays;
import java.util.Random;

public class StudentScore {

	public static void main(String[] args) {
		// 난수 생성을 위한 Random 클래스 객체 생성
		Random rd = new Random();
		//5행 10열 배열 scores 선언 및 생성
		int[][] scores = new int[5][10];
		//배열의 각 요소에 0~100사이의 난수를 생성해 저장
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 10; j++) {
				scores[i][j] = rd.nextInt(101);//왜 101이지
			}
		}
		System.out.println("학생의 점수");
		//학생의 점수 출력
		for(int i = 0; i < 5 ;i++) {
			System.out.print( i+1 + "반:" );
			for(int j = 0; j < 10 ; j++) {
				System.out.printf("%4d", scores[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		//각 반의 최고 점수 출력
		System.out.println("각 반의 최고 점수");
		for(int i = 0; i < 5; i++) {
			//각 반의 점수 오름차순 정렬
			Arrays.sort(scores[i]);
			//각 반의 첫번째 요소 출력
			System.out.println( i+1 + "반:" + scores[i][9]);
		}
	}

}
