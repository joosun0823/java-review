package animalTest;

public class Animal {
	//동물 클래스
	//필드
	// 이름, 나이, 종(species)
	String name; //문자열 이름 선언
	int age;	//정수형 나이 선언
	String species; //문자열 종 선언
	
	
	//생성자
	//기본 생성자, 이름과 종을 받는 생성자, 이름과 나이와 종을 받는 생성자
	
	public Animal() {
		//기본 생성자
	}

	//생성자 오버로딩
	//name, species라는 매개변수를 가진 생성자
	public Animal(String name, String species) {
		this();//=>자기 자신의 생성자 현재 기본생성자를 가리킴
		this.name = name;	//name 필드에 매개변수로 받는 name 값 대입
		this.species = species; //species 필드에 매개변수로 받는 species 값 대입
	}


	//name, species, age라는 매개변수를 가진 생성자
	public Animal(String name, String species, int age) {
		this(name, species); //name, species라는 매개변수를 가진 생성자
		this.age = age;	//age 필드에 매개변수로 받는 age 값 대입
	}
	
	//this() : 자기자신의 생성자
	
	
	//메소드
	//정보 출력하는 메소드(printAnimal) : 이름, 나이, 종 출력
	void printAnimal() {
		System.out.println("이름: " + this.name);
		System.out.println("나이: " + this.age);
		System.out.println("종: " + this.species);
	}
	
	//eat ( 매개변수 o, 리턴값 o => 종과 먹이 )
	// 동물 이름이 먹이를 먹습니다
	
	String eat(String food) {
		System.out.println(this.name + "이/가 " + food + "을/를 먹습니다");
		return this.name + food;
	}
	
	//sleep (매개변수x, 리턴값 o => 종)
	// 동물이름이 잠을 잡니다
	String sleep() {
		
		System.out.println(this.name + "이/가 잠을 잡니다");
		return this.name;
	}
		
	
	//먹을 수 있다
	//울음 소리 낼 수 있다
	//달릴 수 있다
	//날 수 있다
	
	
	
	
}
