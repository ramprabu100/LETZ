package com.bookme.config;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.bookme.dao.FoodDao;
import com.bookme.dao.RestaurantDao;
import com.bookme.dao.TableDao;
import com.bookme.dao.UserDao;
import com.bookme.model.Admin;
import com.bookme.model.Customer;
import com.bookme.model.Food;
import com.bookme.model.Restaurant;
import com.bookme.model.Tables;
import com.bookme.model.enumeration.TableSize;

public class ApplicationInit implements ServletContextListener {
	TableDao tableDao= new TableDao();
	FoodDao foodDao = new FoodDao();
	UserDao userDao=new UserDao();
	RestaurantDao restDao = new RestaurantDao();
	public void contextInitialized(ServletContextEvent sce) {
		 restDao.save(new Restaurant(1.0f, "A2B", 620008));
		 restDao.save(new Restaurant(2.0f, "Moris", 600008));
		 restDao.save(new Restaurant(3.0f, "Ambur briyani", 620001));
		 restDao.save(new Restaurant(4.0f, "kirtunga restaurant", 620008));
		 restDao.save(new Restaurant(5.0f, "A2B", 620001));
		 restDao.save(new Restaurant(6.0f, "Moris", 620009));
		 restDao.save(new Restaurant(7.0f, "Ambur briyani", 620005));
		 restDao.save(new Restaurant(8.0f, "kirtunga restaurant", 6200018));
		 restDao.save(new Restaurant(9.0f, "A2B", 620108));
		 restDao.save(new Restaurant(10.0f, "Moris", 610008));
		 restDao.save(new Restaurant(11.0f, "Ambur briyani", 620001));
		 restDao.save(new Restaurant(12.0f, "kirtunga restaurant", 620003));
		 
		 
		 foodDao.save(new Food("butter chicken",100.00f,1.0f));
		 foodDao.save(new Food("chicken briyani",120.00f,1.0f));
		 foodDao.save(new Food("veg briyani",90.00f,1.0f));
		 foodDao.save(new Food("idly",10.00f,1.0f));
		 foodDao.save(new Food("dosa",20.00f,1.0f));
		 foodDao.save(new Food("chapathi",25.00f,1.0f));
		 foodDao.save(new Food("roti",15.00f,1.0f));
		 
		 foodDao.save(new Food("butter chicken",100.00f,2.0f));
		 foodDao.save(new Food("chicken briyani",100.00f,2.0f));
		 foodDao.save(new Food("veg briyani",100.00f,2.0f));
		 foodDao.save(new Food("idly",100.00f,2.0f));
		 foodDao.save(new Food("dosa",100.00f,2.0f));
		 foodDao.save(new Food("chapathi",100.00f,2.0f));
		 foodDao.save(new Food("roti",100.00f,2.0f));

		 foodDao.save(new Food("butter chicken",100.00f,4.0f));
		 foodDao.save(new Food("chicken briyani",100.00f,4.0f));
		 foodDao.save(new Food("veg briyani",100.00f,3.0f));
		 foodDao.save(new Food("idly",100.00f,3.0f));
		 foodDao.save(new Food("dosa",100.00f,3.0f));
		 foodDao.save(new Food("chapathi",100.00f,3.0f));
		 foodDao.save(new Food("roti",100.00f,3.0f));

		 foodDao.save(new Food("butter chicken",100.00f,12.0f));
		 foodDao.save(new Food("chicken briyani",100.00f,12.0f));
		 foodDao.save(new Food("veg briyani",100.00f,12.0f));
		 foodDao.save(new Food("idly",100.00f,12.0f));
		 foodDao.save(new Food("dosa",100.00f,12.0f));
		 foodDao.save(new Food("chapathi",100.00f,12.0f));
		 foodDao.save(new Food("roti",100.00f,12.0f));
		 
		 
		 tableDao.save(new Tables("2 member",TableSize.SMALL, 1000.00f, 1.0f));
		 tableDao.save(new Tables("4 member",TableSize.MEDIUM, 1000.00f, 1.0f));
		 tableDao.save(new Tables("8 member",TableSize.LARGE, 1000.00f, 1.0f));
		 tableDao.save(new Tables("2 member",TableSize.SMALL, 1000.00f, 1.0f));
		 tableDao.save(new Tables("4 member",TableSize.MEDIUM, 1000.00f, 1.0f));
		 tableDao.save(new Tables("8 member",TableSize.LARGE, 1000.00f, 1.0f));
		 tableDao.save(new Tables("2 member",TableSize.SMALL, 1000.00f, 1.0f));
		 

	        final Customer customerUser = new Customer(1, "ram", "password");
	        final Admin adminUser = new Admin(2, "admin", "password");
	        userDao.save(customerUser);
	        userDao.save(adminUser);
		 
	}

	public void contextDestroyed(ServletContextEvent sce) {
		
	}

}
