package br.com.springsecurity.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import br.com.springsecurity.dao.UserDAO;
import br.com.springsecurity.entities.User;

@Repository
public class UserDAOImpl implements UserDAO {

	@PersistenceContext
	private EntityManager entityManager;

	public User login(String username, String password) {
		String query = "FROM User u WHERE u.username = ? and u.password = ?";
		Query q = entityManager.createQuery(query);
		q.setParameter(1, username);
		q.setParameter(2, password);

		@SuppressWarnings("rawtypes")
		List l = q.getResultList();

		if (l == null || l.isEmpty() || l.size() > 1) {
			return null;
		}
		return (User) l.get(0);
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
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
	public void remove(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getById(Long id) {
		// TODO Auto-generated method stub
		
	}
}
