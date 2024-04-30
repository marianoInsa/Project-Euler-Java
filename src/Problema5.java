// 2520 es el número más pequeño que se puede dividir por cada uno de los números de 1 a 10 sin ningún resto. Cuál es el número positivo más pequeño que es divisible uniformemente por todos los números de 1 a 20?

public class Problema5 {

    public static void main(String[] args) {
        int numero = 19;
        int cont;
        boolean noEncuentra = true;
        while (noEncuentra) {
            cont = 0;
            numero++;
            
            for (int i = 1; i <= 20; i++) {
                if (numero % i == 0) {
                    cont++;
                }
            }
    
            if (cont == 20) {
                noEncuentra = false;
            }
        }
        System.out.println("Numero positivo mas pequeño: " + numero);
    }   
}