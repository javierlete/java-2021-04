package com.ipartek.formacion.springjdbc;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.ipartek.formacion.springjdbc.entidades.Cliente;

@SpringBootApplication
public class SpringJdbcApplication implements CommandLineRunner {

  private static final Logger log = LoggerFactory.getLogger(SpringJdbcApplication.class);

  public static void main(String args[]) {
    SpringApplication.run(SpringJdbcApplication.class, args);
  }

  @Autowired
  JdbcTemplate jdbcTemplate;

  @Override
  public void run(String... strings) throws Exception {

    log.info("Creating tables");

    jdbcTemplate.execute("DROP TABLE IF EXISTS clientes ");
    jdbcTemplate.execute("CREATE TABLE clientes(" +
        "id INTEGER PRIMARY KEY AUTOINCREMENT, nombre VARCHAR(255), apellido VARCHAR(255))");

    // Split up the array of whole names into an array of first/last names
    List<Object[]> splitUpNames = Arrays.asList("John Woo", "Jeff Dean", "Josh Bloch", "Josh Long")
    	.stream()
        .map(name -> name.split(" "))
        .collect(Collectors.toList());

    // Use a Java 8 stream to print out each tuple of the list
    splitUpNames.forEach(name -> log.info(String.format("Vamos a insertar registro %s %s", name[0], name[1])));

    // Uses JdbcTemplate's batchUpdate operation to bulk load data
    jdbcTemplate.batchUpdate("INSERT INTO clientes(nombre, apellido) VALUES (?,?)", splitUpNames);

    Cliente cliente = new Cliente(null, "Nuevo", "Nuevez");
    
    jdbcTemplate.update("INSERT INTO clientes (nombre, apellido) VALUES (?, ?)"
    		, cliente.getNombre() , cliente.getApellido());
    jdbcTemplate.update("UPDATE clientes SET nombre=?, apellido=? WHERE id=?"
    		, "Modificado", "Modificadez", 2L);
    jdbcTemplate.update("DELETE FROM clientes WHERE id = ?", 1L);
    
    List<Cliente> clientes = jdbcTemplate.query(
            "SELECT id, nombre, apellido FROM clientes",
            new BeanPropertyRowMapper<Cliente>(Cliente.class)
        );
    
    for(Cliente c: clientes) {
    	System.out.println(c);
    }
    
    cliente = jdbcTemplate.queryForObject(
            "SELECT id, nombre, apellido FROM clientes WHERE id=?",
            new BeanPropertyRowMapper<Cliente>(Cliente.class),
            2L
        );
    
    System.out.println(cliente);
    
    log.info("Buscando registros cuyo nombre = 'Josh':");
    jdbcTemplate.query(
        "SELECT id, nombre, apellido FROM clientes WHERE nombre = ?",
        (rs, numFila) -> new Cliente(rs.getLong("id"), rs.getString("nombre"), rs.getString("apellido")),
        "Josh"
    ).forEach(c -> log.info(c.toString()));
  }
}