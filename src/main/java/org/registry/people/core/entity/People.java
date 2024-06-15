package org.registry.people.core.entity;

import org.registry.people.core.enums.TypePeople;

public record People (
        Long id,
        String name,
        String cpfOrCnpj,
        TypePeople typePeople
){
}
