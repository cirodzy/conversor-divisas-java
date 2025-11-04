import java.util.Scanner;

public class ConversionesUnidades {

    // Método para convertir millas a kilómetros
    public static double millasAKilometros(double millas) {
        return millas * 1.60934;  // 1 milla = 1.60934 kilómetros
    }

    // Método para convertir libras a kilogramos
    public static double librasAKilogramos(double libras) {
        return libras * 0.453592;  // 1 libra = 0.453592 kilogramos
    }

    // Método para convertir grados Fahrenheit a Celsius
    public static double fahrenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;  // Fórmula para convertir Fahrenheit a Celsius
    }

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Menú de opciones
        System.out.println("Seleccione una conversión:");
        System.out.println("1. Millas a Kilómetros");
        System.out.println("2. Libras a Kilogramos");
        System.out.println("3. Fahrenheit a Celsius");
        System.out.print("Ingrese el número de la conversión: ");
        int opcion = scanner.nextInt();

        double resultado = 0;

        // Realizar la conversión según la opción elegida
        switch (opcion) {
            case 1: // Millas a Kilómetros
                System.out.print("Ingrese el número de millas: ");
                double millas = scanner.nextDouble();
                resultado = millasAKilometros(millas);  // Llamar al método para convertir millas a kilómetros
                break;

            case 2: // Libras a Kilogramos
                System.out.print("Ingrese el número de libras: ");
                double libras = scanner.nextDouble();
                resultado = librasAKilogramos(libras);  // Llamar al método para convertir libras a kilogramos
                break;

            case 3: // Fahrenheit a Celsius
                System.out.print("Ingrese la temperatura en grados Fahrenheit: ");
                double fahrenheit = scanner.nextDouble();
                resultado = fahrenheitACelsius(fahrenheit);  // Llamar al método para convertir Fahrenheit a Celsius
                break;

            default:
                System.out.println("Opción no válida.");
                return;
        }

        // Imprimir el resultado de la conversión
        System.out.println("El resultado de la conversión es: " + resultado);

        // Cerrar el scanner
        scanner.close();
    }
}
