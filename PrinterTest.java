class Printer{
	private int numOfPaper;

	public int getNumOfPaper() {
		return numOfPaper;
	}

	public void setNumOfPaper(int numOfPaper) {
		this.numOfPaper = numOfPaper;
	}
	
	public void print(int p) {
		if(numOfPaper == 0) {
			System.out.println("용지가 없습니다.");
		}else if(numOfPaper > p) {
			System.out.println(p + "장 출력했습니다. 현재 " + (numOfPaper - p)+"장 남았습니다.");
			numOfPaper = numOfPaper - p;
		}else {
			System.out.println("모두 출력하려면 용지가 " + (p - numOfPaper) + "매 부족합니다. " + numOfPaper + "장만 출력합니다.");
		}
	}
}
public class PrinterTest {

	public static void main(String[] args) {
		Printer p = new Printer();
		p.print(2);
		p.setNumOfPaper(10);
		p.print(2);
		p.print(10);

	}

}
