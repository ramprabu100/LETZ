package com.bookme.controller;


import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.bookme.dao.OrderDao;
import com.bookme.model.Food;
import com.bookme.model.Order;
import com.bookme.model.Tables;
import com.bookme.model.enumeration.OrderType;

@RestController
public class OrderRestController {
	
	OrderDao dao=new OrderDao();

   

    @RequestMapping(value = "/order/{userId}", method = RequestMethod.GET)
    public ResponseEntity<List<Order>> getallByUser(@PathVariable(value = "userId") final String userId) {
        System.out.println("getting all the orders");
        List<Order> temp=dao.findAll();
        return new ResponseEntity<List<Order>>(temp, HttpStatus.ACCEPTED);
    }

    @RequestMapping(value = "/order/food/", method = RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
    public String placeOrder(@RequestBody Food food) {
    	try {
    	Order newOrder = new Order(OrderType.Food,food.getPrice(),Date.valueOf(LocalDate.now()));
    	newOrder.setItem(food);
    	dao.save(newOrder);
        return "success";
    	}
    	catch(Exception e)
    	{
    		return "fail";
    	}
    }
    
    @RequestMapping(value = "/order/table/", method = RequestMethod.POST)
    public String placeOrder(@RequestBody Tables table) {
    	try {
    	Order newOrder = new Order(OrderType.Table,table.getPrice(),Date.valueOf(LocalDate.now()));
    	newOrder.setItem(table);
    	dao.save(newOrder);
    	return "success";
	}
	catch(Exception e)
	{
		return "fail";
	}
    }
}