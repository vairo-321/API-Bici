package utnfrc.backend.models.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlquilerDto {
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
