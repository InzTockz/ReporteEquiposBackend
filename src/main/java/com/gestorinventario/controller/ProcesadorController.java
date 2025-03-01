package com.gestorinventario.controller;

import com.gestorinventario.dto.ProcesadorDto;
import com.gestorinventario.services.ProcesadorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/procesador")
@CrossOrigin("*")
public class ProcesadorController {

    private final ProcesadorService procesadorService;

    public ProcesadorController(ProcesadorService procesadorService) {
        this.procesadorService = procesadorService;
    }

    @GetMapping("/listado")
    public ResponseEntity<List<ProcesadorDto>> listado(){
        return ResponseEntity.status(HttpStatus.OK).body(this.procesadorService.listado());
    }

    @PostMapping("/registrar")
    public ResponseEntity<ProcesadorDto> registrar(@RequestBody ProcesadorDto procesadorDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(this.procesadorService.registrar(procesadorDto));
    }

    @PutMapping("/modificar/{idProcesador}")
    public ResponseEntity<ProcesadorDto> modificar(@PathVariable Long idProcesador, @RequestBody ProcesadorDto procesadorDto){
        return ResponseEntity.status(HttpStatus.OK).body(this.procesadorService.modificar(idProcesador, procesadorDto));
    }

    @DeleteMapping("/eliminar/{idProcesador}")
    public ResponseEntity<Void> eliminar (@PathVariable Long idProcesador){
        this.procesadorService.eliminar(idProcesador);
        return ResponseEntity.ok().build();
    }
}
