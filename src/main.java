import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        /**
         * llamamos a los objetos
         */
        Cine cine = new Cine("Cines Yelmo", 20, 3);
        Pelicula peli1 = new Pelicula("Shrek 2", 120);
        Pelicula peli2 = new Pelicula("Your name", 160);
        Pelicula peli3 = new Pelicula("Señor de los anillos: Retorno del rey", 240);
        /**
         * creamos un array
         */
        Sala[] sala = new Sala[cine.getSala()];

        sala[0] = new Sala(1, 4, 5, peli1);
        sala[1] = new Sala(2, 4, 5, peli2);
        sala[2] = new Sala(3, 4, 5, peli3);
        boolean salir = false;
        int opcion;
        /**
         * hacemos un do-while para que entre el bucle el programa
         */
        do {
            System.out.println("\n");
            System.out.println("<<<<<<Bienvenido/a a " + cine.getNombre() + " >>>>>>>>>");
            System.out.println("1. Ver las peliculas y salas");
            System.out.println("2. Elegir sala y butaca");
            System.out.println("3. Ver las butacas de una sala");
            System.out.println("4. Salir del sistema de citas");
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                /**
                 * con esta opcion llamamos al metodo VerSalayPeli
                 */
                case 1:
                    System.out.println("\n	<<<<<<<Cartelera>>>>>>>>>");
                    System.out.println("	Aforo maximo de las salas: " + cine.getAforo());
                    for (int i = 0; i < sala.length; i++) {
                        sala[i].VerSalayPeli();
                    }
                    /**
                     * con esta opcion llamamos al metodo Reservar
                     */
                    break;
                case 2:
                    System.out.println("\n");
                    System.out.print("Seleccione la sala: ");
                    int case2 = sc.nextInt();
                    if (case2 <= 0 || case2 > 3) {
                        System.out.println("Introduce una opcion correcta [1, 2 o 3]");
                    } else
                        sala[case2 - 1].Reservar();
                    break;
                /**
                 * con esta opcion llamamos al metodo VerButaca
                 */
                case 3:
                    System.out.println("\n");
                    System.out.print("Seleccione la sala: ");
                    int case3 = sc.nextInt();
                    if (case3 <= 0 || case3 > 3) {
                        System.out.println("Introduce una opcion correcta [1, 2 o 3]");
                    } else
                        sala[case3 - 1].VerButaca();
                    break;
                case 4:
                    /**
                     * con esta opcion salimos del programa
                     */
                    System.out.println("Fin del programa");
                    salir = true;
                    break;
                /**
                 * si introducimos una opcion que no este dentro, nos saldra este mensaje
                 */
                default:
                    System.out.println("Introduce una opcion correcta [1, 2 , 3 o 4]");
                    break;
            }
        } while (salir == false);
    }
}