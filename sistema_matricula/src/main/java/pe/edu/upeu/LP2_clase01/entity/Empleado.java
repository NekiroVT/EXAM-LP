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
@Table(name = "empleados")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "empleado_seq")
    @SequenceGenerator(name = "empleado_seq", sequenceName = "EMPLEADO_SEQ", allocationSize = 1)
    private Long id;

    @Column(name = "dni", length = 8)
    private String dni;

    @Column(name = "nombres", length = 50)
    private String nombres;

    @Column(name = "apellidos", length = 50)
    private String apellidos;

    @Column(name = "fecha_ingreso")
    private java.sql.Date fechaIngreso;

    @Column(name = "cargo", length = 50)
    private String cargo;
}
