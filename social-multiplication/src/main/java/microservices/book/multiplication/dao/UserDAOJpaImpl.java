package microservices.book.multiplication.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import microservices.book.multiplication.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAOJpaImpl implements UserDAO{

    private EntityManager entityManager;

    @Autowired
    public UserDAOJpaImpl(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }

    @Override
    public List<User> findAll() {

        // create a query
        Query theQuery =
                entityManager.createQuery("from User");

        // execute query and get result list
        List<User> Users = theQuery.getResultList();

        // return the results
        return Users;
    }

    @Override
    public User findById(int theId) {

        // get User
        User theUser =
                entityManager.find(User.class, theId);

        // return User
        return theUser;
    }


}
