package task01;

public class Pizza extends Food{
	private String name;
	private int price;
	
	
	public Pizza() {
		super();
		this.name = "피자";
		this.price = 20000;
	}

	@Override
	int calculatePrice() {
		return this.price;
	}

	@Override
	String getFoodName() {
		return this.name;
		
	}
	
}
