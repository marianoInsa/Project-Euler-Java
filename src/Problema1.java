// Encontrar la suma de los multiplos de 3 o 5 abajo de 1000

public class Problema1 {

    public static void main(String[] args) {
        
        int suma = 0;
        for (int i = 1; i < 1000; i++) {
            if ((i % 3 == 0) || (i % 5 == 0)) {
                suma += i;
            }
        }
        System.out.println(suma);

    }
}