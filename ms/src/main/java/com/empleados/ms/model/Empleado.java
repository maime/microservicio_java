package com.empleados.ms.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "empleados")
@ToString
@EqualsAndHashCode
public class Empleado {

    @Id
    @Getter
    @Setter
    @Column(name = "id")
    private int id;
    @Getter
    @Setter
    @Column(name = "nombre")
    private String nombre;
    @Getter
    @Setter
    @Column(name = "edad")
    private int edad;
    @Getter
    @Setter
    @Column(name = "pais")
    private String pais;
    @Getter
    @Setter
    @Column(name = "cargo")
    private String cargo;
    @Getter
    @Setter
    @Column(name = "anios")
    private int anios;


}
