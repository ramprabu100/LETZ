package com.bookme.dao;

import java.util.List;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public abstract class DaoLayer<T> {

    static Configuration cfg;
    static SessionFactory factory;
    Session session;
    T temp;
    Class className;

    public DaoLayer() {
        if (factory == null) {
            cfg = new Configuration().configure();
            factory = cfg.buildSessionFactory();
        }
        setclassName();
        session = factory.openSession();
        final Transaction t = session.beginTransaction();
        t.commit();
        session.close();
    }

    public List<T> findAll() {
        session = factory.openSession();
        final Transaction t = session.beginTransaction();
        final Query<T> q = session.createQuery("from " + className.getName());
        List<T> temp=q.list();
        t.commit();
        session.close();
        return temp;
    }

    public T findOneByName(final String name, final String password) {
        session = factory.openSession();
        final Query<T> query = session.createQuery("from " + className.getName() + " where name = '" + name + "' and passWord = '" + password + "'");
        System.out.println(className);
        try {
            final List<T> singleUserList = query.list();

            final T temp = singleUserList.get(0);
            System.out.println(temp);
            return temp;
        } catch (final Exception e) {
            System.out.println("error" + e);
            return null;
        } finally {
            session.close();
        }
    }

    public T findById(final Integer id) {
        session = factory.openSession();
        System.out.println(className);
        final Transaction t = session.beginTransaction();
        temp = (T) session.get(className, id);
        t.commit();
        session.close();
        return temp;
    }

    public boolean save(final T objectToSave) {
        session = factory.openSession();
      
            final Transaction t = session.beginTransaction();
            session.save(objectToSave);
            System.out.println("saved sucessfully");
            t.commit();
            return true;
       
    }

    /**
     * @param parseFloat
     * @return
     */
    public List<T> findAllByRestaurant(final float restID) {
        session = factory.openSession();
        final Query query = session.createQuery("from " + className.getName() + " where restaurantID = " + restID);
        System.out.println("fetching all by restaurant id  " + className);
        try {
            final List<T> singleTableList = query.list();
            return singleTableList;
        } catch (final Exception e) {
            System.out.println("error" + e);
            return null;
        } finally {
            session.close();
        }
    }

    public abstract void setclassName();
}
