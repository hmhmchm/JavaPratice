import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		String[] names1 = {"사슴", "호랑이", "바다표범","곰"};
		
		List<String> list = Arrays.asList(names1);
		list.set(1, "앵무새");
		for(String s : list) {
			System.out.print(s + "\t");
		}
		System.out.println();
		
		list.sort(new Comparator<String>() {
			public int compare(String x, String y) {
				return x.length() - y.length();
			}
		});
		
		String[] names2 = list.toArray(new String[list.size()]);
		for(int i = 0; i < names2.length; i++)
			System.out.print(names2[i] + "\t");
	}

}
