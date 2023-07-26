package ua.dlc.callcentrecrm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.dlc.callcentrecrm.model.Abonent;

@Repository
public interface AbonentRepository extends JpaRepository<Abonent, Long> {

}
