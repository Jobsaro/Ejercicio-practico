/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.practico;

/**
 *
 * @author DELL
 */
public class Factura {
    int totalClientes;
    int[] ventasPorTamano;
    double totalCaja;

    public Factura() {
        this.totalClientes = 0;
        this.ventasPorTamano = new int[3]; // 0: pequeño, 1: mediano, 2: grande
        this.totalCaja = 0;
    }

    public void agregarVenta(Cafe cafe, boolean mayorEdad) {
        this.totalClientes++;

        int costo = cafe.obtenerCostoTotal();
        if (mayorEdad) {
            costo *= 0.9; // Descuento del 10%
        }
        this.totalCaja += costo;

        switch (cafe.tamano.toLowerCase()) {
            case "1":
                this.ventasPorTamano[0]++;
                break;
            case "2":
                this.ventasPorTamano[1]++;
                break;
            case "3":
                this.ventasPorTamano[2]++;
                break;
        }
    }

    public void mostrarResumen() {
        System.out.println("Total clientes atendidos: " + this.totalClientes);
        System.out.println("Cafes vendidos por tamaño: ");
        System.out.println("  Pequeno: " + this.ventasPorTamano[0]);
        System.out.println("  Mediano: " + this.ventasPorTamano[1]);
        System.out.println("  Grande: " + this.ventasPorTamano[2]);
        System.out.println("Total en caja por ventas del dia: Lps. " + this.totalCaja);
    }
}
