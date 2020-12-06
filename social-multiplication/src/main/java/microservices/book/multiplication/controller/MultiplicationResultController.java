package microservices.book.multiplication.controller;

import microservices.book.multiplication.domain.MultiplicationResultAttempt;

import microservices.book.multiplication.service.MultiplicationResultService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/show")
public class MultiplicationResultController {

    private MultiplicationResultService MultiplicationResultService;

    @Autowired
    public MultiplicationResultController(MultiplicationResultService theMultiplicationResultService) {
        MultiplicationResultService = theMultiplicationResultService;
    }

    // expose "/multiplication-attempt" and return list of attempts
    @GetMapping("/attempt")
    public List<MultiplicationResultAttempt> findAll() {
        return MultiplicationResultService.findAll();
    }
}
