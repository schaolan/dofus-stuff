package com.example.demo.adapter.out.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.adapter.out.persistence.entity.GearEntity;

public interface GearRepository extends JpaRepository<GearEntity, Long> {
    
    
}
