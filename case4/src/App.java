import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /* 4- Pides un numero de telefono y le quitas, si hay,
        los espacios, los guiones y los puntos:  456-453-78
        quedaria como 45645378 */
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuá es tu número de teléfono?");
        String telefono = teclado.nextLine();
        telefono=telefono.replace("-", "");
        telefono=telefono.replace(" ", "");
        telefono=telefono.replace(".", "");
        System.out.println("Tu número es: "+telefono);
    }
}
