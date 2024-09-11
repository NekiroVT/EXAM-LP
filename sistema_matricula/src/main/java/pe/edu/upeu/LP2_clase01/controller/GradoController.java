package pe.edu.upeu.LP2_clase01.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import pe.edu.upeu.LP2_clase01.entity.Grado;
import pe.edu.upeu.LP2_clase01.service.GradoService;

@RestController
@RequestMapping("/api/grados")
public class GradoController {

    @Autowired
    private GradoService gradoService;

    @GetMapping
    public ResponseEntity<List<Grado>> readAll() {
        try {
            List<Grado> grados = gradoService.readAll();
            if (grados.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(grados, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping
    public ResponseEntity<Grado> crear(@Valid @RequestBody Grado grado) {
        try {
            Grado nuevoGrado = gradoService.create(grado);
            return new ResponseEntity<>(nuevoGrado, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Grado> getGradoId(@PathVariable("id") Long id) {
        Optional<Grado> grado = gradoService.read(id);
        return grado.isPresent()
            ? new ResponseEntity<>(grado.get(), HttpStatus.OK)
            : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> delGrado(@PathVariable("id") Long id) {
        try {
            gradoService.delete(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Grado> updateGrado(@PathVariable("id") Long id, @Valid @RequestBody Grado grado) {
        Optional<Grado> gradoExistente = gradoService.read(id);
        if (gradoExistente.isPresent()) {
            grado.setId(id);
            Grado actualizado = gradoService.update(grado);
            return new ResponseEntity<>(actualizado, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
