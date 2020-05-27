package test09;
/*
 * 날짜 : 0000/00/00
 * 이름 : 홍길동
 * 내용 : 추상클래스, 다형성 연습문제
 */
public class JavaTest9 {
	
	public static void main(String[] args) {
		
		JavaTest9 here = new JavaTest9();
		
		Circle circle = new Circle();
		Triangle triangle = new Triangle();
		
		here.draw(circle);
		here.draw(triangle);
	}
	
	public void draw( Shape obj ) {
		obj.draw();
	}
}
