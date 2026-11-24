import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Double> notes = new ArrayList<>();
        double notaingresada;

        System.out.println("Escribe una nota o ingresa 0 per a sortir");

        while (true){
            System.out.println("Ingresa la nota: ");
            notaingresada = scanner.nextDouble();

            if (notaingresada == 0){
                break;
            }
            notes.add(notaingresada);
        }
        if (notes.isEmpty()){
            System.out.println("No has introduit ninguna nota");
        } else {
            System.out.println("Las notas ingresades han sigut: ");
            for (int i = 0; i < notes.size(); i++) {
                System.out.println("Nota " + (i+1) + ": " + notes.get(i));
            }
        }
    }
}