package com.sulimann.mercadolivre.domain.entities;

import com.sulimann.mercadolivre.domain.enums.TipoUsuario;

public interface IUsuario{
  String getNome();
  String getEmail();
  String getDocumento();
  TipoUsuario getTipo();
}
