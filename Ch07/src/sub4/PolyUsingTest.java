package sub4;

/*
 * 날짜 : 2020/05/14
 * 이름 : 김철학
 * 내용 : 다형성 활용 실습하기
 */
public class PolyUsingTest {
	public static void main(String[] args) {
		
		Tiger tiger = new Tiger();
		Eagle eagle = new Eagle();
		Shark shark = new Shark();
		
		// 다형성을 이용한 객체배열
		Animal ani[] = {tiger, eagle, shark};
		
		ani[0].move();
		ani[0].hunt();

		ani[1].move();
		ani[1].hunt();
		
		ani[2].move();
		ani[2].hunt();
	}
}
