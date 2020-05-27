package sub2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
 * ��¥ : 2020/05/20
 * �̸� : ��ö��
 * ���� : �÷��� �����ӿ�ũ Set �ǽ��ϱ� ���� p734
 */
public class SetTest {
	public static void main(String[] args) {
		// ���� ���� �� �Ǽ� ������ ����
		Set<Integer> set = new HashSet<>();		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		
		System.out.println("���� ���� ���� : "+set.size());
		
		// �ݺ��ڸ� �̿��� ���տ��� ���
		Iterator<Integer> iter = set.iterator();
		
		while(iter.hasNext()) {
			System.out.println("���� : "+iter.next());
		}
		
	}
}
