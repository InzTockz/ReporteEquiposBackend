package com.gestorinventario.controller;

import com.gestorinventario.dto.MarcaDto;
import com.gestorinventario.services.MarcaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/marca")
@CrossOrigin("*")
public class MarcaController {

    private final MarcaService marcaService;

    public MarcaController(MarcaService marcaService) {
        this.marcaService = marcaService;
    }

    @GetMapping("/listado")
    public ResponseEntity<List<MarcaDto>> listado(){
        return ResponseEntity.status(HttpStatus.OK).body(this.marcaService.listado());
    }

    @PostMapping("/registrar")
    public ResponseEntity<MarcaDto> registrar(@RequestBody MarcaDto marcaDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(this.marcaService.registrar(marcaDto));
    }

    @PutMapping("/modificar/{idMarca}")
    public ResponseEntity<MarcaDto> modificar(@PathVariable Long idMarca, @RequestBody MarcaDto marcaDto){
        return ResponseEntity.status(HttpStatus.OK).body(this.marcaService.modificar(idMarca, marcaDto));
    }

    @DeleteMapping("/eliminar/{idMarca}")
    public ResponseEntity<Void> eliminar(@PathVariable Long idMarca){
        this.marcaService.eliminar(idMarca);
        return ResponseEntity.ok().build();
    }
}
