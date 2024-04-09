package task01;

public class Salad extends Food{
	private String name;
	private int price;
	
	public Salad() {
		super();
		this.name = "샐러드";
		this.price = 8000;
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
