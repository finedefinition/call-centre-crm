package ua.dlc.callcentrecrm.dao;

import java.util.List;
import ua.dlc.callcentrecrm.model.Abonent;

public interface AbonentDao {
    Abonent save(Abonent abonent);

    Abonent findById(Long id);

    List<Abonent> findAll();

    List<Abonent> findByLastName(String theLastName);

    void deleteById(Long theId);
}
