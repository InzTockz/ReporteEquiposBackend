package com.gestorinventario.services.impl;

import com.gestorinventario.dto.TipoAlmacenamientoDto;
import com.gestorinventario.mapper.TipoAlmacenamientoMapper;
import com.gestorinventario.repository.TipoAlmacenamientoRepository;
import com.gestorinventario.services.TipoAlmacenamientoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoAlmacenamientoServiceImpl implements TipoAlmacenamientoService {

    private final TipoAlmacenamientoRepository tipoAlmacenamientoRepository;
    private final TipoAlmacenamientoMapper tipoAlmacenamientoMapper;

    public TipoAlmacenamientoServiceImpl(TipoAlmacenamientoRepository tipoAlmacenamientoRepository, TipoAlmacenamientoMapper tipoAlmacenamientoMapper) {
        this.tipoAlmacenamientoRepository = tipoAlmacenamientoRepository;
        this.tipoAlmacenamientoMapper = tipoAlmacenamientoMapper;
    }

    @Override
    public List<TipoAlmacenamientoDto> listado() {
        return this.tipoAlmacenamientoMapper.listadoDao(this.tipoAlmacenamientoRepository.findAll());
    }

    @Override
    public TipoAlmacenamientoDto registrar(TipoAlmacenamientoDto tipoAlmacenamientoDto) {
        return this.tipoAlmacenamientoMapper.tipoAlmacenamientoDao(this.tipoAlmacenamientoRepository.save(this.tipoAlmacenamientoMapper.tipoAlmacenamientoEntity(tipoAlmacenamientoDto)));
    }

    @Override
    public TipoAlmacenamientoDto modificar(Long idTipoAlmacenimiento, TipoAlmacenamientoDto tipoAlmacenamientoDto) {
        if(idTipoAlmacenimiento!=null){
            return this.tipoAlmacenamientoMapper.tipoAlmacenamientoDao(this.tipoAlmacenamientoRepository.save(this.tipoAlmacenamientoMapper.tipoAlmacenamientoEntity(tipoAlmacenamientoDto)));
        } else {
            return null;
        }
    }

    @Override
    public void eliminar(Long idTipoAlmacenamiento) {
        this.tipoAlmacenamientoRepository.deleteById(idTipoAlmacenamiento);
    }
}
