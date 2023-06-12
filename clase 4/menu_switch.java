import java.util.Scanner;
public class menu_switch {
    public static void main(String[]args){
        int op;
        float num1;
        float num2;
        Scanner sca = new Scanner(System.in);
        
        
        System.out.println("1.suma");
        System.out.println("2.resta");
        System.out.println("3.division");
        System.out.println("4.multiplicacion");
        
        System.out.print("elija el numero de la opcion: ");
        op = sca.nextInt();
        
        switch(op){
            case 1:
                System.out.print("\nelija el primer numero: ");
                num1 = sca.nextInt();
        
                System.out.print("elija el segundo numero: ");
                num2 = sca.nextInt();
        
                System.out.printf("\nel resultado de la suma es: %.0f", (num1 + num2));
                break;    
            case 2:
                System.out.print("\nelija el primer numero: ");
                num1 = sca.nextInt();
        
                System.out.print("elija el segundo numero: ");
                num2 = sca.nextInt();
        
                System.out.printf("\nel resultado de la resta es: %.0f",(num1 - num2));
                break;
            case 3:
                System.out.print("\nelija el primer numero: ");
                num1 = sca.nextInt();
        
                System.out.print("elija el segundo numero: ");
                num2 = sca.nextInt();
        
                System.out.printf("\nel resultado de la division es: %.2f",(num1 / num2));
                break;
            case 4:
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
