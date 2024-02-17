/**
 * nombre de la clase
 */
public class Pelicula {
    /**
     * los atributos de la clase
     */
    private String titulo;
    private int duracion;

    /**
     *El constructor
     */
    public Pelicula(String titulo, int duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
    }

    /**
     *getTitulo obtiene el valor de un atributo
     */
    public String getTitulo() {
        return titulo;
    }
    /**
     *setTitulo establece el valor al atributo
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    /**
     *getDuracion obtiene el valor de un atributo
     */
    public int getDuracion() {
        return duracion;
    }
    /**
     *setDuracion establece el valor al atributo
     */
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }


}
