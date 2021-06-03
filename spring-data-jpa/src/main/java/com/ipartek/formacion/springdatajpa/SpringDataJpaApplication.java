package com.ipartek.formacion.springdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ipartek.formacion.springdatajpa.entidades.Cliente;
import com.ipartek.formacion.springdatajpa.repositorios.ClientesRepository;

@SpringBootApplication
public class SpringDataJpaApplication implements CommandLineRunner {

	public static void main(String[] args)  {
		SpringApplication.run(SpringDataJpaApplication.class, args);
	}

	@Autowired
	private ClientesRepository repo;

	private void mostrarTodos() {
		System.out.println("****");
		for (Cliente cliente : repo.findAll()) {
			System.out.println(cliente);
		}
		System.out.println("----");
	}

	@Override
	public void run(String... args) throws Exception {
		Cliente cliente = new Cliente(null, "Javier", "Lete");

		mostrarTodos();

		repo.save(cliente);

		mostrarTodos();

		System.out.println(repo.findById(1L));

		cliente.setApellido("El profe");

		repo.save(cliente);

		mostrarTodos();

		repo.deleteById(1L);

		mostrarTodos();
	}

}
