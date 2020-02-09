class Circle{
	double radius;
	static int numOfCircles = 0;
	int numCircles = 0;
	
	public Circle(double radius) {
		this.radius = radius;
		numOfCircles++;
		numCircles++;
	}
}
public class CircleDemo1 {
	public static void main(String[] args) {
		Circle myCircle = new Circle(10.0);
		Circle yourCircle = new Circle(5.0);
		
		//print();  print메서드를 불러오려면 밑에 정적인 static으로 묶어야한다.
		System.out.println("원의 개수 : " + Circle.numOfCircles);
		System.out.println("원의 개수 : " + yourCircle.numCircles);
	}
	
	void print() {
		System.out.println("정적 멤버에 대한 내용입니다.");
	}
		
}
