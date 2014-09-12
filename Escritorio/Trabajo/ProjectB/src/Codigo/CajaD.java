package Codigo;

import java.io.Serializable;

public class CajaD implements Serializable  {

    public static float cinicial = 0;
    public static float gastos = 0;
    public static float retiros = 0;
    public static float personales = 0;
    public static float cfinal = 0;
    public static float venta = 0;
    public static String dia = "";
    public static String año = "";
    public static String mes = "";
    public static String fecha = "";

    public CajaD() {
    }

    public static String getMes() {
        return mes;
    }

    public static void setMes(String mes) {
        CajaD.mes = mes;
    }
    
    public static float CalcularVenta() {
        venta = cfinal - cinicial + gastos + retiros + personales;
        return venta;
    }

    public static float getCfinal() {
        return cfinal;
    }

    public static void setCfinal(float cfinal) {
        CajaD.cfinal = cfinal;
    }

    public static float getCinicial() {
        return cinicial;
    }

    public static void setCinicial(float cinicial) {
        CajaD.cinicial = cinicial;
    }

    public static float getGastos() {
        return gastos;
    }

    public static void setGastos(float gastos) {
        CajaD.gastos = gastos;
    }

    public static float getRetiros() {
        return retiros;
    }

    public static void setRetiros(float retiros) {
        CajaD.retiros = retiros;
    }

    public static float getPersonales() {
        return personales;
    }

    public static void setPersonales(float personales) {
        CajaD.personales = personales;
    }

    public static float getVenta() {
        return venta;
    }

    public static void setVenta(float venta) {
        CajaD.venta = venta;
    }

    public static String getFecha() {
        return fecha;
    }

    public static void setFecha(String dia, String mes, String año) {
        CajaD.fecha = dia + "/" + mes + "/" + año;
    }

}
