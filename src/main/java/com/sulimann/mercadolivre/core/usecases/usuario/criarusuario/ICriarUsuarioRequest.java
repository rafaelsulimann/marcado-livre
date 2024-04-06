package com.sulimann.mercadolivre.core.usecases.usuario.criarusuario;

public interface ICriarUsuarioRequest {

  String getNome();
  String getEmail();
  String getDocumento();
  String getTipo();

}
