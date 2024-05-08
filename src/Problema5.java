// 2520 es el número más pequeño que se puede dividir por cada uno de los números de 1 a 10 sin ningún resto. Cuál es el número positivo más pequeño que es divisible uniformemente por todos los números de 1 a 20?

// Solucion:
// Puedo arrancar a buscar desde el 20 e incrementar de 20 en 20, ya que el número que busco tiene que ser divisible por 20.
// Luego, me basta con verificar si el numero es divisible po los numero del 11 al 19, ya que si es divisible por esos numero, tambien lo sera por los numeros del 1 al 9, el 20 no hace falta verificarlo ya que ya lo hice al arrancar a buscar desde el 20.

public class Problema5 {

    public static void main(String[] args) {
        int numero = 20;
        boolean encuentra = false;

        while (!encuentra) {
            boolean esDivisible = true;
            
            for (int i = 11; i <= 19; i++) {
                if (numero % i != 0) {
                    esDivisible = false;
                    break;
                }
            }
            
            if (esDivisible) {
                encuentra = true;
            } else {
                numero += 20;
            }
        }
        System.out.println("Numero positivo mas pequeñoo: " + numero);
    }   
}