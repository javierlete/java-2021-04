package com.ipartek.formacion.springjdbc.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class Cliente {
	private Long id;
	private String nombre, apellido;
}
