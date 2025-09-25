package com.example.pruebaCine.modelos;

import com.example.pruebaCine.ayudas.EstadoCivil;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "perfiles")
public class Perfil {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "fechaNacimiento", nullable = false, unique = false)
    private LocalDate fechaNacimiento;
    @Column(name = "direccion", nullable = false, unique = false, length = 50)
    private String direccion;
    @Column(name = "ciudad", nullable = false, unique = false, length = 30)
    private String ciudad;
    @Column(name = "telefonoAlterno", nullable = false, unique = false, length = 11)
    private String telefonoAlterno;
    @Enumerated(EnumType.STRING)
    @Column(name = "estadoCivil", nullable = false, unique = false)
    private EstadoCivil estadoCivil;
    @Column(name = "ocupacion", nullable = false, unique = false, length = 50)
    private String ocupacion;
    @Column(name = "preferencias", nullable = false, unique = false, length = 50)
    private String preferencias;
    @Column(name = "alergias", nullable = false, unique = false, length = 80)
    private String alergias;
    @Column(name = "marketingOptIn", nullable = false, unique = false)
    private Boolean marketingOptIn;
    @Column(name = "contactoEmergencia", nullable = false, unique = false, length = 50)
    private String contactoEmergencia;

    // Relacion 1:1 con cliente
    @OneToOne(mappedBy = "perfil")
    @JsonBackReference(value = "relacionclienteperfil")
    private Cliente cliente;

    public Perfil() {
    }

    public Perfil(Integer id, LocalDate fechaNacimiento, String direccion, String ciudad, String telefonoAlterno, EstadoCivil estadoCivil, String ocupacion, String preferencias, String alergias, Boolean marketingOptIn, String contactoEmergencia) {
        this.id = id;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.telefonoAlterno = telefonoAlterno;
        this.estadoCivil = estadoCivil;
        this.ocupacion = ocupacion;
        this.preferencias = preferencias;
        this.alergias = alergias;
        this.marketingOptIn = marketingOptIn;
        this.contactoEmergencia = contactoEmergencia;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getTelefonoAlterno() {
        return telefonoAlterno;
    }

    public void setTelefonoAlterno(String telefonoAlterno) {
        this.telefonoAlterno = telefonoAlterno;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getPreferencias() {
        return preferencias;
    }

    public void setPreferencias(String preferencias) {
        this.preferencias = preferencias;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public Boolean getMarketingOptIn() {
        return marketingOptIn;
    }

    public void setMarketingOptIn(Boolean marketingOptIn) {
        this.marketingOptIn = marketingOptIn;
    }

    public String getContactoEmergencia() {
        return contactoEmergencia;
    }

    public void setContactoEmergencia(String contactoEmergencia) {
        this.contactoEmergencia = contactoEmergencia;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
