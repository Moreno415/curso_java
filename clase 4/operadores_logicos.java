import java.util.Scanner;
public class operadores_logicos {
    public static void main(String [] args){    

        Scanner sca = new Scanner(System.in);
        int num1;
        int num2;
        System.out.print("ingrese un numero: ");
        num1 = sca.nextInt();
        //operador logico and
        if(num1 > 39 && num1 <54){
            System.out.println("el primer numero se encuentra entre 39 y 54");
        }
        else{
            System.out.println("el primer numero esta fuera de rango");
        }
        //operador logico or
        System.out.print("ingrese un numero: ");
        num1 = sca.nextInt();
        System.out.print("ingrese otro numero: ");
        num2 = sca.nextInt();
        if((num1 > 39 && num1 < 54) || (num2 > 39 && num2 < 59 )){
            System.out.print("uno o ambos numeros estan dentro del rango");
        }
        else{
            System.out.print("ninguno de los numeros esta en el rango");
        }
    }
}
