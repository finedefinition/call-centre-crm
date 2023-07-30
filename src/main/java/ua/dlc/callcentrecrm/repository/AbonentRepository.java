package ua.dlc.callcentrecrm.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import ua.dlc.callcentrecrm.model.Abonent;

public interface AbonentRepository extends JpaRepository<Abonent, Long> {

    List<Abonent> findByLastName(String theLastName);

    Abonent save(Abonent abonent);
}
