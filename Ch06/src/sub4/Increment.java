package sub4;

public class Increment {

	public int num1;
	public static int num2;
	
	public Increment() {
		num1++;
		num2++;
		
		System.out.println("num1 : "+num1);
		System.out.println("num2 : "+num2);
	}
	
	// Ŭ���� �޼���(�����޼���)
	public static void add() {
		// static �޼��忡���� none static ������ ���� �� �� ����.
		//num1++;
		num2++;
	}
	
}
