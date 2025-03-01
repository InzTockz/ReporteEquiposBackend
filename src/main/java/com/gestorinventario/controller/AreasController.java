package com.gestorinventario.controller;

import com.gestorinventario.dto.AreasDto;
import com.gestorinventario.services.AreasService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/areas")
@CrossOrigin("*")
public class AreasController {

    private final AreasService areasService;

    public AreasController(AreasService areasService) {
        this.areasService = areasService;
    }

    @GetMapping("/listado")
    public ResponseEntity<List<AreasDto>> listar(){
        return ResponseEntity.status(HttpStatus.OK).body(this.areasService.listado());
    }

    @PostMapping("/registrar")
    public ResponseEntity<AreasDto> registrar(@RequestBody AreasDto areasDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(this.areasService.registrar(areasDto));
    }

    @PutMapping("/modificar/{idArea}")
    public ResponseEntity<AreasDto> modificar(@PathVariable Long idArea, @RequestBody AreasDto areasDto){
        return ResponseEntity.status(HttpStatus.OK).body(this.areasService.modificar(idArea, areasDto));
    }

    @DeleteMapping("/eliminar/{idArea}")
    public ResponseEntity<Void> eliminar(@PathVariable Long idArea){
        this.areasService.eliminar(idArea);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @GetMapping("/listado/{idArea}")
    public ResponseEntity<List<AreasDto>> listadoPorId(@PathVariable Long idArea){
        return ResponseEntity.status(HttpStatus.OK).body(this.areasService.listadoPorId(idArea));
    }
}
