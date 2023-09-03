package ua.dlc.callcentrecrm.service;

import java.util.List;
import ua.dlc.callcentrecrm.model.AbonentAudit;

public interface AbonentAuditService {

    AbonentAudit save(AbonentAudit abonentAudit);

    AbonentAudit findById(Long theId);

    List<AbonentAudit> findAll();

    void deleteById(Long theId);
}
