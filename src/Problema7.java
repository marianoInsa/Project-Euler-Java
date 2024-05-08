// Encontrar el 10001 numero primo

// Euclid's sieve algorithm to find prime numbers

import java.util.TreeMap;

public class Problema7 {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int n = 10001;
        TreeMap<Integer, Integer> primos = encontrarPrimos(n);
        System.out.println("El 10001 numero primo es: " + primos.lastEntry().getValue());
    }

    @SuppressWarnings("rawtypes")
    private static TreeMap encontrarPrimos(int n) {
        TreeMap<Integer, Integer> primos = new TreeMap<>();
        primos.put(0, 2);
        int cont = 3;

        for (int i = 1; i < n; i++) {
            boolean encontro = true;
            while (encontro) {    
                boolean esPrimo = true;
                for (int j = 2; j <= Math.sqrt(cont); j++) {
                    if (cont % j == 0) {
                        esPrimo = false;
                        break;
                    }
                }
                if (esPrimo) {
                    primos.put(i, cont);
                    encontro = false;
                }
                cont++;
            }

        }
        return primos;
    }
}
