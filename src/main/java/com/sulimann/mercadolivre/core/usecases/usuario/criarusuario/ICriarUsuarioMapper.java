package com.sulimann.mercadolivre.core.usecases.usuario.criarusuario;

import com.sulimann.mercadolivre.domain.entities.IUsuario;

public interface ICriarUsuarioMapper<T extends IUsuario> {

  T toEntity(ICriarUsuarioRequest request);
  ICriarUsuarioResponse toResponse(T entity);

}
