package generic;

public class MethodTest {
	static class Utils {
		public static <T> void showArray(T[] a) {
			for(T t : a) // for each 문 -> 배열을 이용 할 때 사용한다
						 // for (변수타입 변수명 : 배열명) 
						 // 반복문이 실행 될때마다 t의 값이 a값에 의해 변한다.
				System.out.printf("%s ", t); // https://keep-cool.tistory.com/15
			System.out.println(); //줄 바꿈
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
