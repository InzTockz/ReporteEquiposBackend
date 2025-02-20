package com.gestorinventario.services.impl;

import com.gestorinventario.dto.UsuarioAsignadoDto;
import com.gestorinventario.mapper.UsuarioAsignadoMapper;
import com.gestorinventario.repository.UsuarioAsignadoRepository;
import com.gestorinventario.services.UsuarioAsignadoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioAsignadoServiceImpl implements UsuarioAsignadoService {

    private final UsuarioAsignadoRepository usuarioAsignadoRepository;
    private final UsuarioAsignadoMapper usuarioAsignadoMapper;

    public UsuarioAsignadoServiceImpl(UsuarioAsignadoRepository usuarioAsignadoRepository, UsuarioAsignadoMapper usuarioAsignadoMapper) {
        this.usuarioAsignadoRepository = usuarioAsignadoRepository;
        this.usuarioAsignadoMapper = usuarioAsignadoMapper;
    }

    @Override
    public List<UsuarioAsignadoDto> listado() {
        return this.usuarioAsignadoMapper.listadoDao(this.usuarioAsignadoRepository.findAll());
    }

    @Override
    public UsuarioAsignadoDto registrar(UsuarioAsignadoDto usuarioAsignadoDto) {
        return this.usuarioAsignadoMapper.usuarioAsignadoDao(this.usuarioAsignadoRepository.save(this.usuarioAsignadoMapper.usuarioAsignadoEntity(usuarioAsignadoDto)));
    }

    @Override
    public UsuarioAsignadoDto modificar(Long idUsuarioAsingado, UsuarioAsignadoDto usuarioAsignadoDto) {
        if(idUsuarioAsingado!=null){
            return this.usuarioAsignadoMapper.usuarioAsignadoDao(this.usuarioAsignadoRepository.save(this.usuarioAsignadoMapper.usuarioAsignadoEntity(usuarioAsignadoDto)));
        } else {
            return null;
        }
    }

    @Override
    public void eliminar(Long idUsuarioAsignado) {
        this.usuarioAsignadoRepository.deleteById(idUsuarioAsignado);
    }
}
