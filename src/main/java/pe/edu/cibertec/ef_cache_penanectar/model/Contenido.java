package pe.edu.cibertec.ef_cache_penanectar.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "Contenido")
public class Contenido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idcontenido;
    private String titulo;
    @ManyToOne
    @JoinColumn(name = "idtipo")
    private TipoContenido tipo;
    @ManyToOne
    @JoinColumn(name = "idgenero")
    private Genero genero;
    private Integer duracion;
    private Date fecha_estreno;
    private String clasificacion;
}
