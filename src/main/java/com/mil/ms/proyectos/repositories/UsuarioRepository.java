package com.mil.ms.proyectos.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mil.ms.proyectos.domain.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	Optional<Usuario> findByEmail(String email);
}
