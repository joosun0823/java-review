package castingTest2;

public class CastingTest {
	public static void main(String[] args) {
		//객체화 작업(인스턴스화)
		Person p1 = new Person("짱구", 5, "유치원생"); //사람클래스
		Student p2 = new Student("김주선", 25, "대학생", "코리아학교"); //학생클래스
		Employee p3 = new Employee("홍길동", 50, "개발자", "코리아회사"); //직원클래스
		
		//메소드 오버라이딩된 것으로 호출됨을 확인
//		p1.eat();
//		p2.eat();
//		p3.eat();
		
		
		printWalk(p1);
		printWalk(p2);
		printWalk(p3);
	}
	
	//매개변수 부모클래스 타입의 매개변수(들어오면서 자동 업캐스팅)
	static void printWalk(Person person) {
		if(person instanceof Student) {
//			매개변수 person이 Student 클래스를 포함한다면
//			person을 Student 클래스로 강제형변환 후 자식클래스에 있는 walk 메소드 출력
			((Student)person).walk();
		} else if(person instanceof Employee) {
//			매개변수 person이 Employee 클래스를 포함한다면
			((Employee)person).walk();
//			person을 Employee 클래스로 강제형변환 후 자식클래스에 있는 walk 메소드 출력
		} else {
			System.out.println("안걸을래");
		}
	}
}
