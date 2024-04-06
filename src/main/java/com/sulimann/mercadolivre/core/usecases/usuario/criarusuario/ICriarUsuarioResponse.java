package com.sulimann.mercadolivre.core.usecases.usuario.criarusuario;

import java.time.LocalDateTime;

import com.sulimann.mercadolivre.domain.enums.TipoUsuario;

public interface ICriarUsuarioResponse {

  Long getId();
  String getNome();
  String getEmail();
  String getDocumento();
  TipoUsuario getTipo();
  LocalDateTime getDataCriacao();

}
