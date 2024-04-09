package animalTest;

public class AnimalMain {
	public static void main(String[] args) {
		
		//객체 2개 생성하고 메소드 호출
		Animal ani = new Animal("코기","웰시코기",3);
		//name에 "코기", species에 "웰시코기", age에 3 대입하는 객체 ani 선언
		Animal ani2 = new Animal("골리","골든리트리버",1);
		//name에 "골리", species에 "골든리트리버", age에 1 대입하는 객체 ani2 선언
		ani.printAnimal();
		//ani객체 printAnimal 출력
		System.out.println(ani.sleep());
		ani2.printAnimal();
		//ani2객체 printAnimal 출력
		ani2.eat("개껌");
		//ani2 객체 메소드 eat에 있는 매개변수 food에 "개껌" 대입
	}
}
