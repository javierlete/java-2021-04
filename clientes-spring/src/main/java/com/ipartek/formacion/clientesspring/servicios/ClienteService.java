package com.ipartek.formacion.clientesspring.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ipartek.formacion.clientesspring.entidades.Cliente;
import com.ipartek.formacion.clientesspring.repositorios.ClientesRepository;

@Service
public class ClienteService {
	@Autowired
	private ClientesRepository repo;
	
	public void agregar(Cliente cliente) {
		repo.save(cliente);
	}
	
	public void editar(Cliente cliente) {
		repo.save(cliente);
	}
	
	public void eliminar(Long id) {
		repo.deleteById(id);
	}
	
	public List<Cliente> listar() {
		return (List<Cliente>) repo.findAll();
	}
	
//	public Optional<Cliente> obtenerPorId(Long id) {
//		return repo.findById(id);
//	}
	
	public Cliente obtenerPorId(Long id) {
		return repo.findById(id).orElse(null);
	}
}
