package com.sulimann.mercadolivre.infra.controllers.usuario.criarusuario;

import org.springframework.stereotype.Component;

import com.sulimann.mercadolivre.core.usecases.usuario.criarusuario.ACriarUsuarioUseCase;
import com.sulimann.mercadolivre.infra.entities.UsuarioEntity;

@Component
public class CriarUsuarioUseCase extends ACriarUsuarioUseCase<UsuarioEntity>{

  public CriarUsuarioUseCase(CriarUsuarioMapper criarUsuarioMapper, CriarUsuarioRepository criarUsuarioRepository) {
    super(criarUsuarioMapper, criarUsuarioRepository);
  }

}
