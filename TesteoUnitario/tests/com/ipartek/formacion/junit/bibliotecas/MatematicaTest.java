package com.ipartek.formacion.junit.bibliotecas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MatematicaTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void sumar() {
		int total = Matematica.sumar(5, 7);
		assertEquals(12, total);
	}
	
	@Test
	void restar() {
		int total = Matematica.restar(5,3);
		assertEquals(2, total);
	}

}
