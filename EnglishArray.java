import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Arrays;

public class EnglishArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s;
		
		System.out.print("입력: ");
		s = in.nextLine();
		
		StringTokenizer st = new StringTokenizer(s);
		String[] str = new String[st.countTokens()];

		System.out.println("단어 개수: " + st.countTokens());
		
		for(int i = 0; st.hasMoreTokens(); i++) {
			str[i] = st.nextToken();
		}
		
		Arrays.sort(str);
		
		System.out.print("정렬된 토큰: " );
		for(String string : str) {
			System.out.print(string + ", ");
		}
		
		in.close();
	}
}
