import java.util.Scanner;
public class nuevaTarea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int edad, estadoCivil, sexo, contadorPersonasCumplen = 0;
        double estatura, acumuladorEdad = 0, acumuladorEstatura = 0;
        double promedioEdad = 0, promedioEstatura = 0, porcentajeCumplen;

        for (int numeroPersona = 1; numeroPersona <= 3; numeroPersona++) {
            System.out.print("Ingrese la edad de la persona número " + numeroPersona + ": ");
            edad = scanner.nextInt();

            System.out.print("Ingrese el estado civil de la persona (1. Soltero, 2. Casado): ");
            estadoCivil = scanner.nextInt();

            System.out.print("Ingrese la estatura en cm de la persona número " + numeroPersona + ": ");
            estatura = scanner.nextDouble();

            System.out.print("Ingrese el sexo de la persona (1. Hombre, 2. Mujer): ");
            sexo = scanner.nextInt();

            if (edad >= 18 && estadoCivil == 1 && estatura > 170 && sexo == 1) {
                contadorPersonasCumplen++;
                acumuladorEdad += edad;
                acumuladorEstatura += estatura;
            }
        }
        if (contadorPersonasCumplen > 0) {
            promedioEdad = acumuladorEdad / contadorPersonasCumplen;
            promedioEstatura = acumuladorEstatura / contadorPersonasCumplen;
        }

        porcentajeCumplen = (contadorPersonasCumplen / 3.0) * 100;

        System.out.println("El porcentaje de personas que cumplen la condición es: " + porcentajeCumplen + "%");
        if (contadorPersonasCumplen > 0) {
            System.out.println("El promedio de edad de las personas que cumplen la condición es: " + promedioEdad);
            System.out.println("El promedio de estatura de las personas que cumplen la condición es: " + promedioEstatura + " cm");
        } else {
            System.out.println("Ninguna persona cumplió con las condiciones.");
        }

        scanner.close();
    }
}
