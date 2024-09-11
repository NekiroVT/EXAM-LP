package pe.edu.upeu.LP2_clase01.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.LP2_clase01.dao.MatriculaDao;
import pe.edu.upeu.LP2_clase01.entity.Matricula;
import pe.edu.upeu.LP2_clase01.repository.MatriculaRepository;

@Component
public class MatriculaDaoImpl implements MatriculaDao {

    @Autowired
    private MatriculaRepository matriculaRepository;
    
    @Override
    public Matricula create(Matricula m) {
        return matriculaRepository.save(m);
    }

    @Override
    public Matricula update(Matricula m) {
        return matriculaRepository.save(m);
    }

    @Override
    public void delete(Long id) {
        matriculaRepository.deleteById(id);
    }

    @Override
    public Optional<Matricula> read(Long id) {
        return matriculaRepository.findById(id);
    }

    @Override
    public List<Matricula> readAll() {
        return matriculaRepository.findAll();
    }
}
