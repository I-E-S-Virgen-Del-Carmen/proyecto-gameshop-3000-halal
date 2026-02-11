import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Juego> juegos = new ArrayList<>();

        System.out.println("Elige la opcion\n1.Ingresar Juego\n2.Vender Juego\n3.Ver Juegos");
        int opcion = sc.nextInt();


        while(opcion!=0){
            switch (opcion){
                case 1:

                    Juego juego1 = new Juego();
                    juego1.RegistrarJuegos();
                    System.out.println("Juego creado :" + juego1.getTitulo());

                    break;

                case 2:
                    break;

                case 3:
                    break;
            }


        }

    }
}