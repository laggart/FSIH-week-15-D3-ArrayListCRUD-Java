import java.util.ArrayList;
import java.util.Scanner;

public class numeros_enteros {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);
        System.out.println("De cuantos números quieres hacer tu lista?");

        int longitudArray = teclado.nextInt();

ArrayList<Integer> numerosUser = new ArrayList<>();

        System.out.println("Ingresa tus " + longitudArray + " números");
        for(int i=0; i < longitudArray; i++){
            int numero = teclado.nextInt();
            numerosUser.add(numero);
        }

        int suma = 0;
        for (int numero : numerosUser) {
            suma += numero;
        } 

        double media = (double) suma / numerosUser.size();

        System.out.println("La media de tus números es: " + media);

        teclado.close();

        //FYI Por si el e sirve a alguien para el 3er ejercicio, que yo no lo sabía: se ve que si escribes "e" es un String, y si lo escribes con las comillas simples 'e' es un character
    }
}
