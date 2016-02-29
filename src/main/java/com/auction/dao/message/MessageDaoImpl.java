package com.auction.dao.message;

import com.auction.dao.AbstractDao;
import com.auction.dao.user.UserDao;
import com.auction.entity.Message;
import com.auction.entity.User;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("messageDao")
public class MessageDaoImpl extends AbstractDao<Integer, Message> implements MessageDao {

	public Message findById(Integer id) {
		return getByKey(id);
	}

	public void saveMessage(Message message) {
		persist(message);
	}

	public void deleteMessageId(Integer id) {
		Query query = getSession().createSQLQuery("delete from Message where id = :id");
		query.setInteger("id", id);
		query.executeUpdate();
	}
	@SuppressWarnings("unchecked")
	public List<Message> findAllMessages() {
		Criteria criteria = createEntityCriteria();
		return (List<Message>) criteria.list();
	}

	public Message findMessageByLogin(String login) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("login", login));
		return (Message) criteria.uniqueResult() ;
	}

}
