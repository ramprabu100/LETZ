package com.bookme.model;

import javax.persistence.Entity;

@Entity(name = "customertable")
public class Customer extends User {

    public Customer() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @param id
     * @param name
     * @param passWord
     * @param role
     */
    public Customer(final int id, final String name, final String passWord) {
        super(id, name, passWord, "customer");
        // TODO Auto-generated constructor stub
    }

}
