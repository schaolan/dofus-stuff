package com.example.demo.adapter.out.persistence;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.adapter.out.persistence.mapper.GearMapper;
import com.example.demo.adapter.out.persistence.repository.GearRepository;
import com.example.demo.application.domain.model.Gear;
import com.example.demo.application.domain.model.QueryFilter;
import com.example.demo.application.domain.port.out.GearPort;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class GearAdapter implements GearPort {

    private final GearRepository gearRepository;
    private final GearMapper gearMapper;

    @Override
    public List<Gear> findGears(QueryFilter queryFilter) {
        return this.gearRepository.findAll().stream().map(this.gearMapper::toDto).toList();
    }

}
