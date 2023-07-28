package ua.dlc.callcentrecrm.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.dlc.callcentrecrm.dao.AbonentDao;
import ua.dlc.callcentrecrm.model.Abonent;
import ua.dlc.callcentrecrm.service.AbonentService;

@Service
public class AbonentServiceImpl implements AbonentService {

    private final AbonentDao abonentDao;

    public AbonentServiceImpl(AbonentDao abonentDao) {
        this.abonentDao = abonentDao;
    }

    @Transactional
    @Override
    public Abonent save(Abonent abonent) {
        return abonentDao.save(abonent);
    }

    @Override
    public Abonent findById(Long id) {
        return abonentDao.findById(id);
    }

    @Override
    public List<Abonent> findAll() {
        return abonentDao.findAll();
    }

    @Override
    public List<Abonent> findByLastName(String theLastName) {
        return abonentDao.findByLastName(theLastName);
    }

    @Transactional
    @Override
    public void deleteById(Long theId) {
        abonentDao.deleteById(theId);
    }
}
