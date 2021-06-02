package com.ipartek.formacion.springmvc.controladores;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class Producto {
	private Long id;
	private String nombre;
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate fechaCaducidad;
	private BigDecimal precio;
}
