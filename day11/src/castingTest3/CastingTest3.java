package castingTest3;

public class CastingTest3 {
	public static void main(String[] args) {
//		Animal animal = new Dog();
		
		//1. 같은 메소드가 부모에도 있고 자식에도 있는 경우(오버라이딩)
//		animal.crying();
		//업캐스팅을 하여도 오버라이딩 된 메소드가 실행된다
		
		//2. 메소드가 부모에는 없고 자식에서 추가된 경우
		//(부모에 존재하지 않는 멤버에 접근하려는 경우)
//		animal.walk();
		//자식 클래스에서 추가한 멤버는 부모타입의 참조변수로는 접근할 수 없다
		//이 경우에는 다운 캐스팅을 해야한다
//		((Dog)animal).walk();
		
		
		
		//생성자 만들고 객체생성
		Dog dog = new Dog("배달");
		Cat cat = new Cat("버들");
		
		System.out.println(dog);
		System.out.println(cat);
		
		printText(dog);
		printText(cat);
		printText(new Dog("콩이"));
		printText(new Cat("별이"));
		
	}
	// <매개변수의 다형성>
	//1. 메소드의 매개변수로 여러타입의 값을 전달받는 경우
	//일반적으로는 각각의 타입을 처리하는 메소드를 별도로 만들어야한다
	
//	static void printText(Dog dog) {
//		System.out.println(dog.name + "이가 운다");
//		dog.crying();
//	}
//	
//	static void printText(Cat cat) {
//		System.out.println(cat.name + "이가 운다");
//		cat.crying();
//	}
	
	
	//2. 같은 부모 클래스가 존재한다면 매개변수를 부모 클래스 타입으로 받는다 (업캐스팅)
	//하나의 메소드에서 매개변수를 부모타입으로 만들면 여러 자식 타입을 받아 사용이 가능하다(다형성)
	static void printText(Animal animal) {
		System.out.println(animal.name + "이/가 운다");
		animal.crying();
	}
	
	
	//3. 만약 부모클래스에 존재하지 않는 멤버에(자식클래스에서 생성한 멤버) 접근하기 위해서는
	//Down casting을 해줘야 한다
	
	static void trywalk(Animal animal) {
		//매개변수로 받아온 객체의 주소가 Cat타입인지, Dog타입인지 확인해야한다
		if(animal instanceof Dog) {
			//Dog타입이 맞다면 Dog Down casting한다
			((Dog)animal).walk();
		} else {
			System.out.println("안갈래");
		}
		
	}
	
}
