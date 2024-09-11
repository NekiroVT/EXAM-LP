package pe.edu.upeu.LP2_clase01.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.LP2_clase01.entity.Matricula;

public interface MatriculaService {
    Matricula create(Matricula m);
    Matricula update(Matricula m);
    void delete(Long id);
    Optional<Matricula> read(Long id);
    List<Matricula> readAll();
}
