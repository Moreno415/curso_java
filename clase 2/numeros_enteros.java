import java.util.Scanner;
public class numeros_enteros{
    public static void main(String [] args){
    float numero1;
    float numero2;
    float numero3;
    Scanner car = new Scanner (System.in);
    System.out.print("ingrese el numero separado por ' '");
    numero1 = car.nextFloat();
    numero2 = car.nextFloat();
    numero3 = car.nextFloat();

    System.out.print((numero1+numero2+numero3)/3);
    }
}