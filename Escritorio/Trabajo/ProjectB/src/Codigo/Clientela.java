package Codigo;

public class Clientela {

    public static Cliente[] clientitos = new Cliente[0];

    public static boolean addCliente(Cliente cliente) {
        Cliente[] clientitosSupp = new Cliente[clientitos.length + 1];
        for (int i = 0; i < clientitos.length; i++) {
            clientitosSupp[i] = clientitos[i];
            if (clientitos[i].getNombre().equals(cliente.getNombre())) {
                return false;
            }
        }
        clientitosSupp[clientitosSupp.length - 1] = cliente;
        Clientela.clientitos = clientitosSupp;
        return true;
    }

    public static String BuscarPorTelefono(int Telefono) {
        for (int i = 0; i < clientitos.length; i++) {
            if (clientitos[i] != (null)) {
                if (clientitos[i].getTel() == Telefono) {
                    return clientitos[i].getNombre();
                }
            }
        }
        return null;
    }

    public static String BuscarDireccion(String Nombre) {
        for (int i = 0; i < clientitos.length; i++) {
            if (clientitos[i] != (null)) {
                if (clientitos[i].getNombre().equals(Nombre)) {
                    return clientitos[i].getDireccion();
                }
            }
        }
        return null;
    }

    public static float BuscarDeuda(String Nombre) {
        for (int i = 0; i < clientitos.length; i++) {
            if (clientitos[i] != (null)) {
                if (clientitos[i].getNombre().equals(Nombre)) {
                    return clientitos[i].getDeuda();
                }
            }
        }
        return 0;
    }

    public static boolean BuscarExistencia(String name, int tel) {
        if (tel == 0) {
            for (int i = 0; i < clientitos.length; i++) {
                if (clientitos[i] != (null)) {
                    if (clientitos[i].getNombre().equals(name)) {
                        return true;
                    }
                }
            }
        }
        if (name.equals(" ")) {
            for (int i = 0; i < clientitos.length; i++) {
                if (clientitos[i] != (null)) {
                    if (clientitos[i].getTel() == tel) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static int BuscarPorNombre(String Nombre) {
        for (int i = 0; i < clientitos.length; i++) {
            if (clientitos[i] != (null)) {
                if (clientitos[i].getNombre().equals(Nombre)) {
                    return clientitos[i].getTel();
                }
            }
        }
        return 0;
    }

    public static void BorrarCliente(int select) {
        int o = 0;
        Cliente[] auxiliar = new Cliente[clientitos.length - 1];
        for (int i = 0; i < clientitos.length; i++) {
            if (i != select) {
                auxiliar[o] = clientitos[i];
                o++;
            }
        }
        Clientela.clientitos = auxiliar;
    }
}
