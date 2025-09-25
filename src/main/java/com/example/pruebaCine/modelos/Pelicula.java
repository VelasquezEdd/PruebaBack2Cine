package com.example.pruebaCine.modelos;

import com.example.pruebaCine.ayudas.Clasificacion;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "peliculas")
public class Pelicula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "titulo", nullable = false, unique = false, length = 50)
    private String titulo;
    @Column(name = "sinopsis", nullable = false, unique = false, length = 150)
    private String sinopsis;
    @Column(name = "duracionMinutos", nullable = false, unique = false, length = 50)
    private Integer duracionMinutos;
    @Column(name = "director", nullable = false, unique = false, length = 50)
    private String director;
    @Column(name = "añoEstreno", nullable = false, unique = false)
    private LocalDate añoEstreno;
    @Enumerated(EnumType.STRING)
    @Column(name = "clasificacion", nullable = false, unique = false)
    private Clasificacion clasificacion;
    @Column(name = "idiomaOriginal", nullable = false, unique = false, length = 50)
    private String idiomaOriginal;
    @Column(name = "paisOrigen", nullable = false, unique = false, length = 50)
    private String paisOrigen;
    @Column(name = "ratingPromedio", nullable = false, unique = false, length = 50)
    private Double ratingPromedio;
    @Column(name = "generoPrincipal", nullable = false, unique = false, length = 50)
    private String generoPrincipal;

    // Relacion 1:N con reserva
    @OneToMany(mappedBy = "pelicula")
    @JsonManagedReference(value = "relacionpeliculareserva")
    private List<Reserva> reservas;

    public Pelicula() {
    }

    public Pelicula(Integer id, String titulo, String sinopsis, Integer duracionMinutos, String director, LocalDate añoEstreno, Clasificacion clasificacion, String idiomaOriginal, String paisOrigen, Double ratingPromedio, String generoPrincipal) {
        this.id = id;
        this.titulo = titulo;
        this.sinopsis = sinopsis;
        this.duracionMinutos = duracionMinutos;
        this.director = director;
        this.añoEstreno = añoEstreno;
        this.clasificacion = clasificacion;
        this.idiomaOriginal = idiomaOriginal;
        this.paisOrigen = paisOrigen;
        this.ratingPromedio = ratingPromedio;
        this.generoPrincipal = generoPrincipal;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public Integer getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(Integer duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public LocalDate getAñoEstreno() {
        return añoEstreno;
    }

    public void setAñoEstreno(LocalDate añoEstreno) {
        this.añoEstreno = añoEstreno;
    }

    public Clasificacion getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(Clasificacion clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getIdiomaOriginal() {
        return idiomaOriginal;
    }

    public void setIdiomaOriginal(String idiomaOriginal) {
        this.idiomaOriginal = idiomaOriginal;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public Double getRatingPromedio() {
        return ratingPromedio;
    }

    public void setRatingPromedio(Double ratingPromedio) {
        this.ratingPromedio = ratingPromedio;
    }

    public String getGeneroPrincipal() {
        return generoPrincipal;
    }

    public void setGeneroPrincipal(String generoPrincipal) {
        this.generoPrincipal = generoPrincipal;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }
}
