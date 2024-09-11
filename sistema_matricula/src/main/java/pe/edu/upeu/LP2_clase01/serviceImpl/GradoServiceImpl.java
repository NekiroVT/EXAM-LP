package pe.edu.upeu.LP2_clase01.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.LP2_clase01.dao.GradoDao;
import pe.edu.upeu.LP2_clase01.entity.Grado;
import pe.edu.upeu.LP2_clase01.service.GradoService;

@Service
public class GradoServiceImpl implements GradoService {

    @Autowired
    private GradoDao dao;
    
    @Override
    public Grado create(Grado g) {
        return dao.create(g);
    }

    @Override
    public Grado update(Grado g) {
        return dao.update(g);
    }

    @Override
    public void delete(Long id) {
        dao.delete(id);
    }

    @Override
    public Optional<Grado> read(Long id) {
        return dao.read(id);
    }

    @Override
    public List<Grado> readAll() {
        return dao.readAll();
    }
}
