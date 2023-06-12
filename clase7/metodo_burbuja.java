public class metodo_burbuja {
    public static void main(String[] args) {
        int[] arreglo = { -2, 45, 0, 11, -9 };
        int tamaño = arreglo.length;
        int aux;
        for (int i = 0; i < tamaño; i++) {
            System.out.print(arreglo[i]);
        }

        for (int i = 0; i < tamaño - 1; i++) {
            for (int j = 0; j < tamaño - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    aux = arreglo [j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }
        }
        for (int i = 0; i < tamaño; i++) {
            System.out.print(arreglo[i]);
        }
    }
}