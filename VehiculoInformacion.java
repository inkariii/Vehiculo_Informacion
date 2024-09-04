import java.util.InputMismatchException;
import java.util.Scanner;

public class VehiculoInformacion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Inicializar el escáner para la entrada de datos

        // Solicitar el nombre del usuario
        System.out.print("Ingrese su nombre: ");
        String nombreUsuario = input.nextLine(); // Captura y almacena el nombre del usuario

         // Solicitar la edad del usuario
        System.out.print("Ingrese su edad: ");
        String edadUsuario = input.nextLine(); // Captura y almacena la edad del usuario

        // Recoger la marca del vehículo
        System.out.print("Marca del vehículo: ");
        String marcaVehiculo = input.nextLine(); // Captura y almacena la marca

        // Recoger el modelo del vehículo
        System.out.print("Modelo del vehículo: ");
        String modeloVehiculo = input.nextLine(); // Captura y almacena el modelo

        // Recoger la cilindrada del vehículo
        System.out.print("Cilindrada del vehículo: ");
        String cilindradaVehiculo = input.nextLine(); // Captura y almacena la cilindrada

        // Recoger el tipo de combustible del vehículo
        System.out.print("Tipo de combustible del vehículo: ");
        String combustibleVehiculo = input.nextLine(); // Captura y almacena el tipo de combustible

        // Recoger la capacidad en pasajeros
        System.out.print("Número de pasajeros que puede transportar: ");
        int pasajeros;
        try {
            pasajeros = input.nextInt(); // Captura y almacena la capacidad en pasajeros
            if (pasajeros <= 0) {
                System.out.println("El número de pasajeros debe ser un valor positivo.");
                return;
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Se esperaba un número entero para la capacidad en pasajeros.");
            return;
        }

        // Imprimir la información del vehículo y del usuario
        System.out.println("\nNombre del usuario: " + nombreUsuario);
        System.out.println("\Edad del usuario: " + edadUsuario);
        System.out.println("Marca del vehículo: " + marcaVehiculo);
        System.out.println("Modelo del vehículo: " + modeloVehiculo);
        System.out.println("Cilindrada del vehículo: " + cilindradaVehiculo);
        System.out.println("Tipo de combustible: " + combustibleVehiculo);
        System.out.println("Capacidad para " + pasajeros + " pasajeros.");

        input.close(); // Cerrar el escáner
    }
}
