package sub1;

import java.util.Scanner;

/*
 * ��¥ : 2020/05/01
 * �̸� : ��ö��
 * ���� : ���ǹ� switch �ǽ��ϱ�
 */
public class SwitchTest {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ƹ� ���� �Է� : ");
		int num = sc.nextInt();
		
		System.out.println("�Է��� ���ڴ� "+num+"�Դϴ�.");
		
		int result = num % 2;		
		switch( result ) {
		case 0:
			System.out.println("�Է��� ���ڴ� ¦�� �Դϴ�.");
			break;
		case 1:
			System.out.println("�Է��� ���ڴ� Ȧ�� �Դϴ�.");
			break;		
		}			
	}	
}
