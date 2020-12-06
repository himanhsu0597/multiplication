package microservices.book.multiplication.service;

import microservices.book.multiplication.domain.MultiplicationResultAttempt;
import microservices.book.multiplication.domain.User;

import java.util.List;

public interface MultiplicationResultService {
    public List<MultiplicationResultAttempt> findAll();

}
