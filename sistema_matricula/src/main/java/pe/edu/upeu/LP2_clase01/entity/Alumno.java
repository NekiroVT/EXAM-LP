package pe.edu.upeu.LP2_clase01.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@Entity
@Table(name = "alumnos")
public class Alumno {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "alumno_seq")
    @SequenceGenerator(name = "alumno_seq", sequenceName = "ALUMNO_SEQ", allocationSize = 1)
    private Long id;

    @Column(name = "codigo", length = 10)
    private String codigo;

    @Column(name = "nombres", length = 50)
    private String nombres;

    @Column(name = "apellidos", length = 50)
    private String apellidos;

    @Column(name = "fecha_nac")
    private java.sql.Date fechaNac;

    @Column(name = "correo", length = 50)
    private String correo;
}
