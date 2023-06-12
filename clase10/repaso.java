import java.util.Scanner;
public class repaso{
    public static void main(String[]args){
        int op;
        Scanner sca = new Scanner(System.in);
        System.out.println("ingrese una opcion");
        System.out.println("1:opcion 1");
        System.out.println("2:opcion 2");
        System.out.println("3:opcion 3");
        System.out.println("4:opcion 4");

        System.out.print("ingrese una opcion: ");
        op= sca.nextInt();
        switch(op){
            case 1:
                System.out.print("opcion 1");
                break;
            case 2:
                System.out.print("opcion 2");
                break;
            case 3:
                System.out.print("opcion 3");
                break;
            case 4:
                System.out.print("opcion 4");
                break;
            default:
                System.out.print("opcion no valida");
                break;
        }

    }
}