package ua.dlc.callcentrecrm.dao;

import ua.dlc.callcentrecrm.model.User;

public interface UserDao {

    User findByUserName(String userName);

    void save(User theUser);
}
