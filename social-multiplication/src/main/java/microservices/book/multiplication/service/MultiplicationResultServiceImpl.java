package microservices.book.multiplication.service;

import microservices.book.multiplication.dao.MultiplicationResultAttemptDAO;

import microservices.book.multiplication.domain.MultiplicationResultAttempt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MultiplicationResultServiceImpl implements MultiplicationResultService {

    private MultiplicationResultAttemptDAO MultiplicationResultAttemptDAO;

    @Autowired
    public MultiplicationResultServiceImpl(MultiplicationResultAttemptDAO theMultiplicationResultAttemptDAO) {
        MultiplicationResultAttemptDAO = theMultiplicationResultAttemptDAO;
    }

    @Override
    @Transactional
    public List<MultiplicationResultAttempt> findAll() {
        return MultiplicationResultAttemptDAO.findAll();
    }


}
