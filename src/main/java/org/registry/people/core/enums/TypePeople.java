package org.registry.people.core.enums;

public enum TypePeople {
    FISICA("Pessoa física"),
    JURIDICA("Pessoa jurídica");

    private final String description;

    TypePeople(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static TypePeople valueOfTypePeople(String description) {
        for (TypePeople value : TypePeople.values()) {
            if (value.getDescription().equals(description))
                return value;
        }

        throw new IllegalArgumentException("Tipo inválido!");
    }
}
