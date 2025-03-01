package com.gestorinventario.controller;

import com.gestorinventario.dto.UsuarioAsignadoDto;
import com.gestorinventario.services.UsuarioAsignadoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuario-asignado")
@CrossOrigin("*")
public class UsuarioAsignadoController {

    private final UsuarioAsignadoService usuarioAsignadoService;

    public UsuarioAsignadoController(UsuarioAsignadoService usuarioAsignadoService) {
        this.usuarioAsignadoService = usuarioAsignadoService;
    }

    @GetMapping("/listado")
    public ResponseEntity<List<UsuarioAsignadoDto>> listado(){
        return ResponseEntity.status(HttpStatus.OK).body(this.usuarioAsignadoService.listado());
    }

    @PostMapping("/registrar")
    public ResponseEntity<UsuarioAsignadoDto> registrar(@RequestBody UsuarioAsignadoDto usuarioAsignadoDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(this.usuarioAsignadoService.registrar(usuarioAsignadoDto));
    }

    @PutMapping("/actualizar/{idUsuarioAsignado}")
    public ResponseEntity<UsuarioAsignadoDto> modificar(@PathVariable Long idUsuarioAsignado, @RequestBody UsuarioAsignadoDto usuarioAsignadoDto){
        return ResponseEntity.status(HttpStatus.OK).body(this.usuarioAsignadoService.modificar(idUsuarioAsignado, usuarioAsignadoDto));
    }

    @DeleteMapping("/eliminar/{idUsuarioAsignado}")
    public ResponseEntity<Void> eliminar(@PathVariable Long idUsuarioAsignado){
        this.usuarioAsignadoService.eliminar(idUsuarioAsignado);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @GetMapping("/listado/{idUsuarioAsignado}")
    public ResponseEntity<List<UsuarioAsignadoDto>> listadoPorId(@PathVariable Long idUsuarioAsignado){
        return ResponseEntity.status(HttpStatus.OK).body(this.usuarioAsignadoService.listadoPorId(idUsuarioAsignado));
    }
}
