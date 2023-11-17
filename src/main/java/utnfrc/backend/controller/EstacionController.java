package utnfrc.backend.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import utnfrc.backend.models.Estacion;
import utnfrc.backend.services.EstacionService;
import utnfrc.backend.services.ServiceException;

@Slf4j
@RestController
@RequestMapping("/api/estaciones")
public class EstacionController {

    private final EstacionService servicio;

    @Autowired
    public EstacionController(EstacionService servicio){this.servicio = servicio;}


    @GetMapping
    public ResponseEntity<Iterable<Estacion>> getAllEstaciones() {
        return ResponseEntity.ok(servicio.getAll());
    }

    @PostMapping
    public ResponseEntity<Estacion> postEstacion(@RequestBody Estacion estacion) { return ResponseEntity.ok(servicio.postEstacion(estacion));}

    @GetMapping("/{latitud}&{longitud}")
    public ResponseEntity<Estacion> getEstacionDistancia(@RequestParam double latitud, @RequestParam double longitud)
    {
        try {
            Estacion estacion = servicio.getEstacionDistancia(latitud, longitud);
            return ResponseEntity.ok(estacion);
        }catch (ServiceException e){
            return ResponseEntity.notFound()
                    .header("Error-Message", e.getMessage())
                    .build();

        }
    }













}
