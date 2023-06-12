public class funcion_rand {
    public static void main(String []args){
        //System.out.print((int)(Math.random()*11)+50);
        int [] carlitos = new int[10];
        for(int i = 0; i < 10; i ++){
            carlitos [i] = (int)(Math.random()*10);
        }
        for(int i = 0; i < 10; i ++){
        System.out.println(carlitos[i]);
        }
    }

}
