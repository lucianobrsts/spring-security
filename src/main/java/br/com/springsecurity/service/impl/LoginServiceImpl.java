package br.com.springsecurity.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.springsecurity.dao.UserDAO;
import br.com.springsecurity.entities.User;
import br.com.springsecurity.service.LoginService;

@Service
@Transactional
public class LoginServiceImpl implements LoginService {

	@Autowired
	private UserDAO dao;

	public User login(String username, String password) throws IllegalArgumentException {
		if (isEmptyOrNull(username) || isEmptyOrNull(password)) {
			throw new IllegalArgumentException("Atenção, username ou password vazios!");
		}

		User u = dao.login(username, password);

		if (u == null) {
			throw new IllegalArgumentException("Erro: username ou passowrd incorretos!");
		}
		return u;
	}

	private boolean isEmptyOrNull(String s) {
		return s == null || s.equals("");
	}
}
