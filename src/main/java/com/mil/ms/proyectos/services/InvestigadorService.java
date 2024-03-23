package com.mil.ms.proyectos.services;

import java.util.List;

import com.mil.ms.proyectos.domain.Investigador;
import com.mil.ms.proyectos.exception.EntityNotFoundException;
import com.mil.ms.proyectos.exception.IlegalOperationException;

public interface InvestigadorService {
	List<Investigador> listartodos();
	Investigador buscarPorId(Long id);
	Investigador grabar(Investigador investigador) throws IlegalOperationException ;
	Investigador actualizar(Investigador investigador, long id) throws EntityNotFoundException;
	void eliminar(Long id)throws EntityNotFoundException, IlegalOperationException;
	Investigador findByDni(String dni);
	Investigador findByEmail(String email);
}
