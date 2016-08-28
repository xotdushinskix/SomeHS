package com.nikita.security.dao;

import com.nikita.security.model.User;

import java.sql.SQLException;

/**
 * Created by FromxSoul on 29.08.2016.
 */
public interface UserDao {

    User getUserByLogin(String login) throws SQLException;

}
