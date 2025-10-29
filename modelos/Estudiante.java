package modelos;

public class Estudiante extends PersonalAcademico {

    public Estudiante() { super(); }

    public Estudiante(String nombre, String apellido, String usuario, String contrasenia) {
        super(nombre, apellido, usuario, contrasenia);
    }

    public void solicitarInscripcionCurso(Curso curso) {
        // TODO: solcitarLa incricionalCurso
    }

    public void realizarActividadSumativa(Curso curso, ActividadSumativa actividadSumativa) {
        // TODO: realizarActividadSumativa
    }
}
