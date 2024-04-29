// Un número palindrómico lee lo mismo en ambos sentidos. El mayor palíndromo hecho del producto de dos números de 2 dígitos son 9009 = 91 x 99. 
// Encuentra el palíndromo más grande hecho del producto de dos números de 3 dígitos.

public class Problema4 {

    public static void main(String[] args) {
        int numero;
        String cadena = "";
        String cadenaInvertida = "";

        for (int i = 999; i >= 990; i--) {
            for (int j = 999; j >= 900; j--) {
                numero = i * j;
                cadena = Integer.toString(numero);
                cadenaInvertida = "";
                for (int k = cadena.length() - 1; k >= 0; k--) {
                    cadenaInvertida += cadena.charAt(k);
                }
                
                if (cadena.equals(cadenaInvertida)) {
                    System.out.println(cadena);
                }
            }
        }
    }
}