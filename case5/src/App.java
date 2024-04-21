import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * 5- Se pide un texto. Decir si está compuesto solo de minúsculas,
         *  solo de mayúsculas o si combina mayúsculas y minúsculas.
         */

        Scanner teclado = new Scanner(System.in);     
        System.out.print ("Ingresa un texto: ");     
        String texto = teclado.nextLine();
            if(texto.toUpperCase().equals(texto)){         
                    System.out.println("Tu texto está compuesto solo de mayúsculas");             
            } else if (texto.toLowerCase().equals(texto)){                  
                System.out.println("Tu texto está compuesto solo de minusculas");             
            } else {System.out.println("Tu texto combina mayúsculas y minúsculas.");}


    


    }
}
