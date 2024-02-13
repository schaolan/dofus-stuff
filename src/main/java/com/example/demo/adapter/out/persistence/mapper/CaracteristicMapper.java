package com.example.demo.adapter.out.persistence.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import com.example.demo.adapter.out.persistence.entity.CaracteristicEntity;
import com.example.demo.application.domain.model.Caracteristic;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface CaracteristicMapper {
    Caracteristic toDto(CaracteristicEntity caracteristicEntity);

    @InheritInverseConfiguration
    CaracteristicEntity toEntity(Caracteristic caracteristic);

    CaracteristicEntity toEntity(Caracteristic caracteristic, @MappingTarget CaracteristicEntity caracteristicEntity);
}
