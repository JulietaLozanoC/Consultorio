package consultorio;

public class Nodo {
    
//Creación de los atributos principales del objeto “Paciente”, dichos objetos serán almacenados en las celdas de los nodos correspondientes
    private String nombre;
    private int cedula;
    private Nodo Next;

//A continuación, se generan los “get” y “set” que nos permitirán manipular y trabajar con la información de los objetos “Paciente” almacenados en sus respectivos nodos
    public Nodo(String nombre, int cedula, Nodo Next) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.Next = Next;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public Nodo getSig() {
        return Next;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setNext(Nodo sig) {
        Next = sig;
    }
}
