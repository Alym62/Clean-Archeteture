package org.registry.people.core.usecases;

import org.registry.people.core.entity.People;

import java.util.List;

public interface CreatePeopleUseCase {
    People execute(People people);
    List<People> fetchAll();
}
