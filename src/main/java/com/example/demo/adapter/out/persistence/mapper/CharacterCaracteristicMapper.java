package com.example.demo.adapter.out.persistence.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import com.example.demo.adapter.out.persistence.entity.CharacterCaracteristicEntity;
import com.example.demo.application.domain.model.CharacterCaracteristic;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface CharacterCaracteristicMapper {
    CharacterCaracteristic toDto(CharacterCaracteristicEntity caracteristicEntity);

    @InheritInverseConfiguration
    CharacterCaracteristicEntity toEntity(CharacterCaracteristic caracteristic);

    CharacterCaracteristicEntity toEntity(CharacterCaracteristic caracteristic,
            @MappingTarget CharacterCaracteristicEntity caracteristicEntity);
}
