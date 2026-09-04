import java.util.Scanner;

public class Programa_aprobados_y_reprobados_LLM {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int aprobados = 0;
        int reprobados = 0;
        int contador = 1;
        int resultado;

        // El ciclo se repite exactamente 10 veces para las 10 calificaciones
        while (contador <= 10) {
            System.out.print("Ingresa el resultado (1 = aprobó, 2 = reprobó): ");
            resultado = entrada.nextInt();

            if (resultado == 1) {
                aprobados++;
            } else if (resultado == 2) {
                reprobados++;
            }
            
            contador++;
        }

        // Imprime el total de aprobados y reprobados como en la imagen
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Reprobados: " + reprobados);

        // Condición para la bonificación del profesor
        if (aprobados >= 9) {
            System.out.println("¡Bono para el profesor!");
        }

        entrada.close();
    }
}