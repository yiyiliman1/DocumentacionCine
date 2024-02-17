
public class Cine {

    private String nombre;
    private int aforo = 20;
    private int sala;

    public Cine(String nombre, int aforo, int sala) {
        this.nombre = nombre;
        this.aforo = aforo;
        this.sala = sala;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAforo() {
        return aforo;
    }

    public void setAforo(int aforo) {
        this.aforo = aforo;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }


}