/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.practico;

/**
 *
 * @author DELL
 */
public class Cafe {
    String tamano;
    String agregado;
    int precio;
    int costoAgregado;

    public Cafe(String tamano, String agregado) {
        this.tamano = tamano;
        this.agregado = agregado;

        switch (tamano.toLowerCase()) {
            case "1":
                this.precio = 45;
                break;
            case "2":
                this.precio = 56;
                break;
            case "3":
                this.precio = 65;
                break;
            default:
                this.precio = 0;
        }

        switch (agregado.toLowerCase()) {
            case "1":
                this.costoAgregado = 5;
                break;
            case "2":
                this.costoAgregado = 8;
                break;
            case "3":
                this.costoAgregado = 0;
                break;
            default:
                this.costoAgregado = 0;
        }
    }

    public int obtenerCostoTotal() {
        return this.precio + this.costoAgregado;
    }
}
