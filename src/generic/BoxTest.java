package generic;

//���׸� ����
//���� Ÿ�� �˻�, ĳ���� ���� �ʴ´�. // ĳ���� -> String���� ������ ��ü�� (int), (double)�� ����ȯ ���ִ� ��
public class BoxTest {

	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		box.set("��ű�");
//		box.set(3.14); // ���׸� ������ ���� �޸� �ڵ忡�� ������ �߻� ���� �˷��ش�. -> <String>�� ��� ���� / <Double>�� �ذ� ���� 
		String name = box.get();
		System.out.println(name);

	}

}





// ���׸� ������
//public class BoxTest {
//
//	public static void main(String[] args) {
//		Box box = new Box();
//		box.set("��ű�"); 
//		box.set(3.14); //�ڵ�����δ� ������ �ȶ����� ������ �������� ���� �߻�
//		String name = (String) box.get(); 
//		System.out.println(name);
//
//	}
//
//}
