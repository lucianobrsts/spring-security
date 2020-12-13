package br.com.springsecurity.service;

import br.com.springsecurity.entities.User;

public interface LoginService {
	
	User login(String username, String password) throws IllegalArgumentException;

}
