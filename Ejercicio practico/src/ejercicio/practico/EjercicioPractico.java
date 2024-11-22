/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.practico;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class EjercicioPractico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Factura factura = new Factura();

        while (true) {
            System.out.print("----MENU----"
                    + "\n1.Cafe Pequeno "
                    + "\n2.Cafe Mediano "
                    + "\n3.Cafe Grande "
                    + "\nIngrese la compra('x' para salir): ");
            String tamano = scanner.nextLine().toLowerCase();
            if (tamano.equals("x")) {
                break;
            }

            System.out.print("---EXTRA---"
                    + "\n1.Leche "
                    + "\n2.Cremora "
                    + "\n3.Sencillo "
                    + "\nIngrese el agregado ('x' para salir)");
            String agregado = scanner.nextLine().toLowerCase();
            
            if (agregado.equals("x")) { 
                System.out.println("Operación cancelada."); continue; 
            }

            System.out.print("El cliente es mayor de edad? (s/n): ");
            String esMayorDeEdad = scanner.nextLine().toLowerCase();
            boolean mayorEdad = esMayorDeEdad.equals("s");

            Cafe cafe = new Cafe(tamano, agregado);
            factura.agregarVenta(cafe, mayorEdad);
        }

        factura.mostrarResumen();
        scanner.close();
    }
}
