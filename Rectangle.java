public class Rectangle {
	private int x,y;
	private int width,height;
	
	public Rectangle(int x, int y, int width, int height) {
		super();
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
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

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	

	@Override
	public String toString() {
		return "Rectangle [x=" + x + ", y=" + y + ", width=" + width + ", height=" + height + "]";
	}
	
	public boolean equals(Rectangle r) {
		return (this.width == r.width && this.height == r.height);
	}

	public static void main(String[] args) {
		Rectangle rects[] = new Rectangle[3];
		
		rects[0] = new Rectangle(1, 1, 5, 6);
		rects[1] = new Rectangle(2, 3, 5, 6);
		rects[2] = new Rectangle(2, 3, 6, 5);
		
		for(Rectangle rect : rects) {
			System.out.println(rect.toString());
		}
		
		System.out.println(rects[0].equals(rects[1]));
		System.out.println(rects[0].equals(rects[2]));
		System.out.println(rects[1].equals(rects[2]));

	}

}
