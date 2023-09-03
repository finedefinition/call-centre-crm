package ua.dlc.callcentrecrm.service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import ua.dlc.callcentrecrm.model.AbonentAudit;
import ua.dlc.callcentrecrm.repository.AbonentAuditRepository;

@Service
public class AbonentAuditServiceImpl implements AbonentAuditService {

    private final AbonentAuditRepository abonentAuditRepository;

    public AbonentAuditServiceImpl(AbonentAuditRepository abonentAuditRepository) {
        this.abonentAuditRepository = abonentAuditRepository;
    }

    @Override
    public AbonentAudit save(AbonentAudit abonentAudit) {
        return abonentAuditRepository.save(abonentAudit);
    }

    @Override
    public AbonentAudit findById(Long theId) {
        Optional<AbonentAudit> result = abonentAuditRepository.findById(theId);
        AbonentAudit abonentAudit = null;
        if (result.isPresent()) {
            abonentAudit = result.get();
        } else {
            // we didn't find the abonentAbonent
            throw new RuntimeException("Did not find abonentAudit theId - " + theId);
        }

        return abonentAudit;
    }

    @Override
    public List<AbonentAudit> findAll() {
        return abonentAuditRepository.findAll();
    }

    @Override
    public void deleteById(Long theId) {
        abonentAuditRepository.deleteById(theId);
    }
}
