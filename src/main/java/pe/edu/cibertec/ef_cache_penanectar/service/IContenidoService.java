package pe.edu.cibertec.ef_cache_penanectar.service;

import pe.edu.cibertec.ef_cache_penanectar.model.Contenido;

import java.util.List;

public interface IContenidoService {
    List<Contenido> listaContenidoxAnio(int anio);;
    Contenido registrarContenido(Contenido contenido);
}
