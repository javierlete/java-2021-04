package com.ipartek.formacion.clientesspring.controladores;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ipartek.formacion.clientesspring.entidades.Cliente;
import com.ipartek.formacion.clientesspring.servicios.ClienteService;

@Controller
public class ClientesController {
	@Autowired
	private ClienteService servicio;
	
	@GetMapping("/")
	public String listado(Model modelo) {
		modelo.addAttribute("clientes", servicio.listar());
		return "listado";
	}
	

	@GetMapping("/cliente")
	public String mostrarVacio(Cliente cliente) {
		return "cliente";
	}
	
	@GetMapping("/cliente/{id}")
	public String mostrar(@PathVariable Long id, Model modelo) {
		modelo.addAttribute("cliente", servicio.obtenerPorId(id));
		return "cliente";
	}
	
	@GetMapping("/cliente/borrar/{id}")
	public String borrar(@PathVariable Long id) {
		servicio.eliminar(id);
		return "redirect:/";
	}
	
	@PostMapping("/cliente")
	public String editar(@Valid Cliente cliente, BindingResult validacion, @RequestParam String id) {
		if(validacion.hasErrors()) {
			return "cliente";
		}
		
		if(id.trim().length() != 0) {
			cliente.setId(Long.parseLong(id));
			servicio.editar(cliente);
		} else {
			servicio.agregar(cliente);
		}
		return "redirect:/";
	}
}
