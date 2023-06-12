public class ejemplo{

    public static void main (String [] args){
        String p1 = "hola";
        System.out.println(p1);
        String p2;
        p2 = System.console().readLine();
        System.out.print(p2);

        String num1char = "50";
        String num2char = "40";
        int num1 ;
        int num2 ;
        
        //parseint convierte una cadena de texto en un numero
        num1 = Integer.parseInt(num1char);
        num2 = Integer.parseInt(num2char);
        System.out.print(num1 + num2);
    }
}