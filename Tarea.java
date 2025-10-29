package modelos;

import java.time.LocalDateTime;

public class Tarea extends ActividadSumativa {
    private LocalDateTime fechaDePublicacion;

    public Tarea() { super(); }

    public Tarea(String id, String titulo, float puntajeMaximo, LocalDateTime fechaDePublicacion) {
        super(id, titulo, puntajeMaximo);
        this.fechaDePublicacion = fechaDePublicacion;
    }

    public LocalDateTime getFechaDePublicacion() { return fechaDePublicacion; }
    public void setFechaDePublicacion(LocalDateTime fechaDePublicacion) { this.fechaDePublicacion = fechaDePublicacion; }
}
