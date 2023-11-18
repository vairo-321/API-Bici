package utnfrc.backend.models.dto.transformations;

import org.springframework.stereotype.Service;
import utnfrc.backend.models.Alquiler;
import utnfrc.backend.models.dto.AlquilerDto;

import java.util.function.Function;

@Service
public class AlquilerMapper implements Function<AlquilerDto, Alquiler> {
    @Override
    public Alquiler apply(AlquilerDto alquilerDto){
        return new Alquiler(
                alquilerDto.getId(),
                alquilerDto.getId_cliente(),
                alquilerDto.getEstado(),
                alquilerDto.getEstacion_retiro(),
                alquilerDto.getEstacion_devolucion(),
                alquilerDto.getFecha_hora_retiro(),
                alquilerDto.getFecha_hora_devolucion(),
                alquilerDto.getMonto(),
                alquilerDto.getId_tarifa()
        );
    }
}
