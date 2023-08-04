package ua.dlc.callcentrecrm.dao;

import ua.dlc.callcentrecrm.model.Role;

public interface RoleDao {

    public Role findRoleByName(String theRoleName);

}
