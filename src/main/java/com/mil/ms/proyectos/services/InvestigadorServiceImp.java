package com.mil.ms.proyectos.services;

import java.util.List;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mil.ms.proyectos.domain.Investigador;

import com.mil.ms.proyectos.repositories.InvestigadorRepository;

import jakarta.transaction.Transactional;

@Service
public class InvestigadorServiceImp implements InvestigadorService {
	
	@Autowired
	private InvestigadorRepository invRep;

	@Override
	@Transactional
	public List<Investigador> listartodos() {
		return invRep.findAll();
	}

	@Override
	@Transactional
	public Investigador buscarPorId(Long id) {
		Optional<Investigador> investigador=invRep.findById(id);
		return investigador.get();
	}

	@Override
	@Transactional
	public Investigador grabar(Investigador investigador) {
		return invRep.save(investigador);
	}

	@Override
	public Investigador actualizar(Investigador investigador, long id) {
		investigador.setIdInvestigador(id);
		return invRep.save(investigador);
	}

	@Override
	@Transactional
	public void eliminar(Long id) {
		invRep.deleteById(id);

	}

	@Override
	public Investigador findByDni(String dni) {
		Optional<Investigador> inv=invRep.findByDni(dni);
		return inv.get();
	}

	@Override
	public Investigador findByEmail(String email) {
		Optional<Investigador> inv=invRep.findByEmail(email);
		return inv.get();
	}

}
