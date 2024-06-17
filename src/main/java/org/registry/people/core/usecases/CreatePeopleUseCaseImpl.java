package org.registry.people.core.usecases;

import org.registry.people.core.entity.People;
import org.registry.people.core.exceptions.BusinessException;
import org.registry.people.core.gateways.PeopleGateway;

public class CreatePeopleUseCaseImpl implements CreatePeopleUseCase {
    private final PeopleGateway gateway;

    public CreatePeopleUseCaseImpl(PeopleGateway gateway) {
        this.gateway = gateway;
    }

    @Override
    public People execute(People people) {
        var peopleExists = gateway.CpfOrCnpjExists(people.cpfOrCnpj());

        if (peopleExists.isEmpty())
            return gateway.create(people);
        else
            throw new BusinessException("Já existe um usuário com esse CPF ou CNPJ! " + peopleExists.get().cpfOrCnpj());
    }
}
