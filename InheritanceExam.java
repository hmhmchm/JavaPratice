class Flower
{
		public String Flowername;
		public int cost;
		
		protected void printAttributes()
		{
			System.out.println("Flowername="+Flowername+"\tcost="+cost);
		}
}


class Rose extends Flower // 부모인 Flower의 속성과 메소드 모두를 상속받게 된다.
{
	Rose() //생성자
	{
		Flowername = "장미"; //선언하지 않은 변수지만 상속받았으므로 사용가능하다.
		cost = 100; //선언하지 않은 변수지만 상속받았으므로 사용가능하다.
	}
}


class Tulip extends Flower
{
	Tulip()
	{
		Flowername = "튤립";
		cost = 200;
	}
}

public class InheritanceExam
{
	//메인메소드에서 
	public static void main( String [] args )
	{
		Flower Flower = new Flower();
		Rose Rose = new Rose();
		Tulip Tulip = new Tulip();
		
		Flower.printAttributes();
		Rose.printAttributes();
		Tulip.printAttributes();
	}
}
