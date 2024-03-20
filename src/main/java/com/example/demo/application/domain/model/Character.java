package com.example.demo.application.domain.model;

import java.util.List;

/**
 * Character
 */
public record Character(Long id, String nickname, Integer level, List<CaracteristicDetail> caracteristics) {
}