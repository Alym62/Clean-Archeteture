package org.registry.people.infra.helpers;

import org.registry.people.core.gateways.PeopleGateway;
import org.registry.people.core.usecases.create.CreatePeopleUseCase;
import org.registry.people.core.usecases.create.CreatePeopleUseCaseImpl;
import org.registry.people.core.usecases.fetch.FetchAllPeopleUseCase;
import org.registry.people.core.usecases.fetch.FetchAllPeopleUseCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelperUseCase {
    @Bean
    public CreatePeopleUseCase createPeopleUseCase(PeopleGateway peopleGateway) {
        return new CreatePeopleUseCaseImpl(peopleGateway);
    }

    @Bean
    public FetchAllPeopleUseCase fetchAllPeopleUseCase(PeopleGateway peopleGateway) {
        return new FetchAllPeopleUseCaseImpl(peopleGateway);
    }
}
