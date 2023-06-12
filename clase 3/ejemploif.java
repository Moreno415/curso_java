import java.util.Scanner;

public class ejemploif{
    public static void main (String [] args){
        int num1;
        int num2;
        boolean flag=false;
        Scanner sa = new Scanner (System.in);
        System.out.print("ingrese el numero 1: ");
        num1 = sa.nextInt();
        System.out.print("ingrese el numero 2: ");
        num2 = sa.nextInt();
        if(num1 > num2){
            flag=true;
            System.out.print("el primer numero es mayor al segundo");
        }
        else if(num1 < num2){
            System.out.print("el primer numero es menor al segundo");
        }
        else{
            System.out.print("ambos numeros son iguales");
        }

    }

}