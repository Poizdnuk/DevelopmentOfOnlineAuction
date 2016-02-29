package com.auction.controller;

import com.auction.entity.User;
import com.auction.service.UserService;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.springframework.context.MessageSource;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;

public class AppControllerTest {

	@Mock
	UserService service;
	
	@Mock
	MessageSource message;
	
	@InjectMocks
	AppController appController;
	
	@Spy
	List<User> users = new ArrayList<User>();

	@Spy
	ModelMap model;
	
	@Mock
	BindingResult result;
	
	@BeforeClass
	public void setUp(){
		MockitoAnnotations.initMocks(this);
		users = getUsersList();
	}
	
	@Test
	public void listUsers(){
		when(service.findAllUsers()).thenReturn(users);
		Assert.assertEquals(appController.listUsers(model), "alleusers");
		Assert.assertEquals(model.get("users"), users);
		verify(service, atLeastOnce()).findAllUsers();
	}

	public List<User> getUsersList(){
		User user1 = new User();
		user1.setLogin("Alex");

		User user2 = new User();
		user2.setLogin("Jeremy");
		
		users.add(user1);
		users.add(user2);
		return users;
	}
}
