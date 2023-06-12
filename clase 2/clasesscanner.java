import java.util.Scanner;

public class clasesscanner {
    public static void main(String [] args){
        Scanner sa = new Scanner (System.in);
        String palabra ;
        int num;

        System.out.print("ingrese palabra: ");
        palabra = sa.next();
        System.out.println("su palabra es: "+palabra);

        System.out.print("ingrese su numero: ");
        num = sa.nextInt();
        System.out.println("el numero ingresado es: " + num );

        System.out.print("ingrese su nombre y edad separados por un enter:\n");
        palabra = sa.next();
        num =sa.nextInt();
        System.out.print("el alumno: " + palabra + " y la edad es: " + num);
    }
}
