package Entitie;

public class Sale {
	private int id;
	private String campaignName;
	private String campaignDetails;
	private double discountPercent;
	
	public Sale() {
		
	}

	public Sale(int id, String campaignName, String campaignDetails, double discountPercent) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.campaignDetails = campaignDetails;
		this.discountPercent = discountPercent;
		
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public String getCampaignDetails() {
		return campaignDetails;
	}

	public void setCampaignDetails(String campaignDetails) {
		this.campaignDetails = campaignDetails;
	}

	public double getDiscountPercent() {
		return discountPercent;
	}

	public void setDiscountPercent(double discountPercent) {
		this.discountPercent = discountPercent;
	}
	
	
}
