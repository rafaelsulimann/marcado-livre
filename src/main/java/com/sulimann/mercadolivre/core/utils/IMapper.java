package com.sulimann.mercadolivre.core.utils;

public interface IMapper<Entity, IRequest, IResponse> {

  public Entity toEntity(IRequest request);
  public IResponse toResponse(Entity entity);

}
