package com.dsousa.minhasfinancas.model.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dsousa.minhasfinancas.model.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	//optional, pois ele pode existir ou nao. aula 31
	//Optional<Usuario> findByEmail(String email);
	
	//o exists apenas retorna se exite ou nao
	boolean existsByEmail(String email);
}
