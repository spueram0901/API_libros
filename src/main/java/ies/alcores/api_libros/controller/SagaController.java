package ies.alcores.api_libros.controller;

import ies.alcores.api_libros.model.Saga;
import ies.alcores.api_libros.service.SagaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sagas")
public class SagaController {

    private final SagaService sagaService;

    public SagaController(SagaService sagaService) {
        this.sagaService = sagaService;
    }

    // CONSULTA 3
    @GetMapping
    public List<Saga> getSagas() {
        return sagaService.obtenerTodas();
    }

    // MODIFICACION
    @PutMapping("/{id}")
    public Saga actualizarSaga(@PathVariable Long id, @RequestBody Saga saga) {
        return sagaService.actualizarSaga(id, saga);
    }
}
