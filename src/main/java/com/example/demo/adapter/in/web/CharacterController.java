package com.example.demo.adapter.in.web;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.example.demo.api.CharacterApi;
import com.example.demo.application.domain.model.Character;
import com.example.demo.application.domain.port.in.CharacterUseCase;

import lombok.RequiredArgsConstructor;
@RestController
@RequiredArgsConstructor
@CrossOrigin
public class CharacterController implements CharacterApi {

    private final CharacterUseCase characterUseCase;
    private final CharacterWebMapper characterMapper;

    @Override
    public ResponseEntity<com.example.demo.api.model.Character> createCharacter(UriComponentsBuilder uriComponentsBuilder, com.example.demo.api.model.Character character) throws Exception {
        Character response = this.characterUseCase.createCharacter(this.characterMapper.toDomain(character));
        return ResponseEntity.created(uriComponentsBuilder.path("characters/{id}")
                .buildAndExpand(response.id()).toUri())
                .body(this.characterMapper.toDto(response));
    }

    

    @GetMapping("/characters")
    public ResponseEntity<List<Character>> findCharacters() {
        return ResponseEntity.ok(this.characterUseCase.findCharacter());
    }

    @GetMapping("/characters/{id}")
    public ResponseEntity<Character> getCharacter(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.characterUseCase.getCharacter(id));

    }

}
