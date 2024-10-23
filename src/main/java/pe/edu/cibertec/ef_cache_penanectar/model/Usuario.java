package pe.edu.cibertec.ef_cache_penanectar.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "Usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idusuario;
    private String nombre;
    private String correo;
    private String password;
    private Date fecha_registro;
}
