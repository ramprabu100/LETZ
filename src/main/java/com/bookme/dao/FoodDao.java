
package com.bookme.dao;

import com.bookme.model.Food;

public class FoodDao extends DaoLayer<Food> {

    public FoodDao() {
        super();

    }

    @Override
    public void setclassName() {
        // TODO Auto-generated method stub
        className = Food.class;
    }

}
