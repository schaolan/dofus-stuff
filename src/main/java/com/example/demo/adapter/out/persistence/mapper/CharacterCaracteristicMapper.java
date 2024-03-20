package com.example.demo.adapter.out.persistence.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import com.example.demo.adapter.out.persistence.entity.CharacterCaracteristicEntity;
import com.example.demo.application.domain.model.CaracteristicDetail;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface CharacterCaracteristicMapper {
    CaracteristicDetail toDto(CharacterCaracteristicEntity caracteristicEntity);

    @InheritInverseConfiguration
    CharacterCaracteristicEntity toEntity(CaracteristicDetail caracteristic);

    CharacterCaracteristicEntity toEntity(CaracteristicDetail caracteristic,
            @MappingTarget CharacterCaracteristicEntity caracteristicEntity);
}
