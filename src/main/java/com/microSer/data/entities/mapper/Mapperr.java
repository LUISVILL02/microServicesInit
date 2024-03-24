package com.microSer.data.entities.mapper;

public interface Mapperr<S, M, E>{
    S toEntityDtoSave(E e);
    E dtoSaveToEntity(S s);
    M toEntityDtoSend(E e);
    E dtoSendToEntity(M m);
}
