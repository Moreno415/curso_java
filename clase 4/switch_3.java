public class switch_3 {
    public static void main(String[] args){
        String nombre;

        System.out.print("ingrese el nombre: ");
        nombre = System.console().readLine();

        switch(nombre){
            case "carlitos":
                System.out.printf("hola %s",nombre);
                break;
                case "jose":
                System.out.printf("hola %s",nombre);
                break;
                case "miguel":
                System.out.printf("hola %s",nombre);
                break;
                case "emiliano":
                System.out.printf("hola %s",nombre);
                break;
                default:
                System.out.print("lindo nombre");
        }

    
    }
}
