package generic;

public class MethodTest2 {
	static class Utils2 {
		public static <T> void showArray(T[] a) {
			for(T t : a) 
				//System.out.printf("%s ", t);
				System.out.print(t+" "); // printf와 출력 결과 같음
			System.out.println(); //줄 바꿈
		}
		public static <T> T getLast(T[] a) {
			return a[a.length - 1];
		}
	}

	public static void main(String[] args) {
		Integer[] ia = {1,2,3,4,5,6};
		Character[] ca = {'H','E','L','L','O'};
		Double[] da = {3.14, 1.7, 1.43};
		
		Utils2.showArray(ia);
		Utils2.showArray(ca);
		Utils2.showArray(da);
		
	}

}



