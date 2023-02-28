package com.codewater.springtoy.core.domain.repository;

import com.codewater.springtoy.core.domain.bo.Toy;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface ToyRepository extends CrudRepository<Toy, Integer> {
    public Optional<Toy> findByName(String name);

}
