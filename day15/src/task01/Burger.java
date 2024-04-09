package task01;

public class Burger extends Food{
	private String name;
	private int price;
	
	public Burger() {
		super();
		this.name = "햄버거";
		this.price = 4900;
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
