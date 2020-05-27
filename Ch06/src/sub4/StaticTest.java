package sub4;

/*
 * 날짜 : 2019/10/17
 * 이름 : 김철학
 * 내용 : 정적변수, 정적메서드 실습하기 교재 p236
 */
public class StaticTest {

	public static void main(String[] args) {
		
		Increment inc1 = new Increment(); // 1
		Increment inc2 = new Increment(); // 2
		 
		// 정적변수(클래스변수), 정적메서드(클래스메서드)는 이미
		// 고정할당영역(Method Area)에 생성되어 있기 때문에
		// 객체 생성 없이 바로 참조 할 수 있다.
		Increment.num2 += 2; // 4
		Increment.add();     // 5

		Increment inc3 = new Increment(); // 6
		
		// 객체생성이 아닌 정적객체 얻어오기
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
