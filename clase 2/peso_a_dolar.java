import java.util.Scanner;
public class peso_a_dolar{
    public static void main (String [] args){
        float peso;
        Scanner articulador = new Scanner (System.in);
        System.out.print("ingrese la cantidad de pesos: ");
        peso = articulador.nextFloat();
        System.out.printf("con esa cantidad de pesos compras: %.2f dolares" ,(peso/470));

    }
}