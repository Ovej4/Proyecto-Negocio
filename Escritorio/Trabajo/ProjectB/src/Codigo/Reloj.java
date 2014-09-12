package Codigo;

import javax.swing.JLabel;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;

public class Reloj extends JLabel implements Runnable {

    /*
     * Creamos las variables que tomaran el formato de fecha y hora y un
     * calendario con formato gregoriano. Y luego un hilo (thread) de ejecución
     * sin iniciarlo.
     */
    
    public static String dia, mes, year, hora, minutos, segundos;
    private Calendar calendario = new GregorianCalendar();
    private Thread hilo;

    //Constructor
    /*
     * En este constructor declaramos la posicion y tamaño como a un label
     */
    
    public Reloj(int x, int y, int p, int p1) {
        setBounds(x, y, p, p1);
        hilo = new Thread(this);
        hilo.start();
    }

    /*
     * Aca simplemente decimos que si el mes es enero, devuelva 0 y asi
     * sumaremos de uno en uno. Usare HTML para darle un formato que permita un
     * salto de linea.
     */
    
    public static String getYear() {
        return year;
    }

    @Override
    public void run() {
        Thread cicle = Thread.currentThread();
        while (cicle == hilo) {
            try {
                act();

                int mesE;
                mesE = Integer.valueOf(mes) + 1;
                setText(dia + " / " + mesE + " / " + year + "  [ " + hora + ":"+ minutos + ":" + segundos + " ]");
               
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
    
    //ToString para la otra clase.

    @Override
    public String toString() {
        return hora + ":" + minutos + ":" + segundos;
    }
    
    /*
     * La clase calendario devuelve los datos en forma de integers. Para un buen
     * formato usaremos un condicional.
     *
     * minutos = calendario.get(Calendar.MINUTE) > 9 ? "" +
     * calendario.get(Calendar.MINUTE) : "0" + calendario.get(Calendar.MINUTE);
     *
     * Lo que hacemos con esta sola linea, es basicamente meter un if dentro de
     * una linea de la siguiente manera: La primera parte de la linea (entre = y
     * ?) declaramos la condicion del if, el ? es la orden "Hacer", finalizado
     * el efecto, usamos un : (else) y luego declaramos el "Hacer" cuando el if
     * es falso.
     */
    
    public void act() {
        Date fechaHoraActual = new Date();
        calendario.setTime(fechaHoraActual);
        hora = String.valueOf(calendario.get(Calendar.HOUR_OF_DAY));
        minutos = calendario.get(Calendar.MINUTE) > 9
                ? "" + calendario.get(Calendar.MINUTE)
                : "0" + calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND) > 9
                ? "" + calendario.get(Calendar.SECOND)
                : "0" + calendario.get(Calendar.SECOND);
        dia = calendario.get(Calendar.DATE) > 9
                ? "" + calendario.get(Calendar.DATE)
                : "0" + calendario.get(Calendar.DATE);
        mes = calendario.get(Calendar.MONTH) > 9
                ? "" + calendario.get(Calendar.MONTH)
                : "0" + calendario.get(Calendar.MONTH);
        year = calendario.get(Calendar.YEAR) > 9
                ? "" + calendario.get(Calendar.YEAR)
                : "0" + calendario.get(Calendar.YEAR);
    }
}
