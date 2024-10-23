package pe.edu.cibertec.ef_cache_penanectar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.ef_cache_penanectar.model.Historial;

import java.util.List;

@Repository
public interface HistorialRepository extends JpaRepository<Historial,Integer> {

    @Query(value = "SELECT * FROM Historial WHERE idusuario = :idusuario",
            nativeQuery = true)
    List<Historial> listaHistorialXCliente (@Param("idusuario") int idusuario);

    @Query(value = "SELECT * FROM Historial WHERE idcontenido = :idcontenido AND YEAR(fecha_visto) = :anio",
            nativeQuery = true)
    List<Historial> obtenerHistorialXContenidoXanio(@Param("idcontenido") int idcontenido,
                                                    @Param("anio") int anio);
}
