package ies.alcores.api_libros.repository;

import ies.alcores.api_libros.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LibroRepository extends JpaRepository <Libro, Long> {
    List<Libro> findBySagaId(Long sagaId);
}
