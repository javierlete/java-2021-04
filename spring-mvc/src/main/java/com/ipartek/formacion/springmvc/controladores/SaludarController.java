package com.ipartek.formacion.springmvc.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SaludarController {
	@GetMapping("/saludar")
	public String obtenerSaludo(@RequestParam(name = "nombre", required = false, defaultValue="Mundo") String nombre, Model modelo) {
		modelo.addAttribute("nombre", nombre + " modificado");
		return "saludo";
	}
}
