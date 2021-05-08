package javaDay5Assigment1.business.concrete;

import java.util.List;

import javaDay5Assigment1.business.abstracts.UserService;
import javaDay5Assigment1.dataAccess.abstracts.UserDao;
import javaDay5Assigment1.entities.concrete.User;

public class UserManager implements UserService {
	
	private UserDao userDao;

	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public void add(User user) {
		
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void checkEmail(String email) {
		for(User user: userDao.getAll()) {
			if(email == user.getEmail()) {
			  throw new ArithmeticException("Bu mail daha önce kullanýlmýþtýr. lütfen farklý e-posta giriniz.");
			}
		}
		
	}

}
