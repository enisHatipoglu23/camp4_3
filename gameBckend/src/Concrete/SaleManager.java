package Concrete;

import Abstract.ISaleService;
import Entitie.Discount;
import Entitie.Store;
import Entitie.User;

public class SaleManager implements ISaleService {
	
	private double gamePrice;
	private double discountPercent;
	
	
	@Override
	public void sale(Store store, User user, Discount discount) {
		discountPercent = discount.getDiscountPercent();
		gamePrice = store.getGamePrice();
		gamePrice = gamePrice - (gamePrice * discountPercent / 100);
		System.out.println(store.getGameName() + 
				 discount.getDiscountPercent() + " ile " +  gamePrice + " fiyatýna düþmüþtür." );
		
		
		
	}

	@Override
	public void addToCart(Store store, User user, Discount discount) {
		System.out.println("Sepete eklenmiþtir.");
	}

	
}
