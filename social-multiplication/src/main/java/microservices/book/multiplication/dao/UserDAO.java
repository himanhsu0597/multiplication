package microservices.book.multiplication.dao;

import microservices.book.multiplication.domain.User;

import java.util.List;

public interface UserDAO {
    public List<User> findAll();

    public User findById(int theId);
}
