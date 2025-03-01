package com.gestorinventario.controller;

import com.gestorinventario.dto.HistoricoAsignacionDto;
import com.gestorinventario.services.HistoricoAsignacionService;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/historico-asignacion")
@CrossOrigin("*")
public class HistoricoAsignacionController {

    private final HistoricoAsignacionService historicoAsignacionService;

    public HistoricoAsignacionController(HistoricoAsignacionService historicoAsignacionService) {
        this.historicoAsignacionService = historicoAsignacionService;
    }

    @GetMapping("/listado")
    public ResponseEntity<List<HistoricoAsignacionDto>> listado(){
        return ResponseEntity.status(HttpStatus.OK).body(this.historicoAsignacionService.listado());
    }

    @PostMapping("/registrar")
    public ResponseEntity<HistoricoAsignacionDto> registrar(@RequestBody HistoricoAsignacionDto historicoAsignacionDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(this.historicoAsignacionService.registrar(historicoAsignacionDto));
    }

    @PutMapping("/modificar/{idHistoricoAsignacion}")
    public ResponseEntity<HistoricoAsignacionDto> modificar(@PathVariable Long idHistoricoAsignacion, @RequestBody HistoricoAsignacionDto historicoAsignacionDto){
        return ResponseEntity.status(HttpStatus.OK).body(this.historicoAsignacionService.modificar(idHistoricoAsignacion, historicoAsignacionDto));
    }

    @DeleteMapping("/eliminar/{idHistoricoAsignacion}")
    public ResponseEntity<Void> eliminiar(@PathVariable Long idHistoricoAsignacion){
        this.historicoAsignacionService.eliminar(idHistoricoAsignacion);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/buscarPorIdUsuarioAsignado/{idUsuarioAsignado}")
    public ResponseEntity<HistoricoAsignacionDto> buscarPorIdUsuarioAsignado(@PathVariable Long idUsuarioAsignado){
        return ResponseEntity.status(HttpStatus.OK).body(this.historicoAsignacionService.buscarPorIdUsuarioAsignado(idUsuarioAsignado));
    }

}
