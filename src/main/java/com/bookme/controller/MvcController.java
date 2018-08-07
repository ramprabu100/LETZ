package com.bookme.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MvcController {
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home(final Locale locale, final Model model) {
        System.out.println("Home Page Requested, locale = " + locale);
        final Date date = new Date();
        final DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
        final String formattedDate = dateFormat.format(date);
        model.addAttribute("serverTime", formattedDate);
        return "home";
    }

    @RequestMapping(value = "/app", method = RequestMethod.GET)
    public String app(final Locale locale, final Model model) {
        System.out.println("loading app");
        return "app";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(final Locale locale, final Model model) {
        System.out.println("redirecting to login");
        return "login";
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String register(final Locale locale, final Model model) {
        System.out.println("redirecting to login");
        return "register";
    }

}
