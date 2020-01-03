class ArrayUtil{
	public static int[] concat(int[] a, int[] b) {
		int c[] = new int[a.length + b.length];
		int i;
		for(i =0; i < a.length ; i++) {
			c[i] = a[i];
		}
		for(int j = 0; j< b.length; j++) {
			c[i] = b[j];
			i++;
		}
		return c;//a와 b를 연결한 새로운 배열 리턴
		
	}
	
	public static void print(int[] a) {
		
		System.out.print("[");//배열 a 출력
		for(int i: a) {
			System.out.print(i + " ");
		}
		System.out.println("]");
			
		
	}
}
public class ArrayUtilTest {

	public static void main(String[] args) {
		int [] array1 = {1, 3, 5, 7, 9};
		int [] array2 = {2, 4, 6, 8, 10};
		int [] array3 = ArrayUtil.concat(array1, array2);
		ArrayUtil.print(array3);		
	}

}
