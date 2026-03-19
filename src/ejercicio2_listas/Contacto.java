package ejercicio2_listas;

public class Contacto {
    String nombre;
    String telefono;
    String email;

    public Contacto(String nombre, String telefono, String email) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }
    public String toString(){
        return "Nombre: " + nombre +
                " | Tel: " + telefono +
                " | Email: " + email;
    }
}