package sub4;

/*
 * ��¥ : 2019/10/17
 * �̸� : ��ö��
 * ���� : ��������, �����޼��� �ǽ��ϱ� ���� p236
 */
public class StaticTest {

	public static void main(String[] args) {
		
		Increment inc1 = new Increment(); // 1
		Increment inc2 = new Increment(); // 2
		 
		// ��������(Ŭ��������), �����޼���(Ŭ�����޼���)�� �̹�
		// �����Ҵ翵��(Method Area)�� �����Ǿ� �ֱ� ������
		// ��ü ���� ���� �ٷ� ���� �� �� �ִ�.
		Increment.num2 += 2; // 4
		Increment.add();     // 5

		Increment inc3 = new Increment(); // 6
		
		// ��ü������ �ƴ� ������ü ������
		Calc c = Calc.getInstance();
		
		int rs1 = c.plus(1, 2);
		int rs2 = c.minus(1, 2);
		int rs3 = c.multi(3, 2);
		int rs4 = c.div(4, 2);
		
		System.out.println("rs1 : "+rs1);
		System.out.println("rs2 : "+rs2);
		System.out.println("rs3 : "+rs3);
		System.out.println("rs4 : "+rs4);
		
	}
	
}
