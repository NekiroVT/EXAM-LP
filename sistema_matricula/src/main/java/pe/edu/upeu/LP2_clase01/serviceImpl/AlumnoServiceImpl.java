package pe.edu.upeu.LP2_clase01.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.LP2_clase01.dao.AlumnoDao;
import pe.edu.upeu.LP2_clase01.entity.Alumno;
import pe.edu.upeu.LP2_clase01.service.AlumnoService;

@Service
public class AlumnoServiceImpl implements AlumnoService {

    @Autowired
    private AlumnoDao dao;
    
    @Override
    public Alumno create(Alumno a) {
        return dao.create(a);
    }

    @Override
    public Alumno update(Alumno a) {
        return dao.update(a);
    }

    @Override
    public void delete(Long id) {
        dao.delete(id);
    }

    @Override
    public Optional<Alumno> read(Long id) {
        return dao.read(id);
    }

    @Override
    public List<Alumno> readAll() {
        return dao.readAll();
    }
}
