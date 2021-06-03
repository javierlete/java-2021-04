package com.ipartek.formacion.springdatajpa.repositorios;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ipartek.formacion.springdatajpa.entidades.Cliente;

public interface ClientesRepository extends CrudRepository<Cliente, Long> {
	List<Cliente> findByApellido(String apellido);
}
