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
}
