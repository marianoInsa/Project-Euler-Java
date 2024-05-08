// Cuál es el factor primo más grande del número 600851475143

public class Problema3 {
    public static void main(String[] args) {
        // double n = 600851475143.0;

        double n = 600_851_475_143.0;
        double factor = 0;

        for (double i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                boolean esPrimo = true;
                System.out.println("Factor encontrado: " + i);
                for (double j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        esPrimo = false;
                        break;
                    }
                }
                if (esPrimo) {
                    System.out.println("Factor primo encontrado: " + i);
                    factor = i;
                }
            }
        }
        System.out.println("Factor primo mas grande: " + factor);
    }
}
