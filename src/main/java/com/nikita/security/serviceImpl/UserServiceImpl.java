package com.nikita.security.serviceImpl;

import com.nikita.security.dao.UserDao;
import com.nikita.security.model.User;
import com.nikita.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

/**
 * Created by FromxSoul on 29.08.2016.
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserByLogin(String login) throws SQLException {
        return userDao.getUserByLogin(login);
    }
}
