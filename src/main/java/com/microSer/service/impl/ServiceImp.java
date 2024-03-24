package com.microSer.service.impl;

import com.microSer.data.entities.mapper.Mapperr;
import com.microSer.repository.Repository;
import com.microSer.service.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public abstract class ServiceImp<S, M, E> implements Service<S, M, E> {

    private final Repository<E> repository;
    private final Mapperr<S, M, E> mapper;

    protected ServiceImp(Repository<E> repository, Mapperr<S, M, E> mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public Page<M> findAll() {
        Pageable pageable = PageRequest.of(0, 10);
        Page<E> listUser = repository.findAll(pageable);
        return listUser.map(mapper::toEntityDtoSend);
    }

    public Optional<M> findById(Long id) {
        Optional<E> user = Optional.ofNullable(repository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found")));
        return user.map(mapper::toEntityDtoSend);
    }

    public M save(S s) {
        E e = mapper.dtoSaveToEntity(s);
        return mapper.toEntityDtoSend((repository.save(e)));
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public M update(S s, Long id) {
        /*Optional<E> eUpdate = Optional.of(repository.findById(id)
                .orElse(repository.save(mapper.entityToDtoSave(s))));
        repository.updateById(id, mapper.entityToDtoSave(s));
        return mapper.toEntityDtoSend((eUpdate.get()));

         */
        return null;
    }
}
