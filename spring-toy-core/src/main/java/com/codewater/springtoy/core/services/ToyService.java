package com.codewater.springtoy.core.services;

import com.codewater.springtoy.core.domain.bo.Toy;
import com.codewater.springtoy.core.domain.repository.ToyRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ToyService {

    @Autowired
    private final ToyRepository toyRepository;

    public Toy save(Toy toy) {
        return toyRepository.save(toy);
    }

    public Optional<Toy> findByName(String name) {

        return toyRepository.findByName(name);
    }
}
