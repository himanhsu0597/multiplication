package microservices.book.multiplication.service;

import java.util.List;

import microservices.book.multiplication.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import microservices.book.multiplication.domain.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    private UserDAO UserDAO;

    @Autowired
    public UserServiceImpl(UserDAO theUserDAO) {
        UserDAO = theUserDAO;
    }

    @Override
    @Transactional
    public List<User> findAll() {
        return UserDAO.findAll();
    }

    @Override
    @Transactional
    public User findById(int theId) {
        return UserDAO.findById(theId);
    }



}
