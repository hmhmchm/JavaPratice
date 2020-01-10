public class MyPoint {
	//toString 오버라이딩
	private int p,q;
	
	public int getP() {
		return p;
	}

	public void setP(int p) {
		this.p = p;
	}

	public int getQ() {
		return q;
	}

	public void setQ(int q) {
		this.q = q;
	}
	

	@Override
	public String toString() {
		return "Point (" + p + "," + q+ ")";
	}
	

	public MyPoint(int p, int q) {
		this.p = p;
		this.q = q;
	}

	public static void main(String[] args) {
		MyPoint p = new MyPoint(3, 50);
		MyPoint q = new MyPoint(4, 50);
		
		System.out.println(p);
		
		if(p.equals(q))
			System.out.println("같은 점");
		else
			System.out.println("다른 점");
	}

	

}
