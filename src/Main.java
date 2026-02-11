import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {


    public static final String X = "==============================================================";


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Juego> juegos = new ArrayList<>();
        ArrayList<Listados> ventas = new ArrayList<>();


        String dollar = "$";
        int opcion;


        do {
            System.out.println(X);
            System.out.println("Elige la opcion");
            System.out.println("1. Ingresar Juego");
            System.out.println("2. Vender Juego");
            System.out.println("3. Ver Juegos");
            System.out.println("4. Limpiar Pantalla");
            System.out.println("0. Salir");
            System.out.println(X);


            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer


            switch (opcion) {


                case 1:
                    Juego juego = new Juego();
                    juego.RegistrarJuegos();
                    juegos.add(juego);
                    System.out.println("Juego creado: " + juego.getTitulo());
                    break;


                case 2:
                    System.out.print("Nombre del cliente: ");
                    String nombreCliente = sc.nextLine();


                    System.out.print("Nombre del juego a vender: ");
                    String nombreJuego = sc.nextLine();


                    boolean encontrado = false;


                    for (int i = 0; i < juegos.size(); i++) {
                        if (juegos.get(i).getTitulo().equalsIgnoreCase(nombreJuego)) {


                            Listados v = new Listados(nombreCliente, juegos.get(i).getTitulo());
                            ventas.add(v);


                            juegos.remove(i);


                            System.out.println("Venta realizada y juego eliminado del stock.");
                            encontrado = true;
                            break;
                        }
                    }


                    if (!encontrado) {
                        System.out.println("Ese juego no existe en el listado.");
                    }


                    break;


                case 3:
                    if (juegos.isEmpty()) {
                        System.out.println("No hay juegos registrados.");
                    } else {
                        for (Juego j : juegos) {
                            System.out.println("|| Titulo: " + j.getTitulo()
                                    + " || Precio: " + j.getPrecio() + dollar
                                    + " || Genero: " + j.getGenero());
                        }
                    }
                    System.out.println("Pulsa ENTER para continuar...");
                    sc.nextLine();
                    break;


                case 4:
                    try {
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    } catch (IOException | InterruptedException e) {
                        System.out.println("No se pudo limpiar la pantalla.");
                    }
                    break;


                case 0:
                    System.out.println("Saliendo del programa...");
                    break;


                default:
                    System.out.println("Opcion no valida.");
            }


        } while (opcion != 0);


        sc.close();
    }
}
