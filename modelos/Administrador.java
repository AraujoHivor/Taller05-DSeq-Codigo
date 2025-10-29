package modelos;

public class Administrador extends Usuario {

    public Administrador() { super(); }  // Para el padre, herencia

    public Administrador(String nombre, String apellido, String usuario, String contrasenia) {
        super(nombre, apellido, usuario, contrasenia);
    }

    public void crearUsuarioConRol(String usuario, String contrasenia) {
        // TODO: asignar rol y persistir usuario
    }

    public void asignarPermisos(String usuario) {
        // TODO: gestionar permisos
    }

    public void actualizarSoftware() {
        // TODO: ejecutar actualización de software
    }

    public void asignarResponsable(Curso curso, Profesor responsable) {
        // TODO: vincular profesor responsable al curso
        curso.setProfesor(responsable);
    }
}
