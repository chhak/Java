package sub2;

/*
 * ��¥ : 2020/05/20
 * �̸� : ��ö��
 * ���� : ���׸� Ŭ���� �ǽ��ϱ� ���� p654
 */
public class MultiGenericTest {
	public static void main(String[] args) {
		
		TV tv = new TV("LG �÷���");
		SmartPhone phone = new SmartPhone("������ 10s");
		
		Product<TV, Integer> p1 = new Product<>(tv, 100);
		Product<SmartPhone, String> p2 = new Product<>(phone, "Galaxy s20");
		
		p1.show();
		System.out.println("p1�� ��ǰ�� : "+p1.getItem().getName());
		
		p2.show();
		System.out.println("p2�� ��ǰ�� : "+p2.getItem().getName());
		
	}
}
