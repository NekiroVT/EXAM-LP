package pe.edu.upeu.LP2_clase01.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.LP2_clase01.dao.EmpleadoDao;
import pe.edu.upeu.LP2_clase01.entity.Empleado;
import pe.edu.upeu.LP2_clase01.service.EmpleadoService;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {

    @Autowired
    private EmpleadoDao dao;
    
    @Override
    public Empleado create(Empleado e) {
        return dao.create(e);
    }

    @Override
    public Empleado update(Empleado e) {
        return dao.update(e);
    }

    @Override
    public void delete(Long id) {
        dao.delete(id);
    }

    @Override
    public Optional<Empleado> read(Long id) {
        return dao.read(id);
    }

    @Override
    public List<Empleado> readAll() {
        return dao.readAll();
    }
}
