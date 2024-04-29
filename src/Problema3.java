// Cuál es el factor primo más grande del número 600851475143

public class Problema3 {
    public static void main(String[] args) {
        // double n = 600851475143.0;

        double n = 600_851_475_143.0;
        double factor = 0;
        boolean bandera;

        for (double i = 1; i <= n; i++) {
            bandera = true;
            if (n % i == 0) {
                System.out.println("Factor encontrado: " + i);
                for (double j = 2; j < i; j++) {
                    if (i % j == 0) {
                        bandera = false;
                    }
                }
                if (bandera) {
                    System.out.println("Factor primo encontrado: " + i);
                    factor = i;
                }
            }
        }
        System.out.println("Factor primo mas grande: " + factor);
    }
}
