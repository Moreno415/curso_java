import java.util.Scanner;
public class tarea {
    //realizar un programa en el que el usuario ingrese las 3 notas de 1 alumno
    public static void main(String[]args){
        int notas[] = new int [3];
        Scanner sca = new Scanner(System.in);
        int prom = 0;

        System.out.println("**calcular el promedio de las notas de un alumno**");
        for(int i = 0; i < notas.length; i ++){
            System.out.print("ingrese nota " + (i+1) + ": ");
            notas[i]= sca.nextInt();
            System.out.println("\n");
            while(notas[i]>10 || notas[i]<1){
                
                if(notas[i]<0){
                    System.out.println("TAMPOCO ES LA BOLUDES");

                }else{
                    System.out.println("re chupamedias el alumno jaja");

                }
                
                System.out.print("intenta de nuevo: ");
                notas[i]= sca.nextInt();
                System.out.println("\n");
                
            }
            prom = notas[i] + prom;
        }
        System.out.println("el promedio del alumno es: " + ((double)prom/3));

        
        
        

    }
}
