package Entitie;

public class Discount {
	private int id;
	private double discountPercent;
	
	public Discount() {
		
	}

	public Discount(int id, double discountPercent) {
		super();
		this.id = id;
		this.discountPercent = discountPercent;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getDiscountPercent() {
		return discountPercent;
	}

	public void setDiscountPercent(double discountPercent) {
		this.discountPercent = discountPercent;
	}
	
	
	
}
