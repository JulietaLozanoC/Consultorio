/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package consultorio;

/**
 *
 * @author USUARIO
 */
public class Nodo {

    private Paciente dato;
    private Nodo Next;



    public Nodo (Paciente Dat, Nodo sig){
        dato = Dat;
        Next = sig;
    }
    
    public Paciente getDato(){
        return dato;
    }
    
    public Nodo getSig(){
        return Next;
    }
    
    public void setDato(Paciente element){
        dato = element;
    }
    
    public void setNext(Nodo sig){
        Next = sig;
}
    
}
