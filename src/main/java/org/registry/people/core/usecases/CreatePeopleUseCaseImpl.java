package org.registry.people.core.usecases;

import org.registry.people.core.entity.People;
import org.registry.people.core.gateways.PeopleGateway;

public class CreatePeopleUseCaseImpl implements CreatePeopleUseCase {
    private final PeopleGateway gateway;

    public CreatePeopleUseCaseImpl(PeopleGateway gateway) {
        this.gateway = gateway;
    }

    @Override
    public People execute(People people) {
        return gateway.create(people);
    }
}
