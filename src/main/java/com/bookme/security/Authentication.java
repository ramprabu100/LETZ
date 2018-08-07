
package com.bookme.security;

import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

import com.bookme.dao.UserDao;

public class Authentication {

    static ConcurrentHashMap<String, String> activeSession = new ConcurrentHashMap<String, String>();

    UserDao userDao = new UserDao();

    public boolean validateSessionID(final String sessionId) {
        if (activeSession.containsKey(sessionId)) {
            return true;
        }
        return false;
    }

    public boolean validateUser(final String userid, final String password) {
        System.out.print("validating user");

        return userDao.validate(userid, password);
    }

    public String getSessionId(final String userID) {
        final Random random = new Random();
        final String newSessionID = userID + random.nextInt();
        try {
            activeSession.put(newSessionID, userID);
        } catch (final Exception e) {
            return getSessionId(userID);
        }
        return newSessionID;
    }
}
