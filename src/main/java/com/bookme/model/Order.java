package com.bookme.model;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.bookme.model.enumeration.OrderType;

@Entity(name="OrderTable")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    OrderType ordertype;

    float cost;

    int userId;

    Date dateOfOrder;
    
    @OneToOne(targetEntity=Item.class,optional=true)
    Item item;

    public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Order(final OrderType order, final float cost, final Date dateOfOrder) {
        super();
        this.ordertype = order;
        this.cost = cost;
        this.dateOfOrder = dateOfOrder;
    }

    /**
     *
     */
    public Order() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @param order
     * @param cost
     * @param userId
     * @param dateOfOrder
     */
    public Order(final OrderType order, final float cost, final int userId, final Date dateOfOrder) {
        super();
        this.ordertype = order;
        this.cost = cost;
        this.userId = userId;
        this.dateOfOrder = dateOfOrder;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public OrderType getOrdertype() {
		return ordertype;
	}

	public void setOrdertype(OrderType order) {
		this.ordertype = order;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Date getDateOfOrder() {
		return dateOfOrder;
	}

	public void setDateOfOrder(Date dateOfOrder) {
		this.dateOfOrder = dateOfOrder;
	}

}
