import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {


    public static final String X = "================================================================";


    public static void main(String[] args){
        String dollar = "\u0024";
        Scanner sc = new Scanner(System.in);
        ArrayList<Juego> juegos = new ArrayList<>();
        int opcion;






        do {
            System.out.println(X);
            System.out.println(X);
            System.out.println("Elige la opcion\n1.Ingresar Juego\n2.Vender Juego\n3.Ver Juegos\n4.Limpiar Pantalla");
            System.out.println(X);
            opcion = sc.nextInt();
            sc.nextLine();




            switch (opcion){
                case 1:

                    Juego juego = new Juego();
                    juego.RegistrarJuegos();
                    juegos.add(juego);
                    System.out.println("Juego creado :" + juego.getTitulo());
                    break;

                case 2:
                    break;


                case 3:
                    for (int i = 0; i < juegos.size(); i++) {
                        System.out.println("||Titulo : " + juegos.get(i).getTitulo()+ "||Precio : " + juegos.get(i).getPrecio() + dollar + "||Genero : " + juegos.get(i).getGenero());
                    }
                    System.out.println("Esperando un enter");
                    sc.nextLine();
                    break;

                case 4:

                    try {
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }

                    break;
            }
        }while (opcion != 0);


    }
}

