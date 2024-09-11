package pe.edu.upeu.LP2_clase01.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.LP2_clase01.entity.Grado;

public interface GradoService {
    Grado create(Grado g);
    Grado update(Grado g);
    void delete(Long id);
    Optional<Grado> read(Long id);
    List<Grado> readAll();
}
