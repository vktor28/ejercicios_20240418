import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //3- Se introduce una frase y se devuelve  el texto a
        // la inversa. Ejemplo: olpmejE
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una frase y te la devolveré a la inversa");
        String frase = teclado.nextLine();
        int longitud=frase.length();
        //System.out.println(longitud);

        for(int i=longitud-1; i>=0; i--){
            System.out.print(frase.charAt(i));
        }

    }
}
