package com.ipartek.formacion.holamundoarquitecturaspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HolamundoarquitecturaspringApplication implements CommandLineRunner {

	@Autowired
	ProveedorEntrada pe;
	@Autowired
	ProveedorSalida ps;
	
	public static void main(String[] args) {
		SpringApplication.run(HolamundoarquitecturaspringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ps.enviar(pe.getTexto());
	}

}
