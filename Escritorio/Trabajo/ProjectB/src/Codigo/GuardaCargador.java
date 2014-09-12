/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author user2
 */
public class GuardaCargador {

    private static final String archivoS = "Stock.wn";
    private static final String archivoC = "Clientela.wn";
    private static FileInputStream fis = null;
    private static ObjectInputStream ois = null;
    private static FileOutputStream fos = null;
    private static ObjectOutputStream oos = null;

    public static boolean guardador(Cliente clien[], Item st[]) {
        for (int i = 0; i < 2; i++) {
            boolean saved = false;

            try {
                if (i == 0) {
                    fos = new FileOutputStream(archivoC);
                } else {
                    fos = new FileOutputStream(archivoS);
                }
                oos = new ObjectOutputStream(fos);
                //Esta es otra forma de hacer un for, la sintaxis es la siguiente:
//for (Clase aux:array), recorre el array y se lo asigna al auxiliar.
                if (i == 0) {
                    oos.writeObject(clien);
                } else {
                    oos.writeObject(st);
                }
            } catch (FileNotFoundException ex) {
                System.out.println("No se encuentra el archivo");
                return false;
            } catch (IOException ex) {
                System.out.println("Error al guardar el archivo" + ex);
                return false;
            } finally {
                try {
                    if (oos != null) {
                        oos.close();
                        oos = null;
                    }
                    if (fos != null) {
                        fos.close();
                        fos = null;
                    }
                } catch (IOException e) {
                    System.out.println("Error al cerrar archivo");
                }
            }

            System.out.println("Guardado Correctamente");

        }
        return true;
    }

    /*
     * Devuelve un arraylist con las ventas en disco
     */

    public static Cliente[] cargadorC() {
        Cliente[] aux = null;

        try {
            fis = new FileInputStream(archivoC);
            ois = new ObjectInputStream(fis);

            aux = (Cliente[]) ois.readObject();
            System.out.println(aux.length);

        } catch (Exception e1) {
            System.out.println("Error!!!" + e1);
            return null;
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                    ois = null;
                }
                if (fis != null) {
                    fis.close();
                    fis = null;
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar archivo");
            }
        }
        return aux;
    }
    public static Item[] cargadorS() {
        Item[] aux = null;

        try {
            fis = new FileInputStream(archivoS);
            ois = new ObjectInputStream(fis);

            aux = (Item[]) ois.readObject();
            System.out.println(aux.length);

        } catch (Exception e1) {
            System.out.println("Error!!!" + e1);
            return null;
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                    ois = null;
                }
                if (fis != null) {
                    fis.close();
                    fis = null;
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar archivo");
            }
        }
        return aux;
    }
}
