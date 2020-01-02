import java.util.Scanner;

class Phone{
	
	private String[] name = new String[3];
	private int[] tel = new int[10];
	
	public Phone(String[] name, int[] tel) {
		super();
		this.name = name;
		this.tel = tel;
	}
	public String[] getName() {
		return name;
	}
	public void setName(String[] name) {
		this.name = name;
	}
	public int[] getTel() {
		return tel;
	}
	public void setTel(int[] tel) {
		this.tel = tel;
	}
	
	
}
public class PhoneBook {

	public static void main(String[] args) {
		//생성
		Phone p = new Phone(args, null);//정확한 수치를 넣을 수 가 없는데 어떻게 해야되지?
		//입력
		Scanner in = new Scanner(System.in);
		System.out.print("인원 수: ");
		int num = in.nextInt(); //인원 수
		//배열생성
		
		for(int i = 1; ;i++) {
			if(i<=num) {
				System.out.print("이름과 전화번호: ");
				Phone.name = in.next();  //이름 ??
				int tel = in.nextInt();// 전화번호 ??
			}else {
				System.out.println("저장 되었습니다.");
				break;
			}
		}
		
		/*System.out.print("검색할 이름: ");
		String secondName = in.next();
		if(name.equals(secondName)) {
			System.out.println(tel);
		}*/

	}

}
