package sub2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
 * 날짜 : 2020/05/20
 * 이름 : 김철학
 * 내용 : 컬렉션 프레임워크 Set 실습하기 교재 p734
 */
public class SetTest {
	public static void main(String[] args) {
		// 집합 생성 및 실수 데이터 저장
		Set<Integer> set = new HashSet<>();		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		
		System.out.println("집합 원소 갯수 : "+set.size());
		
		// 반복자를 이용한 집합원소 출력
		Iterator<Integer> iter = set.iterator();
		
		while(iter.hasNext()) {
			System.out.println("원소 : "+iter.next());
		}
		
	}
}
