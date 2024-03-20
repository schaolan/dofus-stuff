package com.example.demo.application.domain.model;

import java.util.List;

public record Gear(Long id, String label, List<CaracteristicDetail> caracteristics) {

}
