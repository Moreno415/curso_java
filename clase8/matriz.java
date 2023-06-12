public class matriz {
    public static void main(String []args){
        int carlitos = 3;
        int [][] matriz_Null = new int [carlitos][carlitos];
        int [][] matriz_No_Null = {{1,2,3},{4,5,6},{7,8,9}};
        

        for(int i = 0; i < carlitos; i++){
            for(int j = 0; j < carlitos; j++){
                matriz_Null [i] [j] = (int)(Math.random()*100);

            }
        }
        
        for(int j = 0; j < carlitos; j++){
            for(int i = 0; i < carlitos; i++){
                System.out.println(matriz_Null [j] [i] + " ");
    
            }
            System.out.println(" ");
        }
        for(int j = 0; j < carlitos; j++){
            System.out.println(matriz_No_Null [j] [0] + " " + matriz_No_Null [j] [1] + " " + matriz_No_Null [j] [2]);

        }
        
    }
}