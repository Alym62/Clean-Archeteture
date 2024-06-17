package org.registry.people.infra.repository;

import org.registry.people.infra.model.PeopleModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PeopleRepository extends JpaRepository<PeopleModel, Long> {
    @Query("select p from PeopleModel p where p.cpfOrCnpj = :cpfOrCnpj")
    Optional<PeopleModel> findByCpfOrCnpj(@Param("cpfOrCnpj") String cpfOrCnpj);
}
