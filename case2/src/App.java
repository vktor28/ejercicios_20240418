import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //2- Tienes un color preseleccionado, por ejemplo el rojo,
        //y le preguntas al usuario un color a ver si lo acierta
        //(solo le preguntas una vez)
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuál es mi color preferido?");
        String colorPreferido = "Rojo";
        String color = teclado.nextLine();
        if(colorPreferido.equalsIgnoreCase(color))
        {System.out.println("Has acertado");}
        else {System.out.println("Has fallado...");}
        teclado.close();

    }
}
