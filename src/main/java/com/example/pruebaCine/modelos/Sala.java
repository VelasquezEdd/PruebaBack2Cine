package com.example.pruebaCine.modelos;

import com.example.pruebaCine.ayudas.TipoSala;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "salas")
public class Sala {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nombre", nullable = false, unique = false, length = 50)
    private String nombre;
    @Column(name = "capacidad", nullable = false, unique = false, length = 10)
    private Integer capacidad;
    @Enumerated(EnumType.STRING)
    @Column(name = "tipoSala", nullable = false, unique = false)
    private TipoSala tipoSala;
    @Column(name = "ubicacion", nullable = false, unique = false, length = 10)
    private String ubicacion;
    @Column(name = "numeroPiso", nullable = false, unique = false, length = 10)
    private Integer numeroPiso;
    @Column(name = "accesoDiscapacidad", nullable = false, unique = false)
    private Boolean accesoDiscapacidad;
    @Column(name = "sonidoDolby", nullable = false, unique = false)
    private Boolean sonidoDolby;
    @Column(name = "anchoPantallaMetros", nullable = false, unique = false, length = 20)
    private Double anchoPantallaMetros;
    @Column(name = "altoPantallaMetros", nullable = false, unique = false, length = 20)
    private Double altoPantallaMetros;
    @Column(name = "observacionesTecnicas", nullable = false, unique = false, length = 100)
    private String observacionesTecnicas;

    // Relacion 1:N con reserva
    @OneToMany(mappedBy = "sala")
    @JsonManagedReference(value = "relacionsalareserva")
    private List<Reserva> reservas;

    public Sala() {
    }

    public Sala(Integer id, String nombre, Integer capacidad, TipoSala tipoSala, String ubicacion, Integer numeroPiso, Boolean accesoDiscapacidad, Boolean sonidoDolby, Double anchoPantallaMetros, Double altoPantallaMetros, String observacionesTecnicas) {
        this.id = id;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.tipoSala = tipoSala;
        this.ubicacion = ubicacion;
        this.numeroPiso = numeroPiso;
        this.accesoDiscapacidad = accesoDiscapacidad;
        this.sonidoDolby = sonidoDolby;
        this.anchoPantallaMetros = anchoPantallaMetros;
        this.altoPantallaMetros = altoPantallaMetros;
        this.observacionesTecnicas = observacionesTecnicas;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public TipoSala getTipoSala() {
        return tipoSala;
    }

    public void setTipoSala(TipoSala tipoSala) {
        this.tipoSala = tipoSala;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Integer getNumeroPiso() {
        return numeroPiso;
    }

    public void setNumeroPiso(Integer numeroPiso) {
        this.numeroPiso = numeroPiso;
    }

    public Boolean getAccesoDiscapacidad() {
        return accesoDiscapacidad;
    }

    public void setAccesoDiscapacidad(Boolean accesoDiscapacidad) {
        this.accesoDiscapacidad = accesoDiscapacidad;
    }

    public Boolean getSonidoDolby() {
        return sonidoDolby;
    }

    public void setSonidoDolby(Boolean sonidoDolby) {
        this.sonidoDolby = sonidoDolby;
    }

    public Double getAnchoPantallaMetros() {
        return anchoPantallaMetros;
    }

    public void setAnchoPantallaMetros(Double anchoPantallaMetros) {
        this.anchoPantallaMetros = anchoPantallaMetros;
    }

    public Double getAltoPantallaMetros() {
        return altoPantallaMetros;
    }

    public void setAltoPantallaMetros(Double altoPantallaMetros) {
        this.altoPantallaMetros = altoPantallaMetros;
    }

    public String getObservacionesTecnicas() {
        return observacionesTecnicas;
    }

    public void setObservacionesTecnicas(String observacionesTecnicas) {
        this.observacionesTecnicas = observacionesTecnicas;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }
}
