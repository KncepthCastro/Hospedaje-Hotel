/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelhospedaje;

/**
 *
 * @author cass
 */
public class Procesos {

    public double calcularCostoBase(Datos d) {
        double noches = d.getNoches();
        double precio = d.getPrecioNoche();
        return noches * precio;
    }

    public double obtenerPorcentajeCargo(double costoBase) {
        if (costoBase <= 200) {
            return 0.08;
        }
        return 0.06;
    }

    public double calcularCargoServicio(double costoBase) {
        return costoBase * obtenerPorcentajeCargo(costoBase);
    }

    public double calcularSubtotal(double costoBase, double cargoServicio) {
        return costoBase + cargoServicio;
    }

    public double obtenerPorcentajeDescuento(String tipoCliente) {
        if ("Frecuente".equalsIgnoreCase(tipoCliente)) {
            return 0.07;
        }
        return 0.03;
    }

    public double calcularDescuento(double subtotal, String tipoCliente) {
        return subtotal * obtenerPorcentajeDescuento(tipoCliente);
    }

    public double calcularTotal(double subtotal, double descuento) {
        return subtotal - descuento;
    }
}