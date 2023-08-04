package ua.dlc.callcentrecrm.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.dlc.callcentrecrm.model.Abonent;

@Repository
public interface AbonentRepository extends JpaRepository<Abonent, Long> {

    List<Abonent> findByLastName(String theLastName);

    Abonent save(Abonent abonent);
}
