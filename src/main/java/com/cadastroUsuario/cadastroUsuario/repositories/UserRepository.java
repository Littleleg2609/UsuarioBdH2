package com.cadastroUsuario.cadastroUsuario.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cadastroUsuario.cadastroUsuario.entities.User;

public interface UserRepository extends JpaRepository<User,Long> {
}
