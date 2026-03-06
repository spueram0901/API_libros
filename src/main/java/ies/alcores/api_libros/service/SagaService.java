package ies.alcores.api_libros.service;

import ies.alcores.api_libros.model.Saga;
import ies.alcores.api_libros.repository.SagaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SagaService {

    private final SagaRepository sagaRepository;

    public SagaService(SagaRepository sagaRepository) {
        this.sagaRepository = sagaRepository;
    }

    // CONSULTA 3
    public List<Saga> obtenerTodas() {
        return sagaRepository.findAll();
    }

    // MODIFICACION
    public Saga actualizarSaga(Long id, Saga saga) {

        Saga existente = sagaRepository.findById(id).orElse(null);

        if (existente != null) {
            existente.setNombre(saga.getNombre());
            existente.setAutor(saga.getAutor());
            existente.setGenero(saga.getGenero());
            existente.setFecha_inicio(saga.getFecha_inicio());

            return sagaRepository.save(existente);
        }

        return null;
    }
}
