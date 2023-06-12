import java.util.Scanner;
public class meses_if {
    public static void main(String [] args){
        int num_mes;
        Scanner sca = new Scanner(System.in);

        System.out.print("ingrese el numero del mes: ");
        num_mes =  sca.nextInt();

        switch(num_mes){
            case 1:
                System.out.print("hola");
                break;
            case 2:
                System.out.print("hola2");
                break;
            case 3:
                System.out.print("hola3");
                break;
            case 4:
                System.out.print("hola4");
                break;
            case 5:
                System.out.print("hola5");
                break;
            case 6:
                System.out.print("hola6");
                break;
            case 7:
                System.out.print("hola7");
                break;
            case 8:
                System.out.print("hola8");
                break;
            case 9:
                System.out.print("hola9");
                break;
            case 10:
                System.out.print("hola10");
                break;    
            case 11:
                System.out.print("hola11");
                break;
            case 12:
                System.out.print("hola12");
                break;
            default:
                System.out.print("no es un numero admitido");
        }
            
 

    }
}
