import java.util.Scanner;

public class ejemplo_String_clave {
    
    public static void main(String [] args){

        String clave = "laclave";
        String clave_ingresada;
        Scanner sca = new Scanner(System.in);

        System.out.print("ingrese su clave: ");
        clave_ingresada = sca.next();
        /*forma correcta de comparar strings*/
        if(clave.equals(clave_ingresada)){
            System.out.print("a logrado ingresar");
        }

    }
}
