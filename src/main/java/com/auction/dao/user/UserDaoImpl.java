package com.auction.dao.user;

import com.auction.dao.AbstractDao;
import com.auction.entity.User;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("userDao")
public class UserDaoImpl extends AbstractDao<Integer, User> implements UserDao {

	public User findById(Integer id) {
		return getByKey(id);
	}

	public void saveUser(User user) {
		persist(user);
	}

	public void deleteUserByLogin(String login) {
		Query query = getSession().createSQLQuery("delete from User where login = :login");
		query.setString("login", login);
		query.executeUpdate();
	}

	@SuppressWarnings("unchecked")
	public List<User> findAllUsers() {
		Criteria criteria = createEntityCriteria();
		return (List<User>) criteria.list();
	}

	public User findUserByLogin(String login) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("login", login));
		return (User) criteria.uniqueResult();
	}
}
