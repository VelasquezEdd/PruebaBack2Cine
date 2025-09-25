package com.example.pruebaCine.modelos;

import com.example.pruebaCine.ayudas.EstadoReserva;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "reservas")
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "codigoReserva", nullable = false, unique = true, length = 10)
    private String codigoReserva;
    @Column(name = "fechaHora", nullable = false, unique = false)
    private LocalDate fechaHora;
    @Column(name = "cantidadBoletos", nullable = false, unique = false, length = 10)
    private Integer cantidadBoletos;
    @Column(name = "precioUnitario", nullable = false, unique = false, length = 20)
    private Double precioUnitario;
    @Column(name = "total", nullable = false, unique = false, length = 20)
    private Double total;
    @Column(name = "metodoPago", nullable = false, unique = false, length = 20)
    private String metodoPago;
    @Column(name = "asientos", nullable = false, unique = false, length = 10)
    private String asientos;
    @Enumerated(EnumType.STRING)
    @Column(name = "estadoReserva", nullable = false, unique = false)
    private EstadoReserva estadoReserva;
    @Column(name = "canalventa", nullable = false, unique = false, length = 20)
    private String canalVenta;
    @Column(name = "notas", nullable = false, unique = false, length = 100)
    private String notas;

    // Relacion N:1 con cliente
    @ManyToOne
    @JoinColumn(name = "fk_cliente", referencedColumnName = "id")
    @JsonBackReference(value = "relacionclientereserva")
    private Cliente cliente;

    // Relacion N:1 con pelicula
    @ManyToOne
    @JoinColumn(name = "fk_pelicula", referencedColumnName = "id")
    @JsonBackReference(value = "relacionpeliculareserva")
    private Pelicula pelicula;

    // Relacion N:1 con sala
    @ManyToOne
    @JoinColumn(name = "fk_sala", referencedColumnName = "id")
    @JsonBackReference(value = "relacionsalareserva")
    private Sala sala;

    public Reserva() {
    }

    public Reserva(Integer id, String codigoReserva, LocalDate fechaHora, Integer cantidadBoletos, Double precioUnitario, Double total, String metodoPago, String asientos, EstadoReserva estadoReserva, String canalVenta, String notas) {
        this.id = id;
        this.codigoReserva = codigoReserva;
        this.fechaHora = fechaHora;
        this.cantidadBoletos = cantidadBoletos;
        this.precioUnitario = precioUnitario;
        this.total = total;
        this.metodoPago = metodoPago;
        this.asientos = asientos;
        this.estadoReserva = estadoReserva;
        this.canalVenta = canalVenta;
        this.notas = notas;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigoReserva() {
        return codigoReserva;
    }

    public void setCodigoReserva(String codigoReserva) {
        this.codigoReserva = codigoReserva;
    }

    public LocalDate getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDate fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Integer getCantidadBoletos() {
        return cantidadBoletos;
    }

    public void setCantidadBoletos(Integer cantidadBoletos) {
        this.cantidadBoletos = cantidadBoletos;
    }

    public Double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public String getAsientos() {
        return asientos;
    }

    public void setAsientos(String asientos) {
        this.asientos = asientos;
    }

    public EstadoReserva getEstadoReserva() {
        return estadoReserva;
    }

    public void setEstadoReserva(EstadoReserva estadoReserva) {
        this.estadoReserva = estadoReserva;
    }

    public String getCanalVenta() {
        return canalVenta;
    }

    public void setCanalVenta(String canalVenta) {
        this.canalVenta = canalVenta;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }
}
