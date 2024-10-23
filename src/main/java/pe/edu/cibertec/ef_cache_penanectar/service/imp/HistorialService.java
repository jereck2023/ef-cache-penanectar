package pe.edu.cibertec.ef_cache_penanectar.service.imp;

import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.ef_cache_penanectar.model.Historial;
import pe.edu.cibertec.ef_cache_penanectar.repository.HistorialRepository;
import pe.edu.cibertec.ef_cache_penanectar.service.IHistorialService;

import java.util.List;

@RequiredArgsConstructor
@Service
public class HistorialService implements IHistorialService {

    private final HistorialRepository historialRepository;

    @CacheEvict(value = "historialCliente", allEntries = true)
    @Override
    public List<Historial> listaHistorialXCliente(int idusuario) {
        return historialRepository.listaHistorialXCliente(idusuario);
    }

    @Cacheable(value = "historialAnio", key = "#anio")
    @Override
    public List<Historial> obtenerHistorialXContenidoXanio(int idcontenido, int anio) {
        return historialRepository.obtenerHistorialXContenidoXanio(idcontenido,anio);
    }
}
