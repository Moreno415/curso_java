import java.util.Scanner;
public class forj {
    public static void main(String [] args){
        int numeros;
        int contar = 0;
        Scanner sca = new Scanner(System.in);

        System.out.println("ingrese 5 numeros");

        for(int i = 0; i < 5; i++){
            System.out.print("numero " + (i+1) + ": " );
            numeros = sca.nextInt();
            if (numeros%2==0){
                contar ++;
            }
        }
        System.out.println("la cantidad de numeros pares es: " + contar);
    }
}
