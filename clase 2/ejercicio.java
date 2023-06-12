public class ejercicio {
    public static void main(String [] args){
        String nombre;
        String apellido;
        System.out.print("\033[91mingrese el nombre: ");
        nombre = System.console().readLine();
        System.out.print("\033[94mingrese el apellido: ");
        apellido = System.console().readLine();

        System.out.printf("\033[92mEl nombre completo es: \033[91m%s \033[94m%s" , nombre,apellido);
    }
}
