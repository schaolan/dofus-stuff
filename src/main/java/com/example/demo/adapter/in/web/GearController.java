package com.example.demo.adapter.in.web;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.application.domain.model.Gear;
import com.example.demo.application.domain.model.QueryFilter;
import com.example.demo.application.domain.port.in.GearUseCase;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequiredArgsConstructor
@CrossOrigin
public class GearController {

    private final GearUseCase gearUseCase;

    @GetMapping
    public ResponseEntity<List<Gear>> findGear(@RequestParam QueryFilter queryFilter) {
        return ResponseEntity.ok(this.gearUseCase.findGear(queryFilter));
    }

}
