package pe.edu.cibertec.ef_cache_penanectar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.ef_cache_penanectar.model.Contenido;

import java.util.List;

@Repository
public interface ContenidoRepository extends JpaRepository<Contenido,Integer> {
    @Query(value = "SELECT * FROM Contenido WHERE YEAR(fecha_estreno) = :anio",
            nativeQuery = true)
    List<Contenido> listaContenidoxAnio(@Param("anio") int anio);
}
