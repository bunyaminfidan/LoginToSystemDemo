package com.company;

import com.company.business.abstracts.UserService;
import com.company.business.concretes.UserManager;
import com.company.dataAccess.concretes.UserDaoHibernate;
import com.company.entities.concretes.User;

public class Main {
    public static void main(String[] args) {

        User user = new User(1, "Bunyamin", "FIDAN", "bunyamnfdan@gmail.com", "122221");

        UserService userService = new UserManager(new UserDaoHibernate());
        userService.add(user);
    }
}
