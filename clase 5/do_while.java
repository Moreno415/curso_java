import java.util.Scanner;
public class do_while {
    public static void main(String [] args){
        boolean flag = true;
        int numero = 0;
        int acumulador = 0;
        Scanner sca = new Scanner(System.in);

        do{
            System.out.print("ingrese un numero: ");
            numero = sca.nextInt();
            acumulador = acumulador + numero;
            System.out.println("si desea salir ingrese un ´-1´");
            if(sca.nextInt() == -1){
                System.out.println(acumulador);
                flag = false;
            }

        }while(flag);
    }
}
