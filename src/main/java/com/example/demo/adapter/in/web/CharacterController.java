package com.example.demo.adapter.in.web;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.example.demo.application.domain.model.Character;
import com.example.demo.application.domain.port.in.CharacterUseCase;

import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequiredArgsConstructor
@CrossOrigin
public class CharacterController {

    private final CharacterUseCase characterUseCase;

    @PostMapping("/characters")
    public ResponseEntity<Character> postCharacter(@RequestBody Character character, UriComponentsBuilder ucb) {
        Character response = this.characterUseCase.createCharacter(character);

        return ResponseEntity.created(ucb.path("characters/{id}")
                .buildAndExpand(response.id()).toUri())
                .body(response);
    }

    @GetMapping("/characters")
    public ResponseEntity<List<Character>> findCharacters() {
        return ResponseEntity.ok(this.characterUseCase.findCharacter());
    }

}
