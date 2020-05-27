package test10;
/*
 * 날짜 : 0000/00/00
 * 이름 : 홍길동
 * 내용 : 자바 자료구조 큐(Queue) 연습문제
 */
public class JavaTest10 {

	static int QUEUE_SIZE = 10;
	static int queue[] = new int[QUEUE_SIZE];
	static int front = 0, rear = 0;
	
	public static void main(String[] args) {
		
		input(100);
		input(200);
		input(300);

		System.out.println(output());
		System.out.println(output());
		System.out.println(output());
		System.out.println(output());			
	}	
	
	public static void input(int data) {
		if (rear == QUEUE_SIZE) {
			System.out.println("더이상 데이터를 저장 할 수 없습니다.");			
		}
		queue[rear++] = data;
	}

	public static int output() {
		if (front == QUEUE_SIZE) {
			System.out.println("데이터가 없습니다.");
			return 0;
		}
		return queue[front++];
	}
}
