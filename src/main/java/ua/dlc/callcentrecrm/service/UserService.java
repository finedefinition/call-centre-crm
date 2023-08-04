package ua.dlc.callcentrecrm.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import ua.dlc.callcentrecrm.model.User;
import ua.dlc.callcentrecrm.user.WebUser;

public interface UserService extends UserDetailsService {

    public User findByUserName(String userName);

    void save(WebUser webUser);
}
