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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Food extends Item{
	

	String name;

	float price;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(final int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(final String name) {
		this.name = name;
	}

	/**
	 * @return the price
	 */
	public float getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(final float price) {
		this.price = price;
	}

	/**
	 * @return the restaurant
	 */

	float restaurantID;

	/**
	 * @return the restaurant
	 */
	public float getRestaurant() {
		return restaurantID;
	}

	/**
	 * @param restaurant the restaurant to set
	 */
	public void setRestaurant(final float restaurantID) {
		this.restaurantID = restaurantID;
	}

	/**
	 * @param id
	 * @param name
	 * @param price
	 * @param restaurant
	 */
	public Food(final String name, final float price, final float restaurantId) {
		super();
		this.name = name;
		this.price = price;
		this.restaurantID = restaurantId;
	}

	/**
	 *
	 */
	public Food() {
		super();
		// TODO Auto-generated constructor stu
	}

}
