package org.registry.people.core.usecases.create;

import org.registry.people.core.entity.People;

public interface CreatePeopleUseCase {
    People execute(People people);
}
