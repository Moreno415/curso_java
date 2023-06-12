import java.util.Scanner;
 class repaso_practica {
    public static void main(String[]args){

        int numero;
        Scanner sca = new Scanner(System.in);
        System.out.print("ingrese un numero: ");
        numero = sca.nextInt();
        System.out.println("El numero mas 100: " + (numero + 100));
        System.out.println("el numero menos 80: " + (numero -80));
        System.out.println("el numero dividido 5: " + (numero / 5));
    }
}
