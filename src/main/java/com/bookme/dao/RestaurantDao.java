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
package com.bookme.dao;

import com.bookme.model.Restaurant;

public class RestaurantDao extends DaoLayer<Restaurant> {

    @Override
    public void setclassName() {
        // TODO Auto-generated method stub
        className = Restaurant.class;
    }

    /**
     *
     */
    public RestaurantDao() {
        super();
   
    }

}
