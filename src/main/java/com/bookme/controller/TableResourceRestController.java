package com.bookme.controller;

import java.util.List;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import com.bookme.dao.TableDao;
import com.bookme.model.Tables;

@RestController(value = "/rest/2/")
public class TableResourceRestController {
    TableDao dao = new TableDao();

    @RequestMapping(value = "/table/{restaurantId}", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Tables>> getallTable(@PathVariable(value = "restaurantId") final String restaurantId) {
        System.out.println("getting all the Tables");

        final List<Tables> table = dao.findAllByRestaurant(Float.parseFloat(restaurantId));
        System.out.println(table);
        return new ResponseEntity<List<Tables>>(table, HttpStatus.ACCEPTED);
    }

    @RequestMapping(value = "/table", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> addTableDetails(@RequestBody final Tables newTable) {
        try {
            dao.save(newTable);
            return new ResponseEntity<String>("sucess", HttpStatus.ACCEPTED);
        } catch (final Exception e) {
            return new ResponseEntity<String>("fail", HttpStatus.EXPECTATION_FAILED);
        }
    }

    @RequestMapping(value = "/table", method = RequestMethod.PUT)
    public ResponseEntity<String> updateTable(@RequestBody final Tables newTable) {
        try {
            dao.save(newTable);
            return new ResponseEntity<String>("sucess", HttpStatus.ACCEPTED);
        } catch (final Exception e) {
            return new ResponseEntity<String>("fail", HttpStatus.EXPECTATION_FAILED);
        }
    }

    @RequestMapping(value = "/table", method = RequestMethod.DELETE)
    public ResponseEntity<String> registerUser(@RequestBody final Tables newTable) {
        try {
            dao.save(newTable);
            return new ResponseEntity<String>("sucess", HttpStatus.ACCEPTED);
        } catch (final Exception e) {
            return new ResponseEntity<String>("fail", HttpStatus.EXPECTATION_FAILED);
        }
    }

}