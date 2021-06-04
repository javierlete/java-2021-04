package com.ipartek.formacion.clientesspring;

import org.springframework.data.repository.CrudRepository;

import com.ipartek.formacion.clientesspring.entidades.Cliente;

public interface ClientesRepository extends CrudRepository<Cliente, Long> {

}
