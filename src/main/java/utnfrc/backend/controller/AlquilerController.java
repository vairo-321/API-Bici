package utnfrc.backend.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import utnfrc.backend.models.Alquiler;
import utnfrc.backend.services.AlquilerService;
import utnfrc.backend.services.ServiceException;

@Slf4j
@RestController
@RequestMapping("/api/alquileres")
public class AlquilerController {

    private final AlquilerService servicio;

    @Autowired
    public AlquilerController(AlquilerService serv){this.servicio = serv;}

    @PostMapping
    public ResponseEntity<Alquiler> crearAlquiler(@RequestBody Alquiler alquiler) {
        //Si se da error. crear nuevo alquiler y setear con RequestBody DTO
        return ResponseEntity.ok(servicio.crearAlquiler(alquiler));
    }

    @PutMapping
    public ResponseEntity<Alquiler> finalizarAlquiler(@RequestBody Alquiler alquiler){
        try {
            Alquiler alquilerFin = servicio.acabarAlquiler(alquiler);
            return ResponseEntity.ok(alquilerFin);
        }catch (ServiceException e){

            return ResponseEntity.notFound()
                    .header("Error-Message", e.getMessage())
                    .build();
        }
    }



}
