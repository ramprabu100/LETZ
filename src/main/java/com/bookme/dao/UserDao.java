
package com.bookme.dao;

import com.bookme.model.*;

public class UserDao extends DaoLayer<User> {

    public UserDao() {
        super();

    }

        // TODO Auto-generated method stub
    public boolean validate(final String userid, final String password) {
        if (this.findOneByName(userid, password) != null) {
            return true;
        }
        return false;
    }

    @Override
    public void setclassName() {
        // TODO Auto-generated method stub
        className = User.class;
    }

}
