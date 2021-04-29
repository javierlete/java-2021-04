package com.ipartek.formacion.poo;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonaTest {
	private static Persona persona;

	@BeforeEach
	void setUp() throws Exception {
		persona = new Persona();
	}

	@Test
	void testSetFechaNacimientoIntIntInt() {
		persona.setFechaNacimiento(1980, 1, 1);
		assertEquals(LocalDate.of(1980, 1, 1), persona.getFechaNacimiento());

		assertThrows(RuntimeException.class, () -> {
			persona.setFechaNacimiento(10000, 1, 1);
		});

		assertThrows(RuntimeException.class, () -> {
			persona.setFechaNacimiento(100, 1, 1);
		});

	}

	@Test
	void personaSetNombre() {
		assertThrows(RuntimeException.class, () -> {
			persona.setNombre(null);
		});
		assertThrows(RuntimeException.class, () -> {
			persona.setNombre("");
		});
		assertThrows(RuntimeException.class, () -> {
			persona.setNombre("        ");
		});
		assertDoesNotThrow(() -> {
			persona.setNombre("       prueba      ");
		});

		assertEquals("prueba", persona.getNombre());
	}

	@Test
	void personaConstructor() {
		Persona p = new Persona();
		assertEquals(Persona.NOMBRE_POR_DEFECTO, p.getNombre());
		assertEquals(Persona.FECHA_POR_DEFECTO, p.getFechaNacimiento());
	}

}
