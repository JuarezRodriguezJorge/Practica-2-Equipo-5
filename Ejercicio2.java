import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        // Scanner para leer los números que ingrese el usuario
        Scanner teclado = new Scanner(System.in);

        // Variables que pide el ejercicio
        int contador = 0;
        int numero;
        int mayor = 0;

        // Se repite hasta que el usuario haya ingresado 10 números
        while (contador < 10) {

            // Pedimos un número
            System.out.print("Ingresa un numero: ");
            numero = teclado.nextInt();

            // Convertimos el número a valor absoluto
            // Ejemplo: -8 se convierte en 8
            numero = Math.abs(numero);

            // Comparamos el número con el mayor encontrado hasta ahora
            if (numero > mayor) {

                // Si es mayor, actualizamos la variable mayor
                mayor = numero;
            }

            // Aumentamos el contador para avanzar al siguiente número
            contador++;
        }

        // Esto se ejecuta solamente después de revisar los 10 números
        System.out.println("El numero mayor es: " + mayor);

        teclado.close();
    }
}