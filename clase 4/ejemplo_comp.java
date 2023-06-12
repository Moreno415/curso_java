public class ejemplo_comp{
    public static void main(String [] args){
        String palabra1 = "hola";
        String palabra2 = "hola";
        String palabra3 = new String("hola");


        System.out.println(palabra1==palabra2);
        System.out.println(palabra1!=palabra2);
        System.out.println(palabra3==palabra2);
    }
}