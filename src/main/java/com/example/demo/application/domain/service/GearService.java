package com.example.demo.application.domain.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.application.domain.model.Gear;
import com.example.demo.application.domain.model.QueryFilter;
import com.example.demo.application.domain.port.in.GearUseCase;
import com.example.demo.application.domain.port.out.GearPort;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class GearService implements GearUseCase {

    private final GearPort gearPort;

    @Override
    public List<Gear> findGear(QueryFilter queryFilter) {
        return this.gearPort.findGears(queryFilter);
    }
}
