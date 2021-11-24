package br.com.java.springbootpraticosmaster.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.java.springbootpraticosmaster.model.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {
    Role findByRole(String role);
}
