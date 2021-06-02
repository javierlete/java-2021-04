package com.ipartek.formacion.springmvc.controladores;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
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
	public String recibirDatosFormulario(@Valid Producto producto, BindingResult validacion) {
		if(validacion.hasErrors()) {
			System.out.println(validacion);
			return "producto";
		}
		System.out.println(producto);
		return "productoagregado";
	}
	
	
}
