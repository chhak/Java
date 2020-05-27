package sub1;

import java.util.Scanner;

/*
 * 날짜 : 2020/05/01
 * 이름 : 김철학
 * 내용 : 조건문 switch 실습하기
 */
public class SwitchTest {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("아무 숫자 입력 : ");
		int num = sc.nextInt();
		
		System.out.println("입력한 숫자는 "+num+"입니다.");
		
		int result = num % 2;		
		switch( result ) {
		case 0:
			System.out.println("입력한 숫자는 짝수 입니다.");
			break;
		case 1:
			System.out.println("입력한 숫자는 홀수 입니다.");
			break;		
		}			
	}	
}
