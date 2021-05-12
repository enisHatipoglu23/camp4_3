package Concrete;
	
import Abstract.IStoreService;
import Entitie.Store;

public class StoreManager implements IStoreService {

	@Override
	public void buy(Store store) {
		System.out.println(store.getGameName() + "satýn alýnmýþtýr.");
	}

	@Override
	public void add(Store store) {
		System.out.println(store.getGameName() + store.getGameCategory() + "kategorisinde "+ "kütüphanenize eklendi.");
		
	}

	@Override
	public void download(Store store) {
		System.out.println(store.getGameName() + "indirme baþlatýldý.");
		
	}

	@Override
	public void update(Store store) {
		System.out.println(store.getGameName() + "güncellendi");
		
	}

	@Override
	public void returnGame(Store store) {
		System.out.println(store.getGameName() + "iade ediliyor.");

	}

	@Override
	public void delete(Store store) {
		System.out.println(store.getGameName() + "silindi.");
		
	}

	
	}
	

