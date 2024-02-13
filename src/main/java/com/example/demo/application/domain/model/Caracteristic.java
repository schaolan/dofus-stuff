package com.example.demo.application.domain.model;

import com.example.demo.application.domain.model.enumeration.CaracteristicElement;
import com.example.demo.application.domain.model.enumeration.CaracteristicType;

public record Caracteristic(Long id, String label, CaracteristicType type, CaracteristicElement element, String icon) {

}
