package modelos;

import java.time.LocalDateTime; //Para usar tipo de dato de tiempo
import java.util.ArrayList; // Para usar ArrayList
import java.util.List; //Para usar listas

public class Incidente {
    private int id;
    private LocalDateTime fechaReportado;
    private String estado;
    private String titulo;
    private String descripcion;
    private List<String> logActualizaciones = new ArrayList<>();
    private LocalDateTime fechaCerrado;
    private String tipo;

    // Relaciones opcionales para interpretar el diagrama
    private Usuario reportadoPor;
    private SoporteTecnico atendidoPor;
    private Administrador derivadoA;

    public Incidente() {}

    public Incidente(int id, String titulo, String descripcion, String tipo, Usuario reportadoPor) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.reportadoPor = reportadoPor;
        this.fechaReportado = LocalDateTime.now();
        this.estado = "Abierto";
    }

    public void agregarActualizacion(String detalle) {
        // TODO: agregar registro en logActualizaciones
        logActualizaciones.add(detalle);
    }

    public void cerrarIncidente() {
        // TODO: actualizar estado y fecha de cierre
        this.estado = "Cerrado";
        this.fechaCerrado = LocalDateTime.now();
    }

    // Getters/Setters generados de forma básica
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public LocalDateTime getFechaReportado() { return fechaReportado; }
    public void setFechaReportado(LocalDateTime fechaReportado) { this.fechaReportado = fechaReportado; }
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public List<String> getLogActualizaciones() { return logActualizaciones; }
    public void setLogActualizaciones(List<String> logActualizaciones) { this.logActualizaciones = logActualizaciones; }
    public LocalDateTime getFechaCerrado() { return fechaCerrado; }
    public void setFechaCerrado(LocalDateTime fechaCerrado) { this.fechaCerrado = fechaCerrado; }
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public Usuario getReportadoPor() { return reportadoPor; }
    public void setReportadoPor(Usuario reportadoPor) { this.reportadoPor = reportadoPor; }
    public SoporteTecnico getAtendidoPor() { return atendidoPor; }
    public void setAtendidoPor(SoporteTecnico atendidoPor) { this.atendidoPor = atendidoPor; }
    public Administrador getDerivadoA() { return derivadoA; }
    public void setDerivadoA(Administrador derivadoA) { this.derivadoA = derivadoA; }
}
