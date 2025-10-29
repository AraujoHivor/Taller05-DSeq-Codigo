package modelos;

import java.time.LocalDateTime;

public abstract class ActividadSumativa {
    protected String titulo;
    protected LocalDateTime fechaDeEntrega;
    protected float puntajeMaximo;
    protected String contenido;
    protected float calificacion;
    protected String id;

    public ActividadSumativa() {}

    public ActividadSumativa(String id, String titulo, float puntajeMaximo) {
        this.id = id;
        this.titulo = titulo;
        this.puntajeMaximo = puntajeMaximo;
    }

    // Getters/Setters
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public LocalDateTime getFechaDeEntrega() { return fechaDeEntrega; }
    public void setFechaDeEntrega(LocalDateTime fechaDeEntrega) { this.fechaDeEntrega = fechaDeEntrega; }
    public float getPuntajeMaximo() { return puntajeMaximo; }
    public void setPuntajeMaximo(float puntajeMaximo) { this.puntajeMaximo = puntajeMaximo; }
    public String getContenido() { return contenido; }
    public void setContenido(String contenido) { this.contenido = contenido; }
    public float getCalificacion() { return calificacion; }
    public void setCalificacion(float calificacion) { this.calificacion = calificacion; }
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
}
