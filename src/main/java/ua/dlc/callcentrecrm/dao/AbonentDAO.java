package ua.dlc.callcentrecrm.dao;

import ua.dlc.callcentrecrm.model.Abonent;

import java.util.List;

public interface AbonentDAO {
    void save(Abonent abonent);
    Abonent findById(Long id);
    List<Abonent> findAll();
    List<Abonent> findByLastName(String theLastName);
}
