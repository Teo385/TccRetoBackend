package com.example.BODEGASTCCAPI.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Remitente")
public class Remitente {

    //id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //nombres
    @Column(nullable = false)
    private String nombre;
    //depto
    @Column(nullable = false)
    private String departamento;
    //municipio
    @Column(nullable = false)
    private String municipio;
    //direccion
    @Column(nullable = false)
    private String direccion;
    //metodopago
    @Column(nullable = false)
    private String metodopago;

    public Remitente() {
    }

    public Remitente(Long id, String nombre, String departamento, String municipio, String direccion, String metodopago) {
        this.id = id;
        this.nombre = nombre;
        this.departamento = departamento;
        this.municipio = municipio;
        this.direccion = direccion;
        this.metodopago = metodopago;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMetodopago() {
        return metodopago;
    }

    public void setMetodopago(String metodopago) {
        this.metodopago = metodopago;
    }

}
