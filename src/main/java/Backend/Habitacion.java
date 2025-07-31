package Backend;

public class Habitacion {

    private int id; // identifica al objeto dentro del programa y sirve para bases de datos que lo utilicen
    private int numero; // es mas especifico, ej: con cabana AC43
    private String tipoHabitacion;
    private boolean estado;
    private double precio;
    //---------------------------------------------------------------------------------------------------------------------
    public Habitacion(int id, int numero, boolean estado, double precio){
        this.id = id;
        this.numero = numero;
        this.estado = estado;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

}



