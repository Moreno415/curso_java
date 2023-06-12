public class colores_texto {
    public static void main(String[] args){

        //con \0 se indica que el texto va a tener un formato de color
        System.out.println("\033[30m negro      \033[90m negro claro");
        System.out.println("\033[31m rojo       \033[91m rojo claro");
        System.out.println("\033[32m verde      \033[92m verde claro");
        System.out.println("\033[33m amarillo   \033[93m amarillo claro");
        System.out.println("\033[34m azul       \033[94m azul claro");
        System.out.println("\033[35m magenta    \033[95m magenta claro");
        System.out.println("\033[36m cyan       \033[96m cyan claro");
        System.out.println("\033[37m blanco     \033[97m blanco claro");
    }
}
