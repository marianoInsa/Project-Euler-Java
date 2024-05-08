// Encontrar la suma de los multiplos de 3 o 5 abajo de 1000

// Utilizando la fórmula de la suma de una serie aritmética para encontrar la suma de todos los múltiplos de un número dado en un rango

public class Problema1 {

    private static int sumaMultiplos(int n, int limite) {
        int p = limite / n;
        return n * (p * (p + 1)) / 2;
    }

    public static void main(String[] args) {
        
        int limite = 1000 - 1;
        int suma = sumaMultiplos(3, limite) + sumaMultiplos(5, limite) - sumaMultiplos(15, limite);
        System.out.println("La suma de los múltiplos de 3 o 5 abajo de 1000 es: " + suma);

    }
}