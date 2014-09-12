package Codigo;

import java.io.Serializable;


public class Cliente implements Serializable{
    private int Tel = 0;
    private String Nombre = "";
    private String Direccion = "";
    private float Deuda = 0;

    public Cliente() {
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getTel() {
        return Tel;
    }

    public void setTel(int Tel) {
        this.Tel = Tel;
    }

    public float getDeuda() {
        return Deuda;
    }

    public void setDeuda(float Deuda) {
        this.Deuda = Deuda;
    }


    @Override
    public String toString() {
        if(!Direccion.equals("")){
            return "Se ha cargado el cliente " + Nombre + " de dirección " + Direccion + " y su telefono (" + Tel + ")";
        }
        return "Se ha cargado el cliente " + Nombre + " y su telefono (" + Tel + ")";
    }

}

