package toy;

public class Dog extends ToyAdapter{
	//어댑터 클래스를 상속받은 클래스
	
	@Override
	public String[] speakList() {
		String[] list = {"안녕 난 멍이야", "배고파임마", "물어버린다", "씻어라좀"};
		return list;
	}

//	@Override
//	public void pushBtn(String speak) {
//		System.out.println(speak);
//		
//	}
	
	
}
