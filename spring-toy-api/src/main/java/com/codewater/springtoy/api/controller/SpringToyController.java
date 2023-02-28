package com.codewater.springtoy.api.controller;

import com.codewater.springtoy.core.services.ToyService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.codewater.springtoy.core.domain.bo.Toy;

import java.util.Optional;

@RestController
@RequestMapping("/toy")
@RequiredArgsConstructor
public class SpringToyController {

    @Autowired
    private final ToyService toyService;

    @GetMapping("/{toyName}")
    public Optional<Toy> getToyByName(@PathVariable String toyName) {
        return toyService.findByName(toyName);
    }


    @PostMapping
    public Integer createToy(@RequestBody Toy toy) {
        return toyService.save(toy).getId();
    }
}
