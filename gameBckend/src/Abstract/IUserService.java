package Abstract;

import Entitie.User;

public interface IUserService {
	
	void add(User user);
	
	void save(User user);
	
	void update(User user);
	
	void delete(User user);
}
