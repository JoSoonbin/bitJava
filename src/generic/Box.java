package generic;


//제네릭 적용
//T는 그때 그때 달라진다. -> String , int, boolean 등 필요에 따라 달라진다.
//Main에서 String으로 만들었기 때문에 String으로 사용 된다.
public class Box<T> {
	private T t;
	public void set(T t) {
		this.t = t;
		}
	public T get() {
		return t;
		}
}

// 제네릭 미적용
//public class Box {
//	private Object object;
//	public void set(Object object) {
//		this.object = object;
//	}
//	public Object get() {
//		return object;
//	}
//
//}
