package pe.edu.cibertec.ef_cache_penanectar.service;

import pe.edu.cibertec.ef_cache_penanectar.model.Historial;

import java.util.List;

public interface IHistorialService {

    List<Historial> listaHistorialXCliente (int idusuario);
    List<Historial> obtenerHistorialXContenidoXanio (int idcontenido,int anio);
}
