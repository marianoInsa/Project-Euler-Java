// Al considerar los términos en la secuencia de Fibonacci cuyos valores no superan los cuatro millones, encuentre la suma de los términos de valor par.

public class Problema2 {
    public static void main(String[] args) throws Exception {
        
        int array[] = {0, 1};
        // array = new int[1];
        int suma = 0;
        int aux = 0;
        while (aux < 4000000) {
            aux = array[0] + array[1];
            array[0] = array[1];
            array[1] = aux;

            if (aux % 2 == 0) {
                suma += aux;
            }
            System.out.println("Fibo: " + aux);
        }
        System.out.println("Suma de los terminos pares: " + suma);
    }
}
