package com.company.dataAccess.concretes;

import com.company.dataAccess.abstracts.UserDao;
import com.company.entities.concretes.User;

public class UserDaoHibernate implements UserDao {
    @Override
    public void add(User user) {
        System.out.println("Kullanıcı eklendi " + user.getFirstName());
    }

    @Override
    public void update(User user) {
        System.out.println("Kullanıcı güncellendi" + user.getFirstName());
    }


    @Override
    public void delete(User user) {
        System.out.println("Kullanıcı silindi" + user.getFirstName());
    }
}