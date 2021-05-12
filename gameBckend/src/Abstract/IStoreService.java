package Abstract;

import Entitie.Store;

public interface IStoreService {
	
	void buy(Store store);
	
	void add(Store store);
	
	void download(Store store);
	
	void update(Store store);
	
	void returnGame(Store store);
	
	void delete(Store store);
}
