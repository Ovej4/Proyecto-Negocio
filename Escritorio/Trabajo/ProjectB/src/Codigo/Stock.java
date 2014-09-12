package Codigo;


public class Stock {
    public static Item[] baseItems = new Item[0];
   
    
    public static boolean  addItem(Item itemsillo){
        Item[] itemsilloSupp= new Item[baseItems.length+1];
    for(int i=0; i<baseItems.length;i++){
        itemsilloSupp[i]=baseItems[i];
        if(baseItems[i].getNombre().equals(itemsillo.getNombre())){
            return false;
        }
}
    itemsilloSupp[itemsilloSupp.length-1]=itemsillo;
    Stock.baseItems = itemsilloSupp;
    return true;
}
    public static boolean BuscarExistencia(String articulo){
        for(int i=0; i<baseItems.length;i++){
            if(baseItems[i]!=(null)){
                if(baseItems[i].getNombre().equals(articulo)){
                   return true;}
        }
    }return false;
        
}
    public static int Buscar(String articulo){
    for(int i=0; i<baseItems.length;i++){
        if(baseItems[i]!=(null)){
            if(baseItems[i].getNombre().equals(articulo)){
                return i;
        }
        }
    }
    return 0;
}

    public static int getCantidad(int Lugar){
                return baseItems[Lugar-1].getCantidad();
            }
    public static String getNombre(int Lugar){
                return baseItems[Lugar-1].getNombre();
    }
    public static float getPrecioCompra(int Lugar){
                return baseItems[Lugar-1].getPrecioCompra();
    }
    public static float getPrecioVenta(int Lugar){
                return baseItems[Lugar-1].getPrecioVenta();
    }
    public static void BorrarArticulo(int select) {
        int o = 0;
        Item[] auxiliar = new Item[baseItems.length-1];
        for(int i=0;i<baseItems.length;i++){
            if(i!=select){
                auxiliar[o]=baseItems[i];
                o++;
            }
        }
        Stock.baseItems = auxiliar;
    }
        }


