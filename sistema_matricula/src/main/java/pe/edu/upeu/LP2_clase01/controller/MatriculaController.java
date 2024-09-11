package pe.edu.upeu.LP2_clase01.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import pe.edu.upeu.LP2_clase01.entity.Matricula;
import pe.edu.upeu.LP2_clase01.service.MatriculaService;

@RestController
@RequestMapping("/api/matriculas")
public class MatriculaController {

    @Autowired
    private MatriculaService matriculaService;

    @GetMapping
    public ResponseEntity<List<Matricula>> readAll() {
        try {
            List<Matricula> matriculas = matriculaService.readAll();
            if (matriculas.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(matriculas, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping
    public ResponseEntity<Matricula> crear(@Valid @RequestBody Matricula matricula) {
        try {
            Matricula nuevaMatricula = matriculaService.create(matricula);
            return new ResponseEntity<>(nuevaMatricula, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Matricula> getMatriculaId(@PathVariable("id") Long id) {
        Optional<Matricula> matricula = matriculaService.read(id);
        return matricula.isPresent()
            ? new ResponseEntity<>(matricula.get(), HttpStatus.OK)
            : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> delMatricula(@PathVariable("id") Long id) {
        try {
            matriculaService.delete(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Matricula> updateMatricula(@PathVariable("id") Long id, @Valid @RequestBody Matricula matricula) {
        Optional<Matricula> matriculaExistente = matriculaService.read(id);
        if (matriculaExistente.isPresent()) {
            matricula.setId(id);
            Matricula actualizada = matriculaService.update(matricula);
            return new ResponseEntity<>(actualizada, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
