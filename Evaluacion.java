
package modelos;

public class Evaluacion extends ActividadSumativa {
    private int limiteDeTiempo; // en minutos

    public Evaluacion() { super(); }

    public Evaluacion(String id, String titulo, float puntajeMaximo, int limiteDeTiempo) {
        super(id, titulo, puntajeMaximo);
        this.limiteDeTiempo = limiteDeTiempo;
    }

    public int getLimiteDeTiempo() { return limiteDeTiempo; }
    public void setLimiteDeTiempo(int limiteDeTiempo) { this.limiteDeTiempo = limiteDeTiempo; }
}
