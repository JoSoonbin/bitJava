package generic;

public class EntryTest {

	public static void main(String[] args) {
		Entry<String, Integer> e1 = new Entry<>("�ڽű�", 23);
		Entry<String, String> e2 = new Entry<>("��Ÿ", "���");
		
//		Entry<Double, String> e3 = new Entry(3.14, "���ڿ�"); // int -> Integer, double -> Double 
		
		System.out.println(e1.getKey() + " " + e1.getValue());
		System.out.println(e2.getKey() + " " + e2.getValue());
//		System.out.println(e3.getKey() + " " + e3.getValue());

	}

}
