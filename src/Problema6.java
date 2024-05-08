// Diferencia entre la suma de los cuadrados de los primeros 100 numeros naturales y el cuadrado de la suma de los mismos

public class Problema6 {

    public static void main(String[] args) {
        int n = 100;
        // Formula de Faulhaber para la suma de los cuadrados de los primeros n numeros naturales
        int sumaCuadrados = (n * (n + 1) * (2 * n + 1)) / 6;

        // Formula de Gauss para el cuadrado de la suma de los primeros n numeros naturales
        // Math.pow() devuelve en un double el cuadrado del primer parametro, por eso se castea a int
        int cuadradoDeLaSuma = (int) Math.pow((n * (n + 1)) / 2, 2);

        System.out.println("Diferencia: " + (cuadradoDeLaSuma - sumaCuadrados));
    }

}
