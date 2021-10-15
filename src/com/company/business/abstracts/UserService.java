package com.company.business.abstracts;

import com.company.entities.concretes.User;

public interface UserService {

    void add(User user);

    void update(User user);

    void delete(User user);
}
