package generic;


//���׸� ����
//T�� �׶� �׶� �޶�����. -> String , int, boolean �� �ʿ信 ���� �޶�����.
//Main���� String���� ������� ������ String���� ��� �ȴ�.
public class Box<T> {
	private T t;
	public void set(T t) {
		this.t = t;
		}
	public T get() {
		return t;
		}
}

// ���׸� ������
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
