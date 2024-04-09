package castingTest2;

public class Student extends Person{
	//사람클래스를 상속받은 학생클래스
	//필드
	String schoolName;//학교이름
	
	//생성자 alt shift s o
	//매개변수 4개받는 생성자
	public Student(String name, int age, String job, String schoolName) {
		super(name, age, job); //부모 생성자
		this.schoolName = schoolName;
	}
	
	//메소드
	//메소드 오버라이딩
	@Override
	void eat() {
		System.out.println(this.name + "은/는 " + this.schoolName + 
				"에서 밥을 먹는다");
	}
	

	void walk() {
		System.out.println(this.name + "은/는 " + this.schoolName + 
				"으로 등교한다");
	}
}
