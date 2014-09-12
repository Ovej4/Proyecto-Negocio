package Codigo;

public class CajaGeneral {
    public static CajaD [] cajaFinal = new CajaD[0];
    
    public static boolean addCajaDiaria(CajaD cajita){
                CajaD[] cajafinalSupp = new CajaD[cajaFinal.length + 1];
        for (int i = 0; i < cajaFinal.length; i++) {
            cajafinalSupp[i] = cajaFinal[i];
            if (cajaFinal[i].getFecha().equals(cajita.getFecha())) {
                return false;
            }
        }
        cajafinalSupp[cajafinalSupp.length - 1] = cajita;
        CajaGeneral.cajaFinal = cajafinalSupp;
        return true;
    }    
}
