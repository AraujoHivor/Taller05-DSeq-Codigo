package modelos;

public class Foro {
    private String id;
    private String tematica;
    private int numeroDeComentarios;

    public Foro() {}

    public Foro(String id, String tematica) {
        this.id = id;
        this.tematica = tematica;
    }

    // Getters/Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getTematica() { return tematica; }
    public void setTematica(String tematica) { this.tematica = tematica; }
    public int getNumeroDeComentarios() { return numeroDeComentarios; }
    public void setNumeroDeComentarios(int numeroDeComentarios) { this.numeroDeComentarios = numeroDeComentarios; }
}
