package employee;

public class Employee {
	//필드
	private String name; //이름
	private int age; //나이
	private String department; //부서
	
	
	//생성자
	public Employee(String name, int age, String department) {
		super();
		this.name = name;
		this.age = age;
		this.department = department;
	}
	
	//get 메소드
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getDepartment() {
		return department;
	}

	@Override
	public String toString() {
		return "이름: " + this.name + ", 나이 : " + this.age + ", 부서 : " + this.department;
	}
	
	
	
	
	
}
