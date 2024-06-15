package org.registry.people.infra.payload;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.registry.people.core.enums.TypePeople;

public record PeopleRecordDTO (
        @JsonProperty("name")
        String name,
        @JsonProperty("cpf_cnpj")
        String cpfOrCnpj,
        @JsonProperty("type")
        TypePeople typePeople
){
}
