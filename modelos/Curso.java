package modelos;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String id;
    private String nombre;
    private boolean estadoDisponible;

    // Relaciones
    private Profesor profesor;
    private List<Estudiante> estudiantesInscritos = new ArrayList<>();
    private List<Estudiante> estudiantesEnEsperaDeInscripcion = new ArrayList<>();
    private List<ActividadSumativa> actividadesSumativas = new ArrayList<>();
    private List<Foro> foros = new ArrayList<>();

    public Curso() {}

    public Curso(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.estadoDisponible = true;
    }

    // Bosquejo de operaciones
    public void agregarActividad(ActividadSumativa actividad) {
        // TODO: agregar actividad a la lista
        actividadesSumativas.add(actividad);
    }

    public void agregarForo(Foro foro) {
        // TODO: agregar foro
        foros.add(foro);
    }

    // Getters/Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public boolean isEstadoDisponible() { return estadoDisponible; }
    public void setEstadoDisponible(boolean estadoDisponible) { this.estadoDisponible = estadoDisponible; }
    public Profesor getProfesor() { return profesor; }
    public void setProfesor(Profesor profesor) { this.profesor = profesor; }
    public List<Estudiante> getEstudiantesInscritos() { return estudiantesInscritos; }
    public List<Estudiante> getEstudiantesEnEsperaDeInscripcion() { return estudiantesEnEsperaDeInscripcion; }
    public List<ActividadSumativa> getActividadesSumativas() { return actividadesSumativas; }
    public List<Foro> getForos() { return foros; }
}
