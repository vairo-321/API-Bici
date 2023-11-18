package utnfrc.backend.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Entity(name = "alquileres")
@AllArgsConstructor
@NoArgsConstructor(force = true)
public class Alquiler {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String id_cliente;
    private int estado;
    private int estacion_retiro;
    private int estacion_devolucion;
    private LocalDateTime fecha_hora_retiro;
    private LocalDateTime fecha_hora_devolucion;
    private double monto;
    private int id_tarifa;

}
