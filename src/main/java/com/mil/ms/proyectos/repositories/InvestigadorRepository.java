package com.mil.ms.proyectos.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mil.ms.proyectos.domain.Investigador;

public interface InvestigadorRepository extends JpaRepository<Investigador, Long> {
	Optional<Investigador> findByDni(String dni);
	Optional<Investigador> findByEmail(String email);

}
