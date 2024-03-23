package com.mil.ms.proyectos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mil.ms.proyectos.domain.Investigador;
import com.mil.ms.proyectos.exception.EntityNotFoundException;
import com.mil.ms.proyectos.exception.IlegalOperationException;
import com.mil.ms.proyectos.services.InvestigadorService;

@RestController
@RequestMapping("/api/v1/investigadores")
public class InvestigadorController {
	@Autowired
	private InvestigadorService investigadorService;
	@GetMapping
	public List<Investigador> listarInvestigadores(){
		return investigadorService.listartodos();
	}
	@GetMapping("/{id}")
	public Investigador listarPorId(@PathVariable Long id) {
		return investigadorService.buscarPorId(id);
	}
	@PostMapping
	public Investigador crearInvestigador(@RequestBody Investigador investigador) throws IlegalOperationException {
		return investigadorService.grabar(investigador);
	}
	@PutMapping("/{id}")
	public Investigador editarInvestigador(@PathVariable Long id, @RequestBody Investigador investigador) {
		Investigador invBD=investigadorService.buscarPorId(id);
		invBD.setApePat(investigador.getApePat());
		invBD.setApeMat(investigador.getApeMat());
		invBD.setNombres(investigador.getNombres());
		invBD.setDni(investigador.getDni());
		invBD.setEmail(investigador.getEmail());
		invBD.setFechaReg(investigador.getFechaReg());
		return investigadorService.actualizar(investigador, id);
	}
	@DeleteMapping("/{id}")
	public void eliminarInvestigador(@PathVariable Long id) throws EntityNotFoundException, IlegalOperationException {
		investigadorService.eliminar(id);
	}
	
}
