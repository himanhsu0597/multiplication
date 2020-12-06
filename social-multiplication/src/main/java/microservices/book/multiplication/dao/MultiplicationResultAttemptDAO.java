package microservices.book.multiplication.dao;

import microservices.book.multiplication.domain.MultiplicationResultAttempt;


import java.util.List;

public interface MultiplicationResultAttemptDAO {

    public  List<MultiplicationResultAttempt> findAll();


}
