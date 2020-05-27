package test10;
/*
 * ��¥ : 0000/00/00
 * �̸� : ȫ�浿
 * ���� : �ڹ� �ڷᱸ�� ť(Queue) ��������
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
			System.out.println("���̻� �����͸� ���� �� �� �����ϴ�.");			
		}
		queue[rear++] = data;
	}

	public static int output() {
		if (front == QUEUE_SIZE) {
			System.out.println("�����Ͱ� �����ϴ�.");
			return 0;
		}
		return queue[front++];
	}
}
