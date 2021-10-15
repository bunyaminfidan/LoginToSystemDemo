package com.company.dataAccess.abstracts;

import com.company.entities.concretes.User;

public interface UserDao {

    void add(User user);

    void update(User user);

    void delete(User user);
}
