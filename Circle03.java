
public class Circle03 {
	private void secret() {
		System.out.println("비밀이다.");
	}
	
	protected void findRadius() {
		System.out.println("반지름이 10.0이다.");
	}
	
	public void findArea() {
		System.out.println("넓이는 (파이 * 반지름 *반지름) 이다.");
	}
}
class Ball extends Circle03{
	private String color;
	
	public Ball(String color) {
		this.color = color;
	}
	
	public void findColor() {
		System.out.println(color + " 공이다.");
	}
	public void findVolume() {
		System.out.println("부피는 4/3 * (파이*반지름*반지름) 이다.");
	}
	
}
