package org.registry.people.core.gateways;

import org.registry.people.core.entity.People;

import java.util.List;
import java.util.Optional;

public interface PeopleGateway {
    People create(People people);
    Optional<People> CpfOrCnpjExists(String cpfOrCnpj);
    List<People> fetchAll();
}
