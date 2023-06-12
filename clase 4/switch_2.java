import java.util.Scanner;
public class switch_2 {
    public static void main(String[]args){
        String op;
        float num1;
        float num2;
        Scanner sca = new Scanner(System.in);
        
        
        System.out.println("suma");
        System.out.println("resta");
        System.out.println("division");
        System.out.println("multiplicacion");
        
        System.out.print("elija el numero de la opcion: ");
        op = System.console().readLine();
        
        switch(op){
            case "suma":
                System.out.print("\nelija el primer numero: ");
                num1 = sca.nextInt();
        
                System.out.print("elija el segundo numero: ");
                num2 = sca.nextInt();
        
                System.out.printf("\nel resultado de la suma es: %.0f", (num1 + num2));
                break;    
            case "resta":
                System.out.print("\nelija el primer numero: ");
                num1 = sca.nextInt();
        
                System.out.print("elija el segundo numero: ");
                num2 = sca.nextInt();
        
                System.out.printf("\nel resultado de la resta es: %.0f",(num1 - num2));
                break;
            case "division":
                System.out.print("\nelija el primer numero: ");
                num1 = sca.nextInt();
        
                System.out.print("elija el segundo numero: ");
                num2 = sca.nextInt();
        
                System.out.printf("\nel resultado de la division es: %.2f",(num1 / num2));
                break;
            case "multiplicacion":
                System.out.print("\nelija el primer numero: ");
                num1 = sca.nextInt();
        
                System.out.print("elija el segundo numero: ");
                num2 = sca.nextInt();
        
                System.out.printf("\nel resultado de la   multiplicacion es: %.0f",(num1 * num2));
                break;
            default:
                System.out.print("\nopcion no valida");
            
        }
        System.out.print("\n ");

    }
}

