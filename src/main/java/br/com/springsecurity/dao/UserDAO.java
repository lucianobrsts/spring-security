package br.com.springsecurity.dao;

import java.util.List;

import br.com.springsecurity.entities.User;

public interface UserDAO {

	List<User> findAll();

	void save(User user);

	void update(User user);

	void remove(User user);

	void getById(Long id);

	User login(String username, String password);

}
