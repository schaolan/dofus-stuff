package com.example.demo.application.domain.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.application.domain.model.Character;
import com.example.demo.application.domain.port.in.CharacterUseCase;
import com.example.demo.application.domain.port.out.CharacterPort;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CharacterService implements CharacterUseCase {

    private final CharacterPort characterPort;

    @Override
    public Character createCharacter(Character character) {
        return this.characterPort.createCharacter(character);
    }

    @Override
    public List<Character> findCharacter() {
        return this.characterPort.findCharacter();
    }

    @Override
    public Character getCharacter(Long id) {
        return this.characterPort.getCharacter(id);
    }

    @Override
    public void deleteCharacter(Long characterId) {
        this.characterPort.deleteCharacter(characterId);
    }

    @Override
    public Character updateCharacter(Long characterId, Character character) throws Exception {
        return this.characterPort.updateCharacter(characterId, character);
    }

}
