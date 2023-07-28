package ua.dlc.callcentrecrm.dao.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.dlc.callcentrecrm.dao.AbonentDao;
import ua.dlc.callcentrecrm.model.Abonent;

@Repository
public class AbonentDaoImpl implements AbonentDao {

    private EntityManager entityManager;

    @Autowired
    public AbonentDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional
    @Override
    public Abonent save(Abonent abonent) {
        Abonent abonent1 = entityManager.merge(abonent);
        return abonent1;
    }

    @Override
    public Abonent findById(Long id) {
        return entityManager.find(Abonent.class, id);
    }

    @Override
    public List<Abonent> findAll() {
        // create query
        TypedQuery<Abonent> theQuery = entityManager.createQuery("FROM Abonent", Abonent.class);

        // return query results
        return theQuery.getResultList();
    }

    @Override
    public List<Abonent> findByLastName(String theLastName) {
        // create query
        TypedQuery<Abonent> theQuery = entityManager.createQuery(
                "FROM Abonent WHERE lastName=:theData", Abonent.class);

        // set query parameters
        theQuery.setParameter("theData", theLastName);

        // return query results
        return theQuery.getResultList();
    }

    @Override
    public void deleteById(Long theId) {
        // find Abonents by id
        Abonent abonent = entityManager.find(Abonent.class, theId);
        // remove employee
        entityManager.remove(abonent);
    }
}
