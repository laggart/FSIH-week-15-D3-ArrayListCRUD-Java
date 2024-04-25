import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class fiesta_casa {
    public static void main(String[] args) throws Exception {
// creamos la lista inicial de invitados
ArrayList<String> invitados = new ArrayList<String>(Arrays.asList("Michael", "David", "Juan", "Rifi", "Albert", "Brunno", "Victor", "Ferdi", "Sergio", "Laia", "Herman", "Walid", "Francisco"));
        
        System.out.println(invitados);
        // Michael está de viaje

        invitados.remove("Michael");
        System.out.println(invitados);
        
        // Llama pepi y silvestre y se apuntan
        
        invitados.add("Pepi");
        invitados.add("Silvestre");
        System.out.println(invitados);
        
        // Eva se cuela la tercera (indice 2)
        
        invitados.add(2, "Eva");
        System.out.println(invitados);

 ArrayList <String> otraFiesta = new ArrayList<String>(Arrays.asList("Hugo", "Lucía", "Martina", "Julia", "Sofía", "Valeria", "Paula", "Emma", "Daniela", "Carla"));       

ArrayList <String> fiestaFinal = new ArrayList<>();
        fiestaFinal.addAll(invitados);
        fiestaFinal.addAll(otraFiesta);

        System.out.println("La fiesta se ha puesto muy buena y terminan estando: ");
        System.out.println(fiestaFinal);

        Collections.sort(fiestaFinal);
        System.out.println("En Orden alfabético los participantes de la fiesta son: ");
        System.out.println(fiestaFinal);

        System.out.println("El ultimo de la lista es:");
        System.out.println(fiestaFinal.get(fiestaFinal.size() - 1));

        if(fiestaFinal.contains("Pedro")){
            System.out.println("Pedro está");
        } else {System.out.println("Donde esta Pedro?");}
         
    }
}
