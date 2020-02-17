package generic;

//제네릭 적용
//강한 타입 검사, 캐스팅 하지 않는다. // 캐스팅 -> String으로 선언한 개체를 (int), (double)로 형변환 해주는 것
public class BoxTest {

	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		box.set("김신구");
//		box.set(3.14); // 제네릭 미적용 경우와 달리 코드에서 오류가 발생 함을 알려준다. -> <String>의 경우 오류 / <Double>로 해결 가능 
		String name = box.get();
		System.out.println(name);

	}

}





// 제네릭 미적용
//public class BoxTest {
//
//	public static void main(String[] args) {
//		Box box = new Box();
//		box.set("김신구"); 
//		box.set(3.14); //코드상으로는 오류가 안뜨지만 컴파일 과정에서 오류 발생
//		String name = (String) box.get(); 
//		System.out.println(name);
//
//	}
//
//}
