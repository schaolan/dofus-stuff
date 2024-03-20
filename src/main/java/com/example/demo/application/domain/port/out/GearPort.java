package com.example.demo.application.domain.port.out;

import java.util.List;

import com.example.demo.application.domain.model.Gear;
import com.example.demo.application.domain.model.QueryFilter;

public interface GearPort {

    List<Gear> findGears(QueryFilter queryFilter);
    
}
