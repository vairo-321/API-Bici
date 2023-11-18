package utnfrc.backend.models.dto.transformations;

import org.springframework.stereotype.Service;
import utnfrc.backend.models.Alquiler;
import utnfrc.backend.models.dto.AlquilerDto;

import java.util.function.Function;

@Service
public class AlquilerDtoMapper implements Function<Alquiler, AlquilerDto> {
    @Override
    public AlquilerDto apply(Alquiler alquiler){
        return new AlquilerDto(
                alquiler.getId(),
                alquiler.getId_cliente(),
                alquiler.getEstado(),
                alquiler.getEstacion_retiro(),
                alquiler.getEstacion_devolucion(),
                alquiler.getFecha_hora_retiro(),
                alquiler.getFecha_hora_devolucion(),
                alquiler.getMonto(),
                alquiler.getId_tarifa()
        );
    }
}
