import java.util.Scanner;
public class arreglos {
    public static void main(String [] args){

        int vector[] = new int[3];
        Scanner sca = new Scanner(System.in);

        for(int i = 0; i < 3; i++){
            System.out.print("ingrese numeros: ");
            vector[i] = sca.nextInt();
        }
        for(int i = 0; i < 3; i ++){
            System.out.println("indice " + i + ": " + vector[i]);
        }
    }
}    