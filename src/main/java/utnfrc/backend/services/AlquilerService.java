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
        alquiler.setEstado(1);
        return repositorio.save(alquiler);
    }


    public Alquiler acabarAlquiler(Alquiler alquiler) throws ServiceException{
        //aqui se debe
        //buscar alquiler en BD con ID del parametro, controlar con try catch que exista
        //calcular el monto del alquiler con su respectiva llamada al conversor de moneda
        //probablemente haga falta un dato mas en RequestBody, la moneda con la que pagara, no se
        //setear datos del alquiler que trajimos, vovler a guardar y devolver el cuerpo de la transaccion
        return new Alquiler();

    }

}
