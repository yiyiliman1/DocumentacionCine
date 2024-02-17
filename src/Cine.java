/**
 * nombre de la clase
 */

public class Cine {
    /**
     * los atributos
     */
    private String nombre;
    private int aforo = 20;
    private int sala;

    /**
     *El constructor
     */
    public Cine(String nombre, int aforo, int sala) {
        this.nombre = nombre;
        this.aforo = aforo;
        this.sala = sala;
    }

    /**
     *getNombre obtiene el valor de un atributo
     */
    public String getNombre() {
        return nombre;
    }
    /**
     *setNombre establece el valor al atributo
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     *getAforo obtiene el valor de un atributo
     */
    public int getAforo() {
        return aforo;
    }
    /**
     *setAforo establece el valor al atributo
     */
    public void setAforo(int aforo) {
        this.aforo = aforo;
    }
    /**
     *getSala obtiene el valor de un atributo
     */
    public int getSala() {
        return sala;
    }
    /**
     *setSala establece el valor al atributo
     */
    public void setSala(int sala) {
        this.sala = sala;
    }


}