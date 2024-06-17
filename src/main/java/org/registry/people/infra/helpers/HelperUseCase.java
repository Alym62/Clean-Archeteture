package org.registry.people.infra.helpers;

import org.registry.people.core.gateways.PeopleGateway;
import org.registry.people.core.usecases.CreatePeopleUseCase;
import org.registry.people.core.usecases.CreatePeopleUseCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelperUseCase {
    @Bean
    public CreatePeopleUseCase createPeopleUseCase(PeopleGateway peopleGateway) {
        return new CreatePeopleUseCaseImpl(peopleGateway);
    }
}
