public class TwoArrayTest {

	public static void main(String[] args) {
		int arr[][] = new int [3][];
		arr[0] = new int[1];
		arr[1] = new int[2];
		arr[2] = new int[3];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = i + j;
			}
		}
		
		for(int[] n : arr) {//foreach 구문  arr 자리에는 배열이나 컬렉션 가능하다.
			for(int k : n) {
				System.out.print(k + "\t");
			}
			System.out.println();
		}

	}

}
