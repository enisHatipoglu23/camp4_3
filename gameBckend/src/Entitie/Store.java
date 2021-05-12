package Entitie;

public class Store {
	private int id;
	private String gameName;
	private String gameCategory;
	private double gamePrice;
	
	public Store() {
		
	}

	public Store(int id, String gameName, String gameCategory, double gamePrice) {
		super();
		this.id = id;
		this.gameName = gameName;
		this.gameCategory = gameCategory;
		this.gamePrice = gamePrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public String getGameCategory() {
		return gameCategory;
	}

	public void setGameCategory(String gameCategory) {
		this.gameCategory = gameCategory;
	}

	public double getGamePrice() {
		return gamePrice;
	}

	public void setGamePrice(double gamePrice) {
		this.gamePrice = gamePrice;
	}
	
	
	
}
