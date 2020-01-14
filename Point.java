import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Point implements Comparable<Point> {//Comparable 도 generic type 이라 
	private int x,y; //좌표
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	@Override
	public int compareTo(Point p) {
		
		return this.x - p.x;
	}

	public static void main(String[] args) {
		ArrayList<Point> al = new ArrayList<>();
		Random r = new Random();
		
		for(int i = 0; i < 10; i++) {
			int x = r.nextInt(101);
			int y = r.nextInt(101);
			al.add(new Point(x,y));
		}
		
		for(Point p : al) {
			System.out.println(p);
		}
		
		System.out.println("===============================");
		Collections.sort(al);
		for(Point p : al) {
			System.out.println(p);
		}
	}

}
