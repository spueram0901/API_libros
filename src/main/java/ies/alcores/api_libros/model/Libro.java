package ies.alcores.api_libros.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Libro {

    @Id
    private long id;
    private String titulo;
    private int numero_entrega;
    private Date fecha_publicacion;

    @ManyToOne
    private Saga saga_id;

}
