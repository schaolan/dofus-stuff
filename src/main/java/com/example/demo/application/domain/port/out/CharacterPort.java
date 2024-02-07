package com.example.demo.application.domain.port.out;

import com.example.demo.application.domain.model.Character;
import java.util.List;

public interface CharacterPort {
    Character createCharacter(Character character);

    Character updateCharacter(Long characterId, Character character) throws Exception;

    Character getCharacter(Long characterId);

    List<Character> findCharacter();

    void deleteCharacter(Long characterId);
}
