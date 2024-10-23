package pe.edu.cibertec.ef_cache_penanectar.service.imp;

import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.ef_cache_penanectar.model.Contenido;
import pe.edu.cibertec.ef_cache_penanectar.model.Historial;
import pe.edu.cibertec.ef_cache_penanectar.repository.ContenidoRepository;
import pe.edu.cibertec.ef_cache_penanectar.service.IContenidoService;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ContenidoService implements IContenidoService {

    private final ContenidoRepository contenidoRepository;

    @Cacheable(value = "contenidoAnio", key = "#anio")
    @Override
    public List<Contenido> listaContenidoxAnio(int anio) {
        return contenidoRepository.listaContenidoxAnio(anio);
    }

    @CacheEvict(value = "contenido", allEntries = true)
    @Override
    public Contenido registrarContenido(Contenido contenido) {
        return contenidoRepository.save(contenido);
    }
}
