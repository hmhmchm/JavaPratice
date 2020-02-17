
public class Hanoi {
        public static void main (String [] args) {
               
                hanoi(3, 'A', 'B', 'C');
        }
        public static void hanoi(int i, char from, char mid, char to){
               
                if(i==1){
                        System.out.println(i + "를 " + from + "에서 " + to + "로 옮깁니다.");
                }else{
                        hanoi(i-1, from, to, mid);
                        System.out.println(i + "를 " + from + "에서 " + to + "로 옮깁니다.");
                        hanoi(i-1, mid, from, to);
                }
        }
}
