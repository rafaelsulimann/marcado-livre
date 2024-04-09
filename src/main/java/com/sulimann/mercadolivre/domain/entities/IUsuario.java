package com.sulimann.mercadolivre.domain.entities;

import java.time.LocalDateTime;

import com.sulimann.mercadolivre.domain.enums.TipoUsuario;

public interface IUsuario{
  Long getId();
  String getNome();
  String getEmail();
  String getDocumento();
  TipoUsuario getTipo();
  LocalDateTime getDataCriacao();
}
