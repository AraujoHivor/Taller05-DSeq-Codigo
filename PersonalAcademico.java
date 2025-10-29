package modelos;

/**
 * Clase intermedia PersonalAcademico que hereda de Usuario.
 * (superclase de Estudiante y Profesor)
 */
public class PersonalAcademico extends Usuario {

    public PersonalAcademico() { super(); }

    public PersonalAcademico(String nombre, String apellido, String usuario, String contrasenia) {
        super(nombre, apellido, usuario, contrasenia);
    }

    // Métodos del diagrama
    public void reportarError(String email, String contenido) {
        // TODO: enviar reporte a soporte técnico
    }

    public void solicitarAsesoramientoDelSistema(String email, String contenido) {
        // TODO: canalizar solicitud al soporte
    }

    public void comentarEnForo(Foro foro, String comentario) {
        // TODO: agregar comentario al foro
    }
}
