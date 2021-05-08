package javaDay5Assigment1.dataAccess.abstracts;

import java.util.List;

import javaDay5Assigment1.entities.concrete.User;

public interface UserDao {
	public void add(User user);
	public void update(User user);
	User get(int id);
	User get(String email);
	User get(String password, String email);
	List<User> getAll();

}
