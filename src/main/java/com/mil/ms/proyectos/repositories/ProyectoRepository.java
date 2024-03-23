package com.mil.ms.proyectos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mil.ms.proyectos.domain.ProyectoInvestigacion;

public interface ProyectoRepository extends JpaRepository<ProyectoInvestigacion, Long> {

}
