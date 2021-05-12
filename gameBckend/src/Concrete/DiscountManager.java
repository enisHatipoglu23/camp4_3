package Concrete;

import Abstract.IDiscountService;
import Entitie.Discount;
import Entitie.Sale;

public class DiscountManager implements IDiscountService {
	
	private Sale sale;
	public DiscountManager(Sale sale) {
		this.sale = sale;
		}
	
	@Override
	public void add(Discount discount) {
		System.out.println(sale.getCampaignName() + "% " + discount.getDiscountPercent() +
				"indirim ile sisteme eklenmiþtir. " + "iþte indirim detaylarý--->" + sale.getCampaignDetails() );
	}

	@Override
	public void delete(Discount discount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Discount discount) {
		// TODO Auto-generated method stub
		
	}
		
}	
