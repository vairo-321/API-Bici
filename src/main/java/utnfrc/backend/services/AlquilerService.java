package utnfrc.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utnfrc.backend.models.Alquiler;
import utnfrc.backend.models.dto.AlquilerDto;
import utnfrc.backend.models.dto.transformations.AlquilerMapper;
import utnfrc.backend.repository.AlquilerRepository;
import utnfrc.backend.models.dto.transformations.AlquilerDtoMapper;


import java.util.List;

@Service
public class AlquilerService {

    private final AlquilerRepository repositorio;
    private final AlquilerDtoMapper alquilerDtoMapper;
    private final AlquilerMapper alquilerMapper;

    @Autowired
    public AlquilerService(AlquilerDtoMapper alquilerDtoMapper, AlquilerMapper alquilerMapper, AlquilerRepository repositorio) {
        this.alquilerDtoMapper = alquilerDtoMapper;
        this.alquilerMapper = alquilerMapper;
        this.repositorio = repositorio;
    }

    public void add(AlquilerDto entity) {
        Alquiler alquiler = new Alquiler();
        alquiler.setId(entity.getId());
        alquiler.setId_cliente(entity.getId_cliente());
        alquiler.setEstado(entity.getEstado());
        alquiler.setEstacion_retiro(entity.getEstacion_retiro());
        alquiler.setEstacion_devolucion(entity.getEstacion_devolucion());
        alquiler.setFecha_hora_devolucion(entity.getFecha_hora_devolucion());
        alquiler.setMonto(entity.getMonto());
        alquiler.setId_tarifa(entity.getId_tarifa());
        repositorio.save(alquiler);
    }


    public Alquiler acabarAlquiler(Alquiler alquiler) throws ServiceException{

        return new Alquiler();
    }

}
