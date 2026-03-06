package ies.alcores.api_libros.service;

import ies.alcores.api_libros.model.Libro;
import ies.alcores.api_libros.repository.LibroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroService {

    private final LibroRepository libroRepository;

    public LibroService(LibroRepository libroRepository) {
        this.libroRepository = libroRepository;
    }

    // CONSULTA 1
    public List<Libro> obtenerTodos() {
        return libroRepository.findAll();
    }

    // CONSULTA 2
    public List<Libro> obtenerPorSaga(Long sagaId) {
        return libroRepository.findBySagaId(sagaId);
    }

    // INSERT
    public Libro crearLibro(Libro libro) {
        return libroRepository.save(libro);
    }
}