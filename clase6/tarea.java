import java.util.Scanner;

public class tarea {
    public static void main(String[] args) {
        // un grupo de cientificos esta realizando un estudio del clima en bariloche rio
        // negro durante el año 2020.
        // se sabe que la temperatura promedio en esta ciudad es de 8.1grados
        // centigragos y la humedad promedio es del 72%, ambas variables analizadas
        // con informacion de años anteriores.
        // los cientificos le piden que realize un programa que le premita el ingreso de
        // la temperatura promedio y
        // humedad promedio de cada mes y luego devuelva la siguiente informacion:
        // 1.temperatura promedio del año
        // 2.indicar si la temperatura promedio durante el año fue distinta a los
        // registros historicos. Es decir indicar si fue mayor o menor al promedio
        // historico e indicar por cuantos grados
        // 3.indicar el promedio de humedad en el mes mas seco
        // 4.indicar el promedio de temperatura en el mes mas caluroso
        // 5.humedad promedio del año
        double temperatura = 8.1;
        int humedad = 72;
        int carlitos = 3;
        double temperaturas[] = new double[carlitos];
        int humedades[] = new int[carlitos];
        Scanner sca = new Scanner(System.in);
        int t_Humedad = 0;
        double t_Temperatura = 0;
        int prom_humedad = 0;
        double prom_Temperaturas = 0;
        double aux = 0;
        int auxi = 0;

        for (int i = 0; i < carlitos; i++) {
            System.out.printf("ingrese la temperatura del mes %d: ", (i + 1));
            temperaturas[i] = sca.nextDouble();
            System.out.printf("ingrese la humedad del mes %d: ", (i + 1));
            humedades[i] = sca.nextInt();
            System.out.println("");
        }

        for (int i = 0; i < carlitos; i++) {
            t_Temperatura = t_Temperatura + temperaturas[i];
            t_Humedad = t_Humedad + humedades[i];
            
        }
        prom_humedad = t_Humedad/carlitos;
        prom_Temperaturas = t_Temperatura/carlitos;
        System.out.printf("la temperatura promedio es: %.2f\n",(prom_Temperaturas));
        System.out.printf("la humedad promedio es: %d \n",(prom_humedad));

        if (prom_humedad<humedad){
            System.out.println("la humedad anual es menor al promedio");
        }
        else{
            System.out.println("la humedad anual es mayor al promedio");
        }

        if (prom_Temperaturas<temperatura){
            System.out.println("la temperatura anual es menor al promedio");
        }
        else{
            System.out.println("la temperatura anual es mayor al promedio");
        }


        for(int i = 0; i < carlitos - 1; i++){
            for(int k = 0; k < carlitos - i -1; k++){
                if(temperaturas[k]>temperaturas[k+1]){
                    aux = temperaturas[k];
                    temperaturas[k] = temperaturas[k+1];
                    temperaturas[k+1] = aux;

                }
                
                if(humedades[k]>humedades[k+1]){
                    auxi = humedades[k];
                    humedades[k] = humedades[k+1];
                    humedades[k+1] = auxi;

                }
            }
        }

        
        System.out.printf("el mes mas caluros hubieron %.2f grados",temperaturas[1]);
        System.out.printf("el mes mas seco hubo %d %% de humedad",humedades[1]);
        
        

    }
}
