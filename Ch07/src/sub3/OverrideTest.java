package sub3;

/*
 * ��¥ : 2020/05/13
 * �̸� : ��ö��
 * ���� : �������̵� �޼��� �ǽ��ϱ�
 * 
 * Override �޼���
 *  - �θ�Ŭ������ ��� �޼��带 �ڽ�Ŭ�������� �ٽ� �����ϴ°�(������)
 *  - �ڽ�Ŭ�������� �ٽ� ������ �޼��尡 �θ�Ŭ������ �޼��带 �����.(��������.)
 * 
 */
public class OverrideTest {
	public static void main(String[] args) {
		CCC c = new CCC();
		
		c.method1();
		c.method2();
		c.method2(100);
		c.method3();
		c.method3(100);
		
		// final ����
		// - final ���� : ���
		// - final �޼��� : �������̵� ����
		// - final Ŭ���� : ��� ����
		
		final int NUM = 1;
		//NUM = 2; ����� ó�� �ʱ�ȭ�� ������ ����
		
		
		
		
	}
}