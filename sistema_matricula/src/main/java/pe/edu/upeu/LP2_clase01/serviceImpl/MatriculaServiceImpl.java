package pe.edu.upeu.LP2_clase01.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.LP2_clase01.dao.MatriculaDao;
import pe.edu.upeu.LP2_clase01.entity.Matricula;
import pe.edu.upeu.LP2_clase01.service.MatriculaService;

@Service
public class MatriculaServiceImpl implements MatriculaService {

    @Autowired
    private MatriculaDao dao;
    
    @Override
    public Matricula create(Matricula m) {
        return dao.create(m);
    }

    @Override
    public Matricula update(Matricula m) {
        return dao.update(m);
    }

    @Override
    public void delete(Long id) {
        dao.delete(id);
    }

    @Override
    public Optional<Matricula> read(Long id) {
        return dao.read(id);
    }

    @Override
    public List<Matricula> readAll() {
        return dao.readAll();
    }
}
