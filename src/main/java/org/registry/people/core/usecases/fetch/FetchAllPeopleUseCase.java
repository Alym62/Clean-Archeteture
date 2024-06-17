package org.registry.people.core.usecases.fetch;

import org.registry.people.core.entity.People;

import java.util.List;

public interface FetchAllPeopleUseCase {
    List<People> fetchAll();
}
