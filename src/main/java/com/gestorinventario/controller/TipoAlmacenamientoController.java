package com.gestorinventario.controller;

import com.gestorinventario.dto.TipoAlmacenamientoDto;
import com.gestorinventario.services.TipoAlmacenamientoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tipo-almacenamiento")
@CrossOrigin("*")
public class TipoAlmacenamientoController {

    private final TipoAlmacenamientoService tipoAlmacenamientoService;

    public TipoAlmacenamientoController(TipoAlmacenamientoService tipoAlmacenamientoService) {
        this.tipoAlmacenamientoService = tipoAlmacenamientoService;
    }

    @GetMapping("/listado")
    public ResponseEntity<List<TipoAlmacenamientoDto>> listado(){
        return ResponseEntity.status(HttpStatus.OK).body(this.tipoAlmacenamientoService.listado());
    }

    @PostMapping("/registrar")
    public ResponseEntity<TipoAlmacenamientoDto> registrar(@RequestBody TipoAlmacenamientoDto tipoAlmacenamientoDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(this.tipoAlmacenamientoService.registrar(tipoAlmacenamientoDto));
    }

    @PutMapping("/modificar/{idTipoAlmacenamiento}")
    public ResponseEntity<TipoAlmacenamientoDto> modificar(@PathVariable Long idTipoAlmacenamiento, @RequestBody TipoAlmacenamientoDto tipoAlmacenamientoDto){
        return ResponseEntity.status(HttpStatus.OK).body(this.tipoAlmacenamientoService.modificar(idTipoAlmacenamiento, tipoAlmacenamientoDto));
    }

    @DeleteMapping("/eliminar/{idTipoAlmacenamiento}")
    public ResponseEntity<Void> eliminar(@PathVariable Long idTipoAlmacenamiento){
        this.tipoAlmacenamientoService.eliminar(idTipoAlmacenamiento);
        return ResponseEntity.ok().build();
    }
}
