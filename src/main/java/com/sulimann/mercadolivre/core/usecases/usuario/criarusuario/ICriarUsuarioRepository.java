package com.sulimann.mercadolivre.core.usecases.usuario.criarusuario;

import com.sulimann.mercadolivre.domain.entities.IUsuario;

public interface ICriarUsuarioRepository<T extends IUsuario> {

  T salvar(T entity);

}
