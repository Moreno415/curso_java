public class ejercicio2 {
    public static void main(String [] args){

        int Num1;
        int Num2;
        System.out.print("ingrese el primer numero: ");
        Num1 = Integer.parseInt(System.console().readLine());
        System.out.print("ingrese el segundo numero numero: ");
        Num2 = Integer.parseInt(System.console().readLine());

        System.out.printf("suma %d \n" ,(Num1 + Num2));
        System.out.printf("resta %d \n" ,(Num1 - Num2));
        System.out.printf("multiplicacion %d \n" ,(Num1 * Num2));
        System.out.printf("division %d \n" ,(Num1 / Num2));
        System.out.printf("modulo %d \n" ,(Num1 % Num2));

    }
}
