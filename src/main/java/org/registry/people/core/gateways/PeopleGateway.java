package org.registry.people.core.gateways;

import org.registry.people.core.entity.People;

public interface PeopleGateway {
    People create(People people);
}
