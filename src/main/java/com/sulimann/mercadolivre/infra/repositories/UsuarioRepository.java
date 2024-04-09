package com.sulimann.mercadolivre.infra.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sulimann.mercadolivre.infra.entities.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long>{

}
