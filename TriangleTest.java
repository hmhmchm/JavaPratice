class Triangle{
	private double width,height; //밑변과 높이
	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	public Triangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double findArea() {
		return (width * height)/2;
	}
	
	public boolean isSameArea(Triangle t) {
		return t.findArea()==this.findArea(); //두개의 삼각형의 넓이가 동일한지 비교
	}
}
public class TriangleTest {

	public static void main(String[] args) {
		Triangle t1 = new Triangle(10.0, 5.0);
		Triangle t2 = new Triangle(5.0, 10.0);
		Triangle t3 = new Triangle(8.0, 8.0);
		
		System.out.println(t1.isSameArea(t2));
		System.out.println(t1.isSameArea(t3));

	}

}
