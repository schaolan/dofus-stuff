package com.example.demo.adapter.in.web;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface CharacterWebMapper {
    com.example.demo.api.model.Character toDto(com.example.demo.application.domain.model.Character character);

    com.example.demo.application.domain.model.Character toDomain(com.example.demo.api.model.Character character);
}