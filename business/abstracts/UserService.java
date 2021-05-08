package javaDay5Assigment1.business.abstracts;

import java.util.List;

import javaDay5Assigment1.entities.concrete.User;

public interface UserService {
	void add(User user);
	void delete(User user);
	void update(User user);
	void checkEmail(String email);
	List<User> getAll();
	
	

}
