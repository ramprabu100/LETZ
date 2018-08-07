package com.bookme.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.bookme.dao.FoodDao;
import com.bookme.model.Food;

@RestController
public class FoodResourceRestController {
    FoodDao dao = new FoodDao();

    @RequestMapping(value = "/food/{restaurantId}", method = RequestMethod.GET)
    public ResponseEntity<List<Food>> getallFood(@PathVariable(value = "restaurantId") final String restaurantId) {
        final List<Food> allFood = dao.findAll();
        System.out.println("getting all the foods");
        return new ResponseEntity<List<Food>>(allFood, HttpStatus.ACCEPTED);
    }
    
    @RequestMapping(value = "/food", method = RequestMethod.GET)
    public ResponseEntity<List<Food>> getfoodByrest() {
        	  final List<Food> allFood = dao.findAll();
              System.out.println("getting all the foods");
              return new ResponseEntity<List<Food>>(allFood, HttpStatus.ACCEPTED);
      

    }

    @RequestMapping(value = "/food", method = RequestMethod.POST)
    public ResponseEntity<String> addFoodDetails(@RequestBody final Food newFood) {
        try {
            dao.save(newFood);
            return new ResponseEntity<String>("sucess", HttpStatus.ACCEPTED);
        } catch (final Exception e) {
            return new ResponseEntity<String>("fail", HttpStatus.EXPECTATION_FAILED);
        }

    }

    @RequestMapping(value = "/food", method = RequestMethod.PUT)
    public ResponseEntity<String> updateFood(@RequestBody final Food newFood) {
        try {
            dao.save(newFood);
            return new ResponseEntity<String>("sucess", HttpStatus.ACCEPTED);
        } catch (final Exception e) {
            return new ResponseEntity<String>("fail", HttpStatus.EXPECTATION_FAILED);
        }
    }

    @RequestMapping(value = "/food", method = RequestMethod.DELETE)
    public ResponseEntity<String> registerUser(@RequestBody final Food newFood) {

        return null;
    }

}