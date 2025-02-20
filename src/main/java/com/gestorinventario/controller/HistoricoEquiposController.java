package com.gestorinventario.controller;

import com.gestorinventario.dto.HistoricoEquipoDto;
import com.gestorinventario.services.HistoricoEquiposService;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hstorico-equipo")
public class HistoricoEquiposController {

    private final HistoricoEquiposService historicoEquiposService;

    public HistoricoEquiposController(HistoricoEquiposService historicoEquiposService) {
        this.historicoEquiposService = historicoEquiposService;
    }

    @GetMapping("/listado")
    public ResponseEntity<List<HistoricoEquipoDto>> listado(){
        return ResponseEntity.status(HttpStatus.OK).body(this.historicoEquiposService.listado());
    }

    @PostMapping("/registrar")
    public ResponseEntity<HistoricoEquipoDto> registrar(@RequestBody HistoricoEquipoDto historicoEquipoDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(this.historicoEquiposService.registrar(historicoEquipoDto));
    }

    @PutMapping("/modificar/{idHistoricoEquipo}")
    public ResponseEntity<HistoricoEquipoDto> modificar(@PathVariable Long idHistoricoEquipo, @RequestBody HistoricoEquipoDto historicoEquipoDto){
        return ResponseEntity.status(HttpStatus.OK).body(this.historicoEquiposService.modificar(idHistoricoEquipo, historicoEquipoDto));
    }

    @DeleteMapping("/eliminar/{idHistoricoEquipo}")
    public ResponseEntity<Void> eliminar(@PathVariable Long idHistoricoEquipo){
        this.historicoEquiposService.eliminar(idHistoricoEquipo);
        return ResponseEntity.ok().build();
    }

}
