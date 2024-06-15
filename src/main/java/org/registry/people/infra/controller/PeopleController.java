package org.registry.people.infra.controller;

import lombok.AllArgsConstructor;
import org.registry.people.core.usecases.CreatePeopleUseCase;
import org.registry.people.infra.helpers.MapperPeople;
import org.registry.people.infra.payload.PeopleRecordDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/api/v1/people")
@AllArgsConstructor
public class PeopleController {
    private final CreatePeopleUseCase createPeopleUseCase;

    @PostMapping
    public ResponseEntity<PeopleRecordDTO> createPeople(@RequestBody PeopleRecordDTO dto) {
        var people = createPeopleUseCase.execute(MapperPeople.dtoRecordToRecordEntity(dto));

        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(dto)
                .toUri();

        return ResponseEntity.created(uri).body(MapperPeople.recordEntityToDTORecord(people));
    }
}
