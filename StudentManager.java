import java.util.Random;

class Student{
	private int sNo, math;

	public Student(int sNo, int math) {
		super();
		this.sNo = sNo;
		this.math = math;
	}

	public int getsNo() {
		return sNo;
	}

	public void setsNo(int sNo) {
		this.sNo = sNo;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	@Override
	public String toString() {
		return "Student [sNo=" + sNo + ", math=" + math + "]";
	}
	
}
public class StudentManger {

	public static void main(String[] args) {
		Random r = new Random();
		Student[][] stus = new Student[5][5];
		int sNo, math = 0;
		
		for(int row = 0; row < stus.length; row ++) {
			for(int col = 0; col < stus[row].length; col++) {
				sNo = r.nextInt(101) + 6000000;
				math = r.nextInt(101);
				stus[row][col] = new Student(sNo, math);
			}
		}
		
		printArr(stus);
		System.out.println();
		calcAvg(stus);
	}
	public static void printArr(Student[][] stus) {
		for(int row = 0; row < stus.length; row++) {
			System.out.print((row +1) + "반: ");
			for(int col = 0; col < stus[row].length; col++) {
				System.out.print(stus[row][col].toString() + " ");
			}
			System.out.println();
		}
	}
	
	public static void calcAvg(Student[][] stus) {//수학 평균
		for(int row = 0; row < stus.length; row++) {
			double mathSum = 0.0;
			for(int col = 0; col < stus[row].length; col++) {//
				mathSum += stus[row][col].getMath();
			}
			System.out.println((row + 1) + "반의 수학 평균: " + (mathSum/stus.length));
		}
	}


}
