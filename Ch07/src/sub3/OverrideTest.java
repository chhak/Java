package sub3;

/*
 * 날짜 : 2020/05/13
 * 이름 : 김철학
 * 내용 : 오버라이드 메서드 실습하기
 * 
 * Override 메서드
 *  - 부모클래스의 멤버 메서드를 자식클래스에서 다시 정의하는것(재정의)
 *  - 자식클래스에서 다시 정의한 메서드가 부모클래스의 메서드를 덮어쓴다.(가려진다.)
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
		
		// final 예제
		// - final 변수 : 상수
		// - final 메서드 : 오버라이드 금지
		// - final 클래스 : 상속 금지
		
		final int NUM = 1;
		//NUM = 2; 상수는 처음 초기화된 값으로 고정
		
		
		
		
	}
}
