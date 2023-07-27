package ua.dlc.callcentrecrm.dao.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.dlc.callcentrecrm.dao.AbonentDAO;
import ua.dlc.callcentrecrm.model.Abonent;

import java.util.List;

@Repository
public class AbonentDAOImpl implements AbonentDAO {

    private EntityManager entityManager;

    @Autowired
    public AbonentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional
    @Override
    public void save(Abonent abonent) {
        entityManager.persist(abonent);
    }

    @Override
    public Abonent findById(Long id) {
        return entityManager.find(Abonent.class, id);
    }

    @Override
    public List<Abonent> findAll() {
        // create query
        TypedQuery<Abonent> theQuery = entityManager.createQuery("FROM Abonent order by firstName DESC", Abonent.class);

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



}
