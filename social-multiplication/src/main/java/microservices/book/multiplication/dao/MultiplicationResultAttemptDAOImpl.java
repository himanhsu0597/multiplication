package microservices.book.multiplication.dao;

import microservices.book.multiplication.domain.MultiplicationResultAttempt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;
@Repository
public class MultiplicationResultAttemptDAOImpl implements MultiplicationResultAttemptDAO{



    private EntityManager entityManager;

    @Autowired
    public MultiplicationResultAttemptDAOImpl(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }

    @Override
    public List<MultiplicationResultAttempt> findAll() {

        // create a query
        Query theQuery =
                entityManager.createQuery("from MultiplicationResultAttempt");

        // execute query and get result list
        List<MultiplicationResultAttempt> Attempts = theQuery.getResultList();

        // return the results
        return Attempts;
    }




}
