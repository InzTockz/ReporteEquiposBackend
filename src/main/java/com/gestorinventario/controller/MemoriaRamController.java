package com.gestorinventario.controller;

import com.gestorinventario.dto.MemoriaRamDto;
import com.gestorinventario.services.MemoriaRamService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/memoria-ram")
public class MemoriaRamController {

    private final MemoriaRamService memoriaRamService;

    public MemoriaRamController(MemoriaRamService memoriaRamService) {
        this.memoriaRamService = memoriaRamService;
    }

    @GetMapping("/listado")
    public ResponseEntity<List<MemoriaRamDto>> listado(){
        return ResponseEntity.status(HttpStatus.OK).body(this.memoriaRamService.listado());
    }

    @PostMapping("/registrar")
    public ResponseEntity<MemoriaRamDto> registrar(@RequestBody MemoriaRamDto memoriaRamDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(this.memoriaRamService.registrar(memoriaRamDto));
    }

    @PutMapping("/modificar/{idMemoriaRam}")
    public ResponseEntity<MemoriaRamDto> modificar(@PathVariable Long idMemoriaRam, @RequestBody MemoriaRamDto memoriaRamDto){
        return ResponseEntity.status(HttpStatus.OK).body(this.memoriaRamService.modificar(idMemoriaRam, memoriaRamDto));
    }

    @DeleteMapping("/eliminar/{idMemoriaRam}")
    public ResponseEntity<Void> eliminar(@PathVariable Long idMemoriaRam){
        this.memoriaRamService.eliminar(idMemoriaRam);
        return ResponseEntity.ok().build();
    }
}
