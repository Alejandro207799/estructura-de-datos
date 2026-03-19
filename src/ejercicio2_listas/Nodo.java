package ejercicio2_listas;


class Nodo {

    Contacto contacto;
    Nodo     siguiente;


    Nodo(Contacto contacto) {
        this.contacto  = contacto;
        this.siguiente = null; // al nacer, no apunta a nadie
    }
}