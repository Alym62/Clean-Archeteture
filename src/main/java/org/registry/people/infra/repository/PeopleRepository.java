package org.registry.people.infra.repository;

import org.registry.people.infra.model.PeopleModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeopleRepository extends JpaRepository<PeopleModel, Long> {
}
