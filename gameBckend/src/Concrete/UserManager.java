package Concrete;

import Abstract.IUserService;
import Abstract.UserCheckService;
import Entitie.User;

public class UserManager implements IUserService, UserCheckService {

	@Override
	public boolean checkIfRealPerson(User user) {
		System.out.println("Sistemem kayýt gerçekleþti.");
		return false;
	}

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	
	
}	
