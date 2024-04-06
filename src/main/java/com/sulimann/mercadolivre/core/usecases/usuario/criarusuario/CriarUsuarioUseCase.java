package com.sulimann.mercadolivre.core.usecases.usuario.criarusuario;

public class CriarUsuarioUseCase {

  private final ICriarUsuarioGateway criarUsuarioGateway;

  public CriarUsuarioUseCase(ICriarUsuarioGateway criarUsuarioGateway){
    this.criarUsuarioGateway = criarUsuarioGateway;
  }

  public ICriarUsuarioResponse criarUsuario(ICriarUsuarioRequest request) {
    return this.criarUsuarioGateway.execute(request) ;
  }

}
