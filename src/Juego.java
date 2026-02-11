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

    public double getPrecio() {
        return precio;
    }
    public String getGenero() {
        return genero;
    }

    public void RegistrarJuegos() {
        System.out.print("Ingrese el nombre del juego con _  :");
        titulo = sc.nextLine();
        System.out.print("");
        System.out.print("Ingrese el precio del juego  :");
        precio = Double.parseDouble(sc.nextLine());
        System.out.print("");
        System.out.print("Ingrese el genero del juegos  :");
        genero = sc.nextLine();
        System.out.print("");
    }
}
