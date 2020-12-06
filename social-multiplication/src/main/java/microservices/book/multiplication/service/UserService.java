package microservices.book.multiplication.service;

import microservices.book.multiplication.domain.User;
import java.util.List;

public interface UserService {

    public List<User> findAll();
    public User findById(int theId);

}
