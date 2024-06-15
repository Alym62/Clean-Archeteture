package org.registry.people.infra.gateways;

import lombok.AllArgsConstructor;
import org.registry.people.core.entity.People;
import org.registry.people.core.gateways.PeopleGateway;
import org.registry.people.infra.helpers.MapperPeople;
import org.registry.people.infra.repository.PeopleRepository;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class PeopleGatewayImpl implements PeopleGateway {
    private final PeopleRepository repository;

    @Override
    public People create(People people) {
        var save = repository.save(MapperPeople.recordEntityToModel(people));
        return MapperPeople.modelToRecordEntity(save);
    }
}
