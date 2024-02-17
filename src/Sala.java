import java.util.Scanner;

/**
 * nombre de la clase
 */
public class Sala {
    /**
     * nomnbre de los atributos
     */
    private int identificacion;
    private int [][] butaca;
    private Pelicula pelicula;

    /**
     * el constructor de la clase
     */
    public Sala(int identificacion, int fila, int columna, Pelicula pelicula) {
        this.identificacion = identificacion;
        this.butaca = new int[fila][columna];
        this.pelicula = pelicula;
    }

    /**
     * este metodo muestra la informacion de la pelicula
     */
    public void VerSalayPeli() {
        System.out.println("\n");
        System.out.println("	Pelicula: " + pelicula.getTitulo());
        System.out.println("	Duracion: " + pelicula.getDuracion());
        System.out.println("	Sala: " + identificacion);

    }

    /**
     * este metodo reserva el asiento de la pelicula que quieras ver
     */
    public void Reservar() {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        System.out.println("Sala de cine");
        for (int i = 0; i < butaca.length; i++) {
            for (int j = 0; j < butaca[i].length; j++) {
                System.out.print(butaca[i][j] + " ");
            }
            System.out.println();
        }

        while(salir == false) {
            System.out.print("Seleccione fila: ");
            int fila = sc.nextInt();
            if(fila < 0 || fila > 4) {
                System.out.println("Seleccione una opcion valida [0 - 4]");
            } else {
                System.out.print("Seleccione columna: ");
                int columna = sc.nextInt();
                if (columna < 0 || columna > 4) {
                    System.out.println("Seleccione una opcion valida [0 - 4]");
                } else {
                    System.out.println("\n");

                    if (butaca[fila][columna] == 1) {
                        System.out.println("Asiento ocupado");
                    } else {
                        butaca[fila][columna] = 1;
                        System.out.println("Asiento reservado");
                        salir = true;
                    }
                }
            }
            for (int i = 0; i < butaca.length; i++) {
                for (int j = 0; j < butaca[i].length; j++) {
                    System.out.print(butaca[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    /**
     * este metodo muestran las butacas
     */
    public void VerButaca() {
        for (int i = 0; i < butaca.length; i++) {
            for (int j = 0; j < butaca[i].length; j++) {
                System.out.print(butaca[i][j] + " ");
            }
            System.out.println();
        }
    }
    /**
     *getIdentificacion obtiene el valor de un atributo
     */
    public int getIdentificacion() {
        return identificacion;
    }
    /**
     *setIdentificacion establece el valor al atributo
     */
    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }
    /**
     *getButaca obtiene el valor de un atributo
     */
    public int[][] getButaca() {
        return butaca;
    }
    /**
     *setButaca establece el valor al atributo
     */
    public void setButaca(int[][] butaca) {
        this.butaca = butaca;
    }
    /**
     *getPelicula obtiene el valor de un atributo
     */
    public Pelicula getPelicula() {
        return pelicula;
    }
    /**
     *setPelicula establece el valor al atributo
     */
    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }



}