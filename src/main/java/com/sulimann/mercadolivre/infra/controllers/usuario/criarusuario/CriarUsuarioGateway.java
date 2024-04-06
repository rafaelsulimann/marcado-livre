package com.sulimann.mercadolivre.infra.controllers.usuario.criarusuario;

import com.sulimann.mercadolivre.core.usecases.usuario.criarusuario.ICriarUsuarioGateway;
import com.sulimann.mercadolivre.core.usecases.usuario.criarusuario.ICriarUsuarioRequest;
import com.sulimann.mercadolivre.core.usecases.usuario.criarusuario.ICriarUsuarioResponse;
import com.sulimann.mercadolivre.infra.entities.UsuarioEntity;

import jakarta.persistence.EntityManager;

public class CriarUsuarioGateway implements ICriarUsuarioGateway{

  private final EntityManager manager;
  private final CriarUsuarioMapper mapper;

  public CriarUsuarioGateway(EntityManager manager, CriarUsuarioMapper mapper) {
    this.manager = manager;
    this.mapper = mapper;
  }

  @Override
  public ICriarUsuarioResponse execute(ICriarUsuarioRequest request) {
    UsuarioEntity entity = this.mapper.toEntity(request);
    this.manager.persist(entity);
    return this.mapper.toResponse(entity);
  }

}
