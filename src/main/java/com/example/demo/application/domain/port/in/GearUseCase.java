package com.example.demo.application.domain.port.in;
import java.util.List;

import com.example.demo.application.domain.model.Gear;
import com.example.demo.application.domain.model.QueryFilter;

public interface GearUseCase {

    List<Gear> findGear(QueryFilter queryFilter);
    
}
