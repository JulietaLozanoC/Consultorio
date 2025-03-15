package consultorio;

import java.util.Scanner;

public class Consultorio {

    public static void main(String[] args) {
        Scanner Tec =  new Scanner(System.in);
        Lista_Consultas Consultas_de_hoy = new Lista_Consultas();

                /*Se solicita al usuario digitar cuantos “Pacientes” ingresara al sistema, con eso
generamos control de la información que entre y evitamos que el ingreso de
información al sistema tienda al infinito*/
        System.out.print("Digite el numero de pacientes que va a ingresar a la lista de espera: ");
        int Num_New_Pacient = Tec.nextInt();

//Se solicita la información de los nuevos “Pacientes” y almacena en la cadena de nodos
        for (int Cont_Paci = 0; Cont_Paci < Num_New_Pacient; Cont_Paci++) {
            System.out.println("\nNuevo paciente:");
            System.out.print("Nombre: ");
            String Name = Tec.next();
            System.out.print("Cedula: ");
            int Ced = Integer.parseInt(Tec.next());
            System.out.print("Edad: ");
            int Age = Integer.parseInt(Tec.next());
            Consultas_de_hoy.Insertar_Nuevo_Nodo(Name, Ced, Age);
        }

//Funciones puestas a prueba para comprobar el estado de los nodos
        System.out.println("\nHay " + Consultas_de_hoy.ContarElementos() + " pacientes en espera.");
        System.out.println("\n------ Mostar la lista de pacientes: ---------");
        Consultas_de_hoy.MostarLista();
        System.out.print("\nDigite la cedula del paciente a borrar de la lista:");
        Num_New_Pacient = Tec.nextInt();
        Consultas_de_hoy.borrar(Num_New_Pacient);
        System.out.println("\nLa lista contiene ahora " + Consultas_de_hoy.ContarElementos() + " pacientes.");
        System.out.println("\n------ Lista despues de Borrar al paciente: ---------");
        Consultas_de_hoy.MostarLista();
    }
}
