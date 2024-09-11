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
@Table(name = "grados")
public class Grado {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "grado_seq")
    @SequenceGenerator(name = "grado_seq", sequenceName = "GRADO_SEQ", allocationSize = 1)
    private Long id;

    @Column(name = "grado_sec", length = 15)
    private String gradoSec;

    @Column(name = "grado_nivel", length = 15)
    private String gradoNivel;
}
