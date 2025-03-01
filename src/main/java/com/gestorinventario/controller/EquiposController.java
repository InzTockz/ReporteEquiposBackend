package com.gestorinventario.controller;

import com.gestorinventario.dto.EquipoDto;
import com.gestorinventario.services.EquipoService;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/equipos")
@CrossOrigin("*")
public class EquiposController {

    private final EquipoService equipoService;

    public EquiposController(EquipoService equipoService) {
        this.equipoService = equipoService;
    }

    @GetMapping("/listado")
    public ResponseEntity<List<EquipoDto>> listado(){
        return ResponseEntity.status(HttpStatus.OK).body(this.equipoService.listado());
    }

    @PostMapping("/registrar")
    public ResponseEntity<EquipoDto> registrar(@RequestBody EquipoDto equipoDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(this.equipoService.registrar(equipoDto));
    }

    @PutMapping("/modificar/{idEquipo}")
    public ResponseEntity<EquipoDto> modificar(@PathVariable Long idEquipo, @RequestBody EquipoDto equipoDto){
        return ResponseEntity.status(HttpStatus.OK).body(this.equipoService.modificar(idEquipo, equipoDto));
    }

    @DeleteMapping("/eliminar/{idEquipo}")
    public ResponseEntity<Void> eliminar(@PathVariable Long idEquipo){
        this.equipoService.eliminar(idEquipo);
        return ResponseEntity.ok().build();
    }
}
