package toy;

public class Main {
	public static void main(String[] args) {
		Company c = new Company("서울");
		
		c.register(new Dog());
		
		//toy 인터페이스 익명클래스로 cat장난감을 생성
		Toy cat = new Toy() {
			
			@Override
			public String[] speakList() {
				String[] list = {"고양이는 생선을 좋아해", "쥐를 더 좋아해", "컄"};
				return list;
			}
			
			@Override
			public void pushBtn(String speak) {
				System.out.println(speak);
			}
		};
		
		Company c2 = new Company("부산");
		c2.register(cat);
		
		
		//경기지점
		Company c3 = new Company("경기");
		Toy tiger = new ToyAdapter() {
			
			@Override
			public String[] speakList() {
				String[] list = {"꺄르르르","듀듀듀듀","쾅쾅"};
				return list;
			}
			
			//pushBtn이 필요없으면 어댑터클래스 생성자를 사용한다
		};
		
		c3.register(tiger);
		
	
	}
}
