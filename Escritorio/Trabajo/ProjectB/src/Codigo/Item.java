package Codigo;

import java.io.Serializable;

public class Item implements Serializable {

    private String Nombre = "";
    private int Cantidad = 0;
    private float PrecioCompra = 0;
    private float PrecioVenta = 0;
    private String TipoBulto = "";

    public Item() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public float getPrecioCompra() {
        return PrecioCompra;
    }

    public void setPrecioCompra(float PrecioCompra) {
        this.PrecioCompra = PrecioCompra;
    }

    public float getPrecioVenta() {
        return PrecioVenta;
    }

    public void setPrecioVenta(float PrecioVenta) {
        this.PrecioVenta = PrecioVenta;
    }

    public String getTipoBulto() {
        return TipoBulto;
    }

    public void setTipoBulto(String TipoBulto) {
        this.TipoBulto = TipoBulto;
    }
}
