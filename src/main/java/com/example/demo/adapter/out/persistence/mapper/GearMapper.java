package com.example.demo.adapter.out.persistence.mapper;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

import com.example.demo.adapter.out.persistence.entity.GearEntity;
import com.example.demo.application.domain.model.Gear;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface GearMapper {

    Gear toDto(GearEntity gearEntity);

}
