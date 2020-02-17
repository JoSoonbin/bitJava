package generic;

public class MethodTest {
	static class Utils {
		public static <T> void showArray(T[] a) {
			for(T t : a) // for each �� -> �迭�� �̿� �� �� ����Ѵ�
						 // for (����Ÿ�� ������ : �迭��) 
						 // �ݺ����� ���� �ɶ����� t�� ���� a���� ���� ���Ѵ�.
				System.out.printf("%s ", t); // https://keep-cool.tistory.com/15
			System.out.println(); //�� �ٲ�
		}
		public static <T> T getLast(T[] a) {
			return a[a.length - 1];
		}
	}

	public static void main(String[] args) {
		Integer[] ia = {1,2,3,4,5,6};
		Character[] ca = {'H','E','L','L','O'};
		
		Utils.showArray(ia);
		Utils.showArray(ca);
		
		System.out.println(Utils.getLast(ia));
		System.out.println(Utils.getLast(ca));
		
	}

}
