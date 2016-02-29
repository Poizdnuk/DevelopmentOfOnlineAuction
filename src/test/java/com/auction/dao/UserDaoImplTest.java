package com.auction.dao;

import com.auction.config.TestDBConfig;
import com.auction.dao.user.UserDao;
import com.auction.entity.User;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.math.BigDecimal;

@ContextConfiguration(classes = { TestDBConfig.class })
public class UserDaoImplTest extends EntityDaoImplTest{

	@Autowired
	UserDao userDao;

	@Override
	protected IDataSet getDataSet() throws Exception{
		IDataSet dataSet = new FlatXmlDataSet(this.getClass().getClassLoader().getResourceAsStream("User.xml"));
		return dataSet;
	}

	@Test
	public void findById(){
		Assert.assertNotNull(userDao.findById(1));
		Assert.assertNull(userDao.findById(3));
	}

	
	@Test
	public void saveUser(){
		userDao.saveUser(getSampleUser());
		Assert.assertEquals(userDao.findAllUsers().size(), 3);
	}
	
	@Test
	public void deleteUserByLogin(){
		userDao.deleteUserByLogin("Alex");
		Assert.assertEquals(userDao.findAllUsers().size(), 1);
	}


	@Test
	public void findAllUsers(){
		Assert.assertEquals(userDao.findAllUsers().size(), 2);
	}
	
	@Test
	public void findEmployeeBySsn(){
		Assert.assertNotNull(userDao.findUserByLogin("SAMY"));
		Assert.assertNull(userDao.findUserByLogin("14545"));
	}

	public User getSampleUser(){
		User user = new User();
		user.setUser_id(1);
		user.setLogin("sasha");
		return user;
	}

}
