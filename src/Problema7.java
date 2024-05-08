// Encontrar el 10001 numero primo

// Euclid's sieve algorithm to find prime numbers

public class Problema7 {
    public static void main(String[] args) {
        int n = 10001;
        int primo = encontrarPrimo(n);
        System.out.println("El 10001 numero primo es: " + primo);
    }

    private static int encontrarPrimo(int n) {
        int primo = 0;
        int cont = 2;
        int i = 1;

        while (i <= n) {   
            boolean esPrimo = true;
            for (int j = 2; j <= Math.sqrt(cont); j++) {
                if (cont % j == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                primo = cont;
                i++;
            }
            cont++;
        }
        return primo;
    }
}
