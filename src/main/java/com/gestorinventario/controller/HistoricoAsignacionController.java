package com.gestorinventario.controller;

import com.gestorinventario.dto.historicoAsignacion.HistoricoAsignacionDto;
import com.gestorinventario.dto.historicoAsignacion.HistoricoAsignacionListadoResponse;
import com.gestorinventario.dto.historicoAsignacion.HistoricoAsignacionRequest;
import com.gestorinventario.dto.historicoAsignacion.HistoricoAsignacionResponse;
import com.gestorinventario.services.HistoricoAsignacionService;
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
    public ResponseEntity<List<HistoricoAsignacionListadoResponse>> listado(){
        return ResponseEntity.status(HttpStatus.OK).body(this.historicoAsignacionService.listado());
    }

    @PostMapping("/registrar")
    public ResponseEntity<HistoricoAsignacionResponse> registrar(@RequestBody HistoricoAsignacionRequest historicoAsignacionRequest){
        return ResponseEntity.status(HttpStatus.CREATED).body(this.historicoAsignacionService.registrar(historicoAsignacionRequest));
    }

    @PutMapping("/modificar/{idHistoricoAsignacion}")
    public ResponseEntity<HistoricoAsignacionResponse> modificar(@PathVariable Long idHistoricoAsignacion, @RequestBody HistoricoAsignacionRequest historicoAsignacionRequest){
        return ResponseEntity.status(HttpStatus.OK).body(this.historicoAsignacionService.modificar(idHistoricoAsignacion, historicoAsignacionRequest));
    }

    @DeleteMapping("/eliminar/{idHistoricoAsignacion}")
    public ResponseEntity<Void> eliminiar(@PathVariable Long idHistoricoAsignacion){
        this.historicoAsignacionService.eliminar(idHistoricoAsignacion);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/buscarPorIdUsuarioAsignado/{idUsuarioAsignado}")
    public ResponseEntity<HistoricoAsignacionResponse> buscarPorIdUsuarioAsignado(@PathVariable Long idUsuarioAsignado){
        return ResponseEntity.status(HttpStatus.OK).body(this.historicoAsignacionService.buscarPorIdUsuarioAsignado(idUsuarioAsignado));
    }

}
