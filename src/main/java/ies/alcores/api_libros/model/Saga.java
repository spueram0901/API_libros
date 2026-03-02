package ies.alcores.api_libros.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Saga {

    @Id
    private long id;
    private String nombre;
    private String autor;
    private String genero;
    private Date fecha_inicio;
}
