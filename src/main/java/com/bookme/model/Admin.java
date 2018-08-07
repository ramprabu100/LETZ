/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2015
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.bookme.model;

import javax.persistence.Entity;

@Entity(name = "admintable")
public class Admin extends User {

    /**
     *
     */
    public Admin() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @param id
     * @param name
     * @param passWord
     * @param role
     */
    public Admin(final int id, final String name, final String passWord) {
        super(id, name, passWord, "Admin");
        // TODO Auto-generated constructor stub
    }

}
