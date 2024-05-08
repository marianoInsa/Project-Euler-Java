// Un número palindrómico lee lo mismo en ambos sentidos. El mayor palíndromo hecho del producto de dos números de 2 dígitos son 9009 = 91 x 99. 
// Encuentra el palíndromo más grande hecho del producto de dos números de 3 dígitos.

// Solución:
// Reduzco el rango a 900
// Recorrido en orden inverso para salir ante el primer palíndromo encontrado, que seguro sera el mayor
// Uso de StringBuilder para invertir el producto y comparar con el original, ya que este metodo es mas eficiente que el uso de un ciclo for para invertir el numero caracter a caracter

public class Problema4 {

    public static void main(String[] args) {

        int maximoPalindromo = 0;

        for (int i = 999; i >= 900; i--) {
            for (int j = 999; j >= 900; j--) {
                int producto = i * j;
                if (producto <= maximoPalindromo) {
                    break;
                }
                
                String productoString = Integer.toString(producto);
                String reversoProducto = new StringBuilder(productoString).reverse().toString();
                if (productoString.equals(reversoProducto)) {
                    maximoPalindromo = producto;
                }
            }
        }
        System.out.println("El palindromo más grande es: " + maximoPalindromo);
    }
}