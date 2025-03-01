package com.gestorinventario.controller;

import com.gestorinventario.dto.AlmacenamientoDto;
import com.gestorinventario.services.AlmacenamientoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/almacenamiento")
@CrossOrigin("*")
public class AlmacenamientoController {

    private final AlmacenamientoService almacenamientoService;

    public AlmacenamientoController(AlmacenamientoService almacenamientoService) {
        this.almacenamientoService = almacenamientoService;
    }

    @GetMapping("/listado")
    public ResponseEntity<List<AlmacenamientoDto>> listado(){
        return ResponseEntity.status(HttpStatus.OK).body(this.almacenamientoService.listado());
    }

    @PostMapping("/registrar")
    public ResponseEntity<AlmacenamientoDto> registrar(@RequestBody AlmacenamientoDto almacenamientoDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(this.almacenamientoService.registrar(almacenamientoDto));
    }

    @PutMapping("/modificar/{idAlmacenamiento}")
    public ResponseEntity<AlmacenamientoDto> modificar(@PathVariable Long idAlmacenamiento, @RequestBody AlmacenamientoDto almacenamientoDto){
        return ResponseEntity.status(HttpStatus.OK).body(this.almacenamientoService.modificar(idAlmacenamiento, almacenamientoDto));
    }

    @DeleteMapping("/eliminar/{idAlmacenamiento}")
    public ResponseEntity<Void> eliminar(@PathVariable Long idAlmacenamiento){
        this.almacenamientoService.eliminar(idAlmacenamiento);
        return ResponseEntity.ok().build();
    }
}
