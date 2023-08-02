package ua.dlc.callcentrecrm.service;

import java.time.Clock;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import ua.dlc.callcentrecrm.model.Abonent;
import ua.dlc.callcentrecrm.repository.AbonentRepository;

@Service
public class AbonentServiceImpl implements AbonentService {

    private final AbonentRepository abonentRepository;

    public AbonentServiceImpl(AbonentRepository abonentRepository) {
        this.abonentRepository = abonentRepository;
    }

    @Override
    public Abonent save(Abonent abonent) {

        if (abonent.getCreatedAt() == null) {
            abonent.setCreatedAt(LocalDateTime.now(Clock.systemUTC()));
        } else {
            abonent.setUpdatedAt(LocalDateTime.now(Clock.systemUTC()));
        }
        return abonentRepository.save(abonent);
    }

    @Override
    public Abonent update(Abonent abonent) {
        return abonentRepository.save(abonent);
    }

    @Override
    public Abonent findById(Long theId) {
        Optional<Abonent> result = abonentRepository.findById(theId);

        Abonent abonent = null;

        if (result.isPresent()) {
            abonent = result.get();
        } else {
            // we didn't find the abonent
            throw new RuntimeException("Did not find abonent theId - " + theId);
        }

        return abonent;
    }

    @Override
    public List<Abonent> findAll() {
        return abonentRepository.findAll();
    }

    @Override
    public List<Abonent> findByLastName(String theLastName) {
        return abonentRepository.findByLastName(theLastName);
    }

    @Override
    public void deleteById(Long theId) {
        abonentRepository.deleteById(theId);
    }
}
