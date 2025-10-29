package modelos;

public class SoporteTecnico extends Usuario {

    public SoporteTecnico() { super(); } //Por la herencia llamada al padre

    public SoporteTecnico(String nombre, String apellido, String usuario, String contrasenia) {
        super(nombre, apellido, usuario, contrasenia);
    }

    public void brindarAsistencia(Usuario usuario) {
        // TODO: guiar al usuario en el uso de la plataforma
    }

    public void resolverProblemaTecnico(Usuario usuario) {
        // TODO: diagnosticar y resolver problema técnico
    }

    public void derivarProblemaDeGestion(Administrador administrador) {
        // TODO: derivar incidente al administrador
    }
}
