package sub4;

/*
 * ��¥ : 2020/05/14
 * �̸� : ��ö��
 * ���� : ������ Ȱ�� �ǽ��ϱ�
 */
public class PolyUsingTest {
	public static void main(String[] args) {
		
		Tiger tiger = new Tiger();
		Eagle eagle = new Eagle();
		Shark shark = new Shark();
		
		// �������� �̿��� ��ü�迭
		Animal ani[] = {tiger, eagle, shark};
		
		ani[0].move();
		ani[0].hunt();

		ani[1].move();
		ani[1].hunt();
		
		ani[2].move();
		ani[2].hunt();
	}
}
