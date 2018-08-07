package com.bookme.controller;

import java.io.IOException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import com.bookme.dao.DaoLayer;
import com.bookme.dao.UserDao;
import com.bookme.model.Customer;
import com.bookme.model.User;
import com.bookme.security.Authentication;

@RestController("/rest")
public class UserRestController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String check() {
        System.out.println("rest api is  working");
        return "no error";
    }

    @RequestMapping(value = "/rest/user", method = RequestMethod.GET)
    public String getUserDetails() {
        final DaoLayer<User> dao = new UserDao();
        System.out.println("getting current user");
        return dao.findById(1).toString();
    }

    @RequestMapping(value = "/register/user", method = RequestMethod.POST)
    public ResponseEntity<String> registerUser(@RequestParam(value = "username") final String username,
                                               @RequestParam(value = "password") final String password) {
        final UserDao userDao = new UserDao();
        userDao.save(new Customer(100, "username", "password"));
        return new ResponseEntity<String>(HttpStatus.ACCEPTED);
    }

    @RequestMapping(value = "/login/user", method = RequestMethod.POST)
    public ResponseEntity<String> loginUser(@RequestParam(value = "username") final String username,
                                            @RequestParam(value = "password") final String password, final HttpServletResponse response) {
        System.out.println("login user" + username + " " + password);
        final Authentication auth = new Authentication();
        HttpHeaders headers = null;
        if (auth.validateUser(username, password)) {
            headers = new HttpHeaders();
            final String sessionID = auth.getSessionId(username);
            headers.add("Location", "/OnlineRestaurantBooking/app");
            final Cookie ck = new Cookie("sessionId", sessionID);
            final Cookie userCookie= new Cookie("userId",username);
            ck.setPath("/");
            userCookie.setPath("/");
            response.addCookie(ck);
            response.addCookie(userCookie);
            try {
                response.sendRedirect("/OnlineRestaurantBooking/app");
            } catch (final IOException e) {

                e.printStackTrace();
            }
        } else {
            return new ResponseEntity<String>(HttpStatus.EXPECTATION_FAILED);
        }

        return new ResponseEntity<String>(headers, HttpStatus.ACCEPTED);
    }

}