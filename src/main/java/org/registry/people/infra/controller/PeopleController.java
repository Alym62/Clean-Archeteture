package org.registry.people.infra.controller;

import lombok.AllArgsConstructor;
import org.registry.people.core.usecases.CreatePeopleUseCase;
import org.registry.people.infra.helpers.MapperPeople;
import org.registry.people.infra.payload.PeopleRecordDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/v1/people")
@AllArgsConstructor
public class PeopleController {
    private final CreatePeopleUseCase createPeopleUseCase;

    @GetMapping
    public ResponseEntity<List<PeopleRecordDTO>> fetchAllPeople() {
        var listPeople = createPeopleUseCase.fetchAll()
                .stream()
                .map(MapperPeople::recordEntityToDTORecord).toList();

        return ResponseEntity.ok().body(listPeople);
    }

    @PostMapping
    public ResponseEntity<PeopleRecordDTO> createPeople(@RequestBody PeopleRecordDTO dto) {
        var people = createPeopleUseCase.execute(MapperPeople.dtoRecordToRecordEntity(dto));

        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(people.id())
                .toUri();

        return ResponseEntity.created(uri).body(MapperPeople.recordEntityToDTORecord(people));
    }
}
