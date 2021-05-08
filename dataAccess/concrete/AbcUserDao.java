package javaDay5Assigment1.dataAccess.concrete;

import java.util.List;

import javaDay5Assigment1.dataAccess.abstracts.UserDao;
import javaDay5Assigment1.entities.concrete.User;

public class AbcUserDao implements UserDao {

	@Override
	public void add(User user) {
		System.out.println("Kullanýcý eklendi. " + user.getFirstName());
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User get(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User get(String password, String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
