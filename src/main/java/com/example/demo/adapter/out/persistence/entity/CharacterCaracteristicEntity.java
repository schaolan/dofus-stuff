package com.example.demo.adapter.out.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "Character_caracteristic")
public class CharacterCaracteristicEntity {

    @Id
    @ManyToOne
    @JoinColumn(name = "character_id", nullable = false)
    private CharacterEntity character;
    @Id
    @ManyToOne
    @JoinColumn(name = "caracteristic_id", nullable = false)
    private CaracteristicEntity caracteristic;

    private Integer quantity;
}
