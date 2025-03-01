package com.gestorinventario.controller;

import com.gestorinventario.dto.GeneracionProcesadorDto;
import com.gestorinventario.services.GeneracionProcesadorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/generacion-procesador")
@CrossOrigin("*")
public class GeneracionProcesadorController {

    private final GeneracionProcesadorService generacionProcesadorService;

    public GeneracionProcesadorController(GeneracionProcesadorService generacionProcesadorService) {
        this.generacionProcesadorService = generacionProcesadorService;
    }

    @GetMapping("/listado")
    public ResponseEntity<List<GeneracionProcesadorDto>> listado(){
        return ResponseEntity.status(HttpStatus.OK).body(this.generacionProcesadorService.listado());
    }

    @PostMapping("/registrar")
    public ResponseEntity<GeneracionProcesadorDto> registrar(@RequestBody GeneracionProcesadorDto generacionProcesadorDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(this.generacionProcesadorService.registrar(generacionProcesadorDto));
    }

    @PutMapping("/modificar/{idGeneracionProcesador}")
    public ResponseEntity<GeneracionProcesadorDto> modificar(@PathVariable Long idGeneracionProcesador, @RequestBody GeneracionProcesadorDto generacionProcesadorDto){
        return ResponseEntity.status(HttpStatus.OK).body(this.generacionProcesadorService.modificar(idGeneracionProcesador, generacionProcesadorDto));
    }

    @DeleteMapping("/eliminar/{idGeneracionProcesador}")
    public ResponseEntity<Void> eliminar(@PathVariable Long idGeneracionProcesador){
        this.generacionProcesadorService.eliminar(idGeneracionProcesador);
        return ResponseEntity.ok().build();
    }
}
