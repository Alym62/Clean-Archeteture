package org.registry.people.core.usecases.fetch;

import org.registry.people.core.entity.People;
import org.registry.people.core.gateways.PeopleGateway;

import java.util.List;

public class FetchAllPeopleUseCaseImpl implements FetchAllPeopleUseCase{
    private final PeopleGateway gateway;

    public FetchAllPeopleUseCaseImpl(PeopleGateway gateway) {
        this.gateway = gateway;
    }

    @Override
    public List<People> fetchAll() {
        return gateway.fetchAll();
    }
}
