package com.qu4rx.RPGenius.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "character")
public class Character {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String race;
    private String characterClass;
    private String alignment;
    private int age;
    private boolean gender;

    PrincipalAtributes atributes;

    VitalAtributes vitalAtributes;


// Demais atributos seriam separados em entidades próprias:
// habilidades, perícias, equipamentos, etc.

// Getters/Setters


}
