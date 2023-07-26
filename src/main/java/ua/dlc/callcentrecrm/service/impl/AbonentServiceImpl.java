package ua.dlc.callcentrecrm.service.impl;

import org.springframework.stereotype.Service;
import ua.dlc.callcentrecrm.model.Abonent;
import ua.dlc.callcentrecrm.repository.AbonentRepository;
import ua.dlc.callcentrecrm.service.AbonentService;

@Service
public class AbonentServiceImpl implements AbonentService {

    private final AbonentRepository abonentRepository;

    public AbonentServiceImpl(AbonentRepository abonentRepository) {
        this.abonentRepository = abonentRepository;
    }

    @Override
    public void save(Abonent abonent) {
        abonentRepository.save(abonent);
    }
}
