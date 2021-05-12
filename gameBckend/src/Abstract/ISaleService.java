package Abstract;

import Entitie.Discount;
import Entitie.Store;
import Entitie.User;

public interface ISaleService {
	
	void sale(Store store, User user, Discount discount);
	void addToCart(Store store, User user, Discount discount);
	
	
}
