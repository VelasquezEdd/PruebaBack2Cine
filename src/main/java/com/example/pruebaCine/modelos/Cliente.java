package com.example.pruebaCine.modelos;

import com.example.pruebaCine.ayudas.TipoCliente;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nombres", nullable = false, unique = false, length = 50)
    private String nombres;
    @Column(name = "apellidos", nullable = false, unique = false, length = 50)
    private String apellidos;
    @Column(name = "email", nullable = false, unique = true, length = 50)
    private String email;
    @Column(name = "documento", nullable = false, unique = true, length = 10)
    private String documento;
    @Column(name = "telefono", nullable = false, unique = true, length = 11)
    private String telefono;
    @Column(name = "fechaRegistro", nullable = false, unique = false)
    private LocalDate fechaRegistro;
    @Column(name = "puntosFidelidad", nullable = false, unique = false, length = 10)
    private Integer puntosFidelidad;
    @Enumerated(EnumType.STRING)
    @Column(name = "tipoCliente", nullable = false, unique = false)
    private TipoCliente tipoCliente;
    @Column(name = "activo", nullable = false, unique = false)
    private Boolean activo;
    @Column(name = "preferenciaIdioma", nullable = false, unique = false)
    private String preferenciaIdioma;

    // Relacion 1:1 con perfil
    @OneToOne
    @JoinColumn(name = "fk_perfil", referencedColumnName = "id")
    @JsonManagedReference(value = "relacionclienteperfil")
    private Perfil perfil;

    // Relacion 1:N con reserva
    @OneToMany(mappedBy = "cliente")
    @JsonManagedReference(value = "relacionclientereserva")
    private List<Reserva> reservas;

    public Cliente() {
    }

    public Cliente(Integer id, String nombres, String apellidos, String email, String documento, String telefono, LocalDate fechaRegistro, Integer puntosFidelidad, TipoCliente tipoCliente, Boolean activo, String preferenciaIdioma) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.email = email;
        this.documento = documento;
        this.telefono = telefono;
        this.fechaRegistro = fechaRegistro;
        this.puntosFidelidad = puntosFidelidad;
        this.tipoCliente = tipoCliente;
        this.activo = activo;
        this.preferenciaIdioma = preferenciaIdioma;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Integer getPuntosFidelidad() {
        return puntosFidelidad;
    }

    public void setPuntosFidelidad(Integer puntosFidelidad) {
        this.puntosFidelidad = puntosFidelidad;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public String getPreferenciaIdioma() {
        return preferenciaIdioma;
    }

    public void setPreferenciaIdioma(String preferenciaIdioma) {
        this.preferenciaIdioma = preferenciaIdioma;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }
}
