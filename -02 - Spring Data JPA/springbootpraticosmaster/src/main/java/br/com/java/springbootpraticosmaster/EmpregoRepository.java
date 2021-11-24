package br.com.java.springbootpraticosmaster;

import org.springframework.data.repository.CrudRepository;

public interface EmpregoRepository extends CrudRepository<Emprego, Long> {
    
}
