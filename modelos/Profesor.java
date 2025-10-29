package modelos;

public class Profesor extends PersonalAcademico {

    public Profesor() { super(); } //or la herencia 

    public Profesor(String nombre, String apellido, String usuario, String contrasenia) {
        super(nombre, apellido, usuario, contrasenia);
    }

    public void cargarActividadSumativa(Curso curso, ActividadSumativa actividadSumativa) {
        // TODO: publicar actividad para el curso
        curso.agregarActividad(actividadSumativa);
    }

    public void calificarActividadSumativa(Curso curso, Estudiante estudiante, ActividadSumativa actividadSumativa) {
        // TODO: asignar calificación a la actividad del estudiante
    }

    public void aceptarInscripcion(Curso curso, Estudiante estudiante, String decision) {
        // decision: "aceptar" | "rechazar"
        // TODO: mover estudiante de espera a inscritos según decisión
    }

    public void crearNuevoForo(Foro foro) {
        // TODO: asociar foro a un curso si aplica
    }
}
