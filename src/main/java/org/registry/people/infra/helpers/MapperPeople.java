package org.registry.people.infra.helpers;

import org.registry.people.core.entity.People;
import org.registry.people.infra.model.PeopleModel;
import org.registry.people.infra.payload.PeopleRecordDTO;
import org.springframework.stereotype.Component;

@Component
public class MapperPeople {
    public static PeopleRecordDTO recordEntityToDTORecord(People people) {
        return new PeopleRecordDTO(
                people.name(),
                people.cpfOrCnpj(),
                people.typePeople()
        );
    }

    public static People dtoRecordToRecordEntity(PeopleRecordDTO dto) {
        return new People(
                null,
                dto.name(),
                dto.cpfOrCnpj(),
                dto.typePeople()
        );
    }

    public static PeopleModel recordEntityToModel(People people) {
        return new PeopleModel(people.id(), people.name(), people.cpfOrCnpj(), people.typePeople());
    }

    public static People modelToRecordEntity(PeopleModel peopleModel) {
        return new People(
                peopleModel.getId(),
                peopleModel.getName(),
                peopleModel.getCpfOrCnpj(),
                peopleModel.getTypePeople()
        );
    }
}
