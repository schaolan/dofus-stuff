package com.example.demo.application.domain.port.in;

import java.util.List;

import com.example.demo.application.domain.model.Character;

public interface CharacterUseCase {
    Character createCharacter(Character character);

    List<Character> findCharacter();
}
