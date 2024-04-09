package set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest2 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		//add 추가 메소드 ( 반환값 o)
		set.add("java");
		set.add("dbms");
		set.add("jdbc");
		set.add("web");
		set.add("jsp");
		set.add("spring boot");
		System.out.println(set);
		
		//remove(Object o) : 지정된 요소를 세트에서 제거 (반환값 o)
		set.remove("java");
		System.out.println(set);
		
		//contains(Object o) : 지정된 요소가 세트에 있는지 여부 확인(반환값 o)
		System.out.println(set.contains("jdbc"));
		System.out.println(set.contains("java"));
		
		//size() : 세트의 요소개수 반환
		System.out.println(set.size());
		
		//clear() : 세트의 모든 요소 제거
//		set.clear();
//		System.out.println(set);
		
		//isEmpty() : 세트가 비어있는지 확인
		System.out.println(set.isEmpty());
		
		//반복자 Iterator : 세트의 요소에 대한 반복자를 반환, 반복자를 사용하여 세트의 요소를 반복할 수 있다
		Iterator<String> iter = set.iterator();
		//메소드가 true,false값으로 나오기 때문에 while문
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		
	}
}
