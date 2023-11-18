package utnfrc.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utnfrc.backend.models.Alquiler;
import utnfrc.backend.repository.AlquilerRepository;

@Service
public class AlquilerService {

    private final AlquilerRepository repositorio;

    @Autowired
    public AlquilerService(AlquilerRepository repo){this.repositorio = repo;}


    public Alquiler crearAlquiler(Alquiler alquiler){
        return repositorio.save(alquiler);
    }


    public Alquiler acabarAlquiler(Alquiler alquiler) throws ServiceException{

        return new Alquiler();
    }

}
