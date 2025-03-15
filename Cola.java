package consultorio;

public class Cola {
  
    private Nodo primero;

    public Lista_Consultas() {
        primero = null;
    }

      /*Método que nos permitirá ingresar la información de los nuevos “Pacientes” al final
de la lista simplemente enlazada para así retomarla en el orden que va entrando (el
primer dato en entrar es el primero en salir)*/
    public void Insertar_Nuevo_Nodo(String nombre, int cedula, int edad) {
        Nodo nuevo = new Nodo(nombre, cedula, edad, null);
        if (primero == null) {
            primero = nuevo;
        } else {
            Nodo actual = primero;
            while (actual.getSig() != null) {
                actual = actual.getSig();
            }
            actual.setNext(nuevo);
        }
    }

//Método que realiza un conteo de los objetos “Paciente” almacenados en los nodos disponibles
    public int ContarElementos() {
        int Num_Pacientes = 0;
        Nodo actual = primero;
        while (actual != null) {
            Num_Pacientes++;
            actual = actual.getSig();
        }
        return Num_Pacientes;
    }

//Método para eliminar uno de los “Pacientes” de la lista por su número de cedula
    public void borrar(int Dat) {
        if (primero == null) {
            System.out.println("La lista esta vacia.");
        } else if (primero.getCedula() == Dat) {
            primero = primero.getSig();
        } else {
            Nodo actual = primero;
            while (actual.getSig() != null && actual.getSig().getCedula() != Dat) {
                actual = actual.getSig();
            }
            if (actual.getSig() == null) {
                System.out.println("El paciente de cedula " + Dat + " no esta en la lista.");
            } else {
                actual.setNext(actual.getSig().getSig());
            }
        }
    }

//Método para imprimir toda la información de los “Pacientes” registrados en los nodos almacenados
    public void MostarLista() {
        Nodo actual = primero;
        while (actual != null) {
            System.out.println(actual.toString());
            actual = actual.getSig();
        }
    }
}
