package reto3;

/**
 *
 * @author ColdHeart
 */
public class EmpresaAlquilerVehiculos {
    String cif;
    String nombre;
    String paginaWeb;
    int totalClientes;
    int totalVehiculos;
    int totalAlquileres;
    Cliente[] cliente = new Cliente[100] ;
    Vehiculos[] vehiculos = new Vehiculos[100];
    VehiculoAlquilado[] alquileres = new VehiculoAlquilado[100];
    
    public boolean encontrado=false;
    public int i=0;

    public EmpresaAlquilerVehiculos(String cif, String nombre, String paginaWeb) {
        this.cif = cif;
        this.nombre = nombre;
        this.paginaWeb = paginaWeb;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaginaWeb() {
        return paginaWeb;
    }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }

    public int getTotalClientes() {
        return totalClientes;
    }

    public void setTotalClientes(int totalClientes) {
        this.totalClientes = totalClientes;
    }

    public int getTotalVehiculos() {
        return totalVehiculos;
    }

    public void setTotalVehiculos(int totalVehiculos) {
        this.totalVehiculos = totalVehiculos;
    }

    public int getTotalAlquileres() {
        return totalAlquileres;
    }

    public void setTotalAlquileres(int totalAlquileres) {
        this.totalAlquileres = totalAlquileres;
    }

    public Cliente[] getCliente() {
        return cliente;
    }

    public void setCliente(Cliente[] cliente) {
        this.cliente = cliente;
    }

    public Vehiculos[] getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(Vehiculos[] vehiculos) {
        this.vehiculos = vehiculos;
    }

    public VehiculoAlquilado[] getAlquileres() {
        return alquileres;
    }

    public void setAlquileres(VehiculoAlquilado[] alquileres) {
        this.alquileres = alquileres;
    }

    void registrarCliente(Cliente cliente) {
        this.cliente[this.totalClientes] = cliente;
        this.totalClientes++;
    }

    void registrarVehiculo(Vehiculos vehiculo) {
        this.vehiculos[this.totalVehiculos] = vehiculo;
        this.totalVehiculos++;
    }

    void imprimirCliente() {
        System.out.println("RELACION DE CLIENTES"+"\nCliente #   NIF         Nombre");
         for (int i = 0; i < this.totalClientes; i++) {
             System.out.println((i+1)+" "+this.cliente[i].getIden()+" "+ this.cliente[i].getNombre()+" "+this.cliente[i].getApellido());
        }
    }

    void imprimirVehiculos() {
        System.out.println("CATÁLOGO DE VEHICULOS"+"\nVeh. #   Matrícula         Modelo         Color           Tarifa          Disponible");
         for (int i = 0; i < this.totalVehiculos; i++) {
             System.out.println((i+1)+" "+this.vehiculos[i].getMatricula()+" "+this.vehiculos[i].getModelo()+" "+this.vehiculos[i].getColor()+" "+
                     String.valueOf(this.vehiculos[i].getTarifa())+" "+this.vehiculos[i].isDisponible()
             );
        }
    }

    Object getCliente(String iden) {
        
        while (encontrado==false && i<totalClientes) {            
            if(cliente[i].getIden().equals(iden)){
                encontrado=true;
                return i;
            }
            i++; 
        }
        return -1;
    }
}
