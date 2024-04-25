import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        String fraseAleatoria = "Los errores del pasado son la sabiduría del presente";
        char letraBuscada = 'e';
        int contador = 0;

ArrayList<Integer> posicionEncontrada = new ArrayList<>();

        for(int i = 0; i < fraseAleatoria.length(); i++){
            char caracter = fraseAleatoria.charAt(i);
            if (caracter == letraBuscada) {
                contador++;
                posicionEncontrada.add(i);

            }
        }

        if (contador > 0) {
            System.out.println("la letra '" + letraBuscada + "' está " + contador + " veces en la frase");
            System.out.println("Está en las posiciones: ");
            for (int posicion : posicionEncontrada) {
                System.out.println(posicion + " ");
            }
            System.out.println();
        } else {
            System.out.println("la letra ': " + letraBuscada + "' no aparece");
        }
    }
}
