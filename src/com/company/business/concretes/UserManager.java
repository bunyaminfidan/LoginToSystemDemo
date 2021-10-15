package com.company.business.concretes;

import com.company.business.abstracts.UserService;
import com.company.core.core.userRegex.EmailCheck;
import com.company.core.core.userRegex.FirstNameCheck;
import com.company.core.core.userRegex.LastNameCheck;
import com.company.core.core.userRegex.PasswordCheck;
import com.company.dataAccess.abstracts.UserDao;
import com.company.entities.concretes.User;

public class UserManager implements UserService {

    private UserDao userDao;


    public UserManager(UserDao userDao) {
        this.userDao = userDao;

    }


    @Override
    public void add(User user) {
        boolean email = EmailCheck.validEmail(user.getEmail());
        boolean password = PasswordCheck.validPassword(user.getPassword());
        boolean firstName = FirstNameCheck.validFirstName(user.getFirstName());
        boolean lastName = LastNameCheck.validLastName(user.getLastName());

        if (!email) {
            System.out.println("Hatalı email adresi girdiniz");
            return;
        } else if (!password) {
            System.out.println("Şifreniz en az 6 haneli olmalıdır.");
            return;
        } else if (!lastName) {
            System.out.println("Soyadınız en az 2 haneli olmalıdır.");
            return;
        } else if (!firstName) {
            System.out.println("Adınız en az 2 haneli olmalıdır.");
            return;
        } else {
            userDao.add(user);


        }


    }

    @Override
    public void update(User user) {

    }

    @Override
    public void delete(User user) {

    }
}