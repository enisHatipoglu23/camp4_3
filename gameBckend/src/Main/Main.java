package Main;


import Concrete.DiscountManager;
import Concrete.SaleManager;
import Concrete.StoreManager;
import Concrete.UserManager;
import Entitie.Discount;
import Entitie.Sale;
import Entitie.Store;
import Entitie.User;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User();
		user1.setFirstname("enis");
		user1.setLastname("hatip");
		user1.setBirthYear("2001");
		user1.setId(13);
		
		User user2 = new User();
		user2.setFirstname("enis");
		user2.setLastname("hatip");
		user2.setBirthYear("2001");
		user2.setId(13);
		
		Store store1 = new Store();
		store1.setGameCategory("Kawga ");
		store1.setGameName("Mortal Kombat ");
		store1.setGamePrice(100);
		
		Store store2 = new Store();
		store2.setGameCategory("Top ");
		store2.setGameName("Fifa 2077 ");
		store2.setGamePrice(100);
		
		
		
		Sale sale = new Sale();
		sale.setCampaignName(" 2077 YAZ ÝNDÝRÝMLERÝ ");
		sale.setCampaignDetails(" Kampanyada olan her oyun %40 ÝNDÝRÝMDE!!!!!!!!!! ");
		sale.setDiscountPercent(40);
		sale.setId(14);
		
		Discount discount = new Discount();
		discount.setId(15);
		discount.setDiscountPercent(40);
		
		UserManager userManager = new UserManager();
		userManager.add(user1);
		userManager.checkIfRealPerson(user1);
		userManager.save(user1);
		userManager.delete(user1);
		
		userManager.add(user2);
		userManager.checkIfRealPerson(user2);
		userManager.save(user2);
		userManager.delete(user2);
		

		StoreManager storeManager = new StoreManager();
		storeManager.add(store1);
		storeManager.buy(store1);
		storeManager.download(store1);
		storeManager.update(store1);
		storeManager.delete(store1);

		DiscountManager discountManager = new DiscountManager(sale);
		discountManager.add(discount);
		discountManager.delete(discount);
		
		SaleManager saleManager = new SaleManager();
		saleManager.sale(store1, user2, discount);
		
		
		
		
		
		
		
		
		
			
			
	}
		
		
		
		
		
		
	}


