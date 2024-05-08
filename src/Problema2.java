// Al considerar los términos en la secuencia de Fibonacci cuyos valores no superan los cuatro millones, encuentre la suma de los términos de valor par.

// Hay que aprovechar el patrón en la secuencia de Fibonacci: cada tercer número es par.

public class Problema2 {
    public static void main(String[] args) {
        
        int a = 1;
        int b = 1;
        int c = a + b;
        int suma = 0;
        
        while (c < 4000000) {
            suma += c;
            a = b + c;
            b = c + a;
            c = a + b;
        }
        System.out.println("Suma de los terminos pares: " + suma);
    }
}
