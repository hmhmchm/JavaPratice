
public class Entry<K, V> {
	private K key;
	private V value; //변수 key 와 value의 타입은 각각 k와 v 이다.
	
	public Entry(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	public K getKey() {
		return key;
	}
	
	public V getValue() {
		return value;
	}
	public static void main(String[] args) {
		Entry<String, Integer> e1 = new Entry<>("최현민", 27);//<String Integer>와 동일하다.
		Entry<String, String> e2 = new Entry<>("기타", "등등");
		
		//Entry<int, String> e3 = new Entry<>(30, "아무개");
		
		System.out.println(e1.getKey() + " " + e1.getValue());
		System.out.println(e2.getKey() + " " + e2.getValue());

	}

}
