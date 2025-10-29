package modelos;

/**
 * Clase base Usuario.
 */
public class Usuario {
    private String nombre;
    private String apellido;
    private String usuario;
    private String contrasenia;
    private boolean logIn;

    public Usuario() {}

    public Usuario(String nombre, String apellido, String usuario, String contrasenia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }

    // Métodos del diagrama
    public boolean logIn() {
        // TODO: implementar inicar sesion
        this.logIn = true;
        return this.logIn;
    }

    public boolean logOut() {
        // TODO: implementar cierre de sesión
        this.logIn = false;
        return !this.logIn;
    }

    // Getters/Setters creados automaticamente :)
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public String getUsuario() { return usuario; }
    public void setsuario(String email) { this.usuario = email; }

    public String getContrasenia() { return contrasenia; }
    public void setContrasenia(String contrasenia) { this.contrasenia = contrasenia; }

    public boolean isLogIn() { return logIn; }
    public void setLogIn(boolean logIn) { this.logIn = logIn; }


    // Posible To string
    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + usuario + '\'' +
                '}';
    }
}
