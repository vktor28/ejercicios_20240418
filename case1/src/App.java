import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //1- El usuario tiene que acertar un número del 1 al 5,
        //generado aleatoriamente. Le vas preguntando hasta que acierte.
        Scanner teclado = new Scanner(System.in);
        int numeroCorrecto=(int)(Math.random()*2);
        int intentos=0;
        //System.out.println(numeroCorrecto);
        while (numeroCorrecto==0) {numeroCorrecto=(int)(Math.random()*6);
            //System.out.println(numeroCorrecto);}
        System.out.println("Elige un número del 1-5");
        int numeroElegido = teclado.nextInt();  
        while (numeroCorrecto!=numeroElegido) {
            intentos++;
            System.out.println("Fallastem vuelve a probar un número del 1-5.");
            numeroElegido = teclado.nextInt(); 

    }
    intentos++;
    System.out.println("Has acertado. Has necesitado "+intentos+" intentos.");


    }
}
}