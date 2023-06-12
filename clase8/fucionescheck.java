public class fucionescheck {

    static int Carlitos(int numero, int numero2){
        int carlo;
        carlo = numero  + numero2;
        return carlo;
    }
    public static  void main(String[]arg){
        int num = (int)(Math.random()*100);
        int num2 = (int)(Math.random()*100);


        System.out.printf("el numero es: %d\n",num);
        System.out.printf("el otro numero random es: %d\n",((Carlitos(num, num2) - num)));
        System.out.printf("la suma de los 2 numero es: %d",(Carlitos(num, num2)));     

    }
}
