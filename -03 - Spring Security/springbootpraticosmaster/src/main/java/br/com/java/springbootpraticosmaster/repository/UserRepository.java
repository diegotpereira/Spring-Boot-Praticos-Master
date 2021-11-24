package br.com.java.springbootpraticosmaster.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.java.springbootpraticosmaster.model.User;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
