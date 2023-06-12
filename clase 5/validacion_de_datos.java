import java.util.Scanner;
public class validacion_de_datos {
    public static void main(String [] args){
    
        Scanner sca = new Scanner(System.in);
        int vector[] = new int[3];
        int [] vector2 = {5,3,5,7};
        int i;

        for(i = 0; i < 3; i++){
            
            System.out.print("ingrese un numero entre 20 y 50: ");
            vector[i] = sca.nextInt();  

            while(vector[i]<20 || vector[i]>50){
                System.out.print("fuera de rango, intente otra vez: ");
                vector[i]=sca.nextInt();
            }

        }
        for(i = 0; i < 3; i++){
            System.out.println("numero "+ (i + 1) + ": " + vector[i]);
        }
        for(i = 0; i < 4;i ++){
            System.out.println(vector2[i]);
        }
        for (int carlitos : vector2) {
            System.out.println(carlitos);
        }
    }
}