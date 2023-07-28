package ua.dlc.callcentrecrm.service;

import java.util.List;
import ua.dlc.callcentrecrm.model.Abonent;

public interface AbonentService {
    Abonent save(Abonent abonent);

    Abonent findById(Long id);

    List<Abonent> findAll();

    List<Abonent> findByLastName(String theLastName);

    void deleteById(Long theId);
}
