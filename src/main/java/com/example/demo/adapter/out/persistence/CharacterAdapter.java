package com.example.demo.adapter.out.persistence;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.application.domain.model.Character;
import com.example.demo.adapter.out.persistence.entity.CharacterEntity;
import com.example.demo.adapter.out.persistence.mapper.CharacterMapper;
import com.example.demo.adapter.out.persistence.repository.CharacterRepository;
import com.example.demo.application.domain.port.out.CharacterPort;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CharacterAdapter implements CharacterPort {

    private final CharacterRepository characterRepository;
    private final CharacterMapper characterMapper;

    @Override
    public Character createCharacter(Character character) {
        return this.characterMapper.toDto(this.characterRepository.save(this.characterMapper.toEntity(character)));
    }

    @Override
    public List<Character> findCharacter() {
        return this.characterRepository.findAll().stream().map(this.characterMapper::toDto).toList();
    }

    @Override
    public Character getCharacter(Long characterId) {
        return this.characterMapper.toDto(this.characterRepository.getReferenceById(characterId));
    }

    @Override
    public Character updateCharacter(Long characterId, Character character) throws Exception {
        CharacterEntity updated = this.characterMapper.toEntity(character,
                this.characterRepository.getReferenceById(characterId));
        if (updated == null) {
            throw new Exception(String.format("Character {} non trouvé", characterId));
        } else {
            return this.characterMapper.toDto(this.characterRepository.save(updated));
        }
    }

    @Override
    public void deleteCharacter(Long characterId) {
        this.characterRepository.deleteById(characterId);
    }
}
