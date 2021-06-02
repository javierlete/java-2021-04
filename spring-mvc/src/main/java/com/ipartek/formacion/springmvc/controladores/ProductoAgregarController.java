package com.ipartek.formacion.springmvc.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/productoagregar")
public class ProductoAgregarController {
	@GetMapping
	public String mostrarFormulario(Producto producto) {
		return "producto";
	}
	
	@PostMapping
	public String recibirDatosFormulario(Producto producto) {
		System.out.println(producto);
		return "productoagregado";
	}
	
	
}
