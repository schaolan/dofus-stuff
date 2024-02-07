package com.example.demo.adapter.out.persistence.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import com.example.demo.adapter.out.persistence.entity.CharacterEntity;
import com.example.demo.application.domain.model.Character;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface CharacterMapper {

    Character toDto(CharacterEntity characterEntity);

    @InheritInverseConfiguration
    CharacterEntity toEntity(Character character);

    CharacterEntity toEntity(Character character, @MappingTarget CharacterEntity characterEntity);

}
