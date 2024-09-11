package pe.edu.upeu.LP2_clase01.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.LP2_clase01.dao.AlumnoDao;
import pe.edu.upeu.LP2_clase01.entity.Alumno;
import pe.edu.upeu.LP2_clase01.repository.AlumnoRepository;

@Component
public class AlumnoDaoImpl implements AlumnoDao {

    @Autowired
    private AlumnoRepository alumnoRepository;
    
    @Override
    public Alumno create(Alumno a) {
        return alumnoRepository.save(a);
    }

    @Override
    public Alumno update(Alumno a) {
        return alumnoRepository.save(a);
    }

    @Override
    public void delete(Long id) {
        alumnoRepository.deleteById(id);
    }

    @Override
    public Optional<Alumno> read(Long id) {
        return alumnoRepository.findById(id);
    }

    @Override
    public List<Alumno> readAll() {
        return alumnoRepository.findAll();
    }
}
