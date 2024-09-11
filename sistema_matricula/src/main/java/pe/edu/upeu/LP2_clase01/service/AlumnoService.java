package pe.edu.upeu.LP2_clase01.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.LP2_clase01.entity.Alumno;

public interface AlumnoService {
    Alumno create(Alumno a);
    Alumno update(Alumno a);
    void delete(Long id);
    Optional<Alumno> read(Long id);
    List<Alumno> readAll();
}
