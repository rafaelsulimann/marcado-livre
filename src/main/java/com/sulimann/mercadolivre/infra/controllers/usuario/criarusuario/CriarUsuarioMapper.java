package com.sulimann.mercadolivre.infra.controllers.usuario.criarusuario;

import java.time.LocalDateTime;
import java.time.ZoneId;

import org.springframework.stereotype.Component;

import com.sulimann.mercadolivre.core.usecases.usuario.criarusuario.ICriarUsuarioMapper;
import com.sulimann.mercadolivre.core.usecases.usuario.criarusuario.ICriarUsuarioRequest;
import com.sulimann.mercadolivre.core.usecases.usuario.criarusuario.ICriarUsuarioResponse;
import com.sulimann.mercadolivre.domain.enums.TipoUsuario;
import com.sulimann.mercadolivre.infra.entities.UsuarioEntity;

@Component
public class CriarUsuarioMapper implements ICriarUsuarioMapper<UsuarioEntity>{

  @Override
  public UsuarioEntity toEntity(ICriarUsuarioRequest request) {
    return new UsuarioEntity(request.getNome(), request.getEmail(), request.getDocumento(), TipoUsuario.valueOf(request.getTipo()), LocalDateTime.now(ZoneId.of("UTC")));
  }

  @Override
  public ICriarUsuarioResponse toResponse(UsuarioEntity entity) {
    return CriarUsuarioResponse.builder()
            .id(entity.getId())
            .nome(entity.getNome())
            .email(entity.getEmail())
            .documento(entity.getDocumento())
            .tipo(entity.getTipo())
            .dataCriacao(entity.getDataCriacao()).build();
  }

}
