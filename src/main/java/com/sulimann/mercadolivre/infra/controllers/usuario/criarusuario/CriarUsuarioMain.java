package com.sulimann.mercadolivre.infra.controllers.usuario.criarusuario;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sulimann.mercadolivre.core.usecases.usuario.criarusuario.CriarUsuarioUseCase;
import com.sulimann.mercadolivre.core.usecases.usuario.criarusuario.ICriarUsuarioGateway;

import jakarta.persistence.EntityManager;

@Configuration
public class CriarUsuarioMain {

  @Bean
  ICriarUsuarioGateway criarUsuarioGateway(EntityManager manager, CriarUsuarioMapper mapper){
    return new CriarUsuarioGateway(manager, mapper);
  }

  @Bean
  CriarUsuarioUseCase criarUsuarioUseCase(ICriarUsuarioGateway gateway){
    return new CriarUsuarioUseCase(gateway);
  }

}
