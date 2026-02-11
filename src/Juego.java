import java.util.ArrayList;
import java.util.Scanner;

public class Juego {
    Scanner sc = new Scanner(System.in);
    String titulo;
    double precio ;
    String genero;

    public String getTitulo() {
        return titulo;
    }

    public void RegistrarJuegos() {
        System.out.println("Ingrese el nombre del juego con _");
        titulo = sc.nextLine();
        System.out.println("Ingrese el precio del juego");
        precio = Double.parseDouble(sc.nextLine());
        System.out.println("Ingrese el genero del juego");
        genero = sc.nextLine();
    }
}
