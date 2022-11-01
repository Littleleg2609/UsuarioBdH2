package com.cadastroUsuario.cadastroUsuario.controllers;

import java.util.List;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.cadastroUsuario.cadastroUsuario.entities.User;
import com.cadastroUsuario.cadastroUsuario.repositories.UserRepository;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping
    public List<User> findAll() {
        return repository.findAll();
    }

    @GetMapping(value = "/{id}")
    public User findAll(@PathVariable Long id) {
        return repository.findById(id).get();
    }

    @PostMapping
    public User insert(@RequestBody User user) {
        return repository.save(user);
    }

    @DeleteMapping(value ="/{id}")
    public String delete( @PathVariable long id) {
        {
            repository.deleteById(id);

            return "Deletado";

        }
    }
}