package ies.alcores.api_libros.controller;

import ies.alcores.api_libros.model.Libro;
import ies.alcores.api_libros.service.LibroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/libros")
public class LibroController {


    private final LibroService libroService;

    public LibroController(LibroService libroService) {
        this.libroService = libroService;
    }

    // CONSULTA 1
    @GetMapping
    public List<Libro> getLibros() {
        return libroService.obtenerTodos();
    }

    // CONSULTA 2
    @GetMapping("/saga/{idSaga}")
    public List<Libro> getLibrosPorSaga(@PathVariable Long idSaga) {
        return libroService.obtenerPorSaga(idSaga);
    }

    // INSERT
    @PostMapping
    public Libro crearLibro(@RequestBody Libro libro) {
        return libroService.crearLibro(libro);
    }

}
