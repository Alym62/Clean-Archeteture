package org.registry.people.infra.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.registry.people.core.enums.TypePeople;

@Entity
@Table(name = "tb_people")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PeopleModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String name;

    @Column(unique = true)
    private String cpfOrCnpj;

    @Column(name = "tipo_pessoa")
    @Enumerated(EnumType.STRING)
    private TypePeople typePeople;
}
