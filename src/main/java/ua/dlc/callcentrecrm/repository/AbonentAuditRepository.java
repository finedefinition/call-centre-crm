package ua.dlc.callcentrecrm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.dlc.callcentrecrm.model.AbonentAudit;

@Repository
public interface AbonentAuditRepository extends JpaRepository<AbonentAudit, Long> {
}
