
package com.bookme.dao;

import com.bookme.model.Order;

public class OrderDao extends DaoLayer<Order> {

    public OrderDao() {
        super();

    }

    @Override
    public void setclassName() {
        // TODO Auto-generated method stub
        className = Order.class;
    }

}
