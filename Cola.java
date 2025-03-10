package consultorio;

/**
 *
 * @author USUARIO
 */
public class Cola {
    
    /*
     private Nodo primero;
    private Estudiante estudiante;
    
     public ListaSimpleLink(){ 
        primero = null;
    }
     
    public void insertInicio (Estudiante Dat){
        Nodo nuevo = new Nodo (Dat, primero);
        primero = nuevo;
    } 
    
     public void insertFinal (Estudiante Dat){ 
        Nodo nuevo = new Nodo(Dat, null);
        if (primero == null){
        primero = nuevo;
        }
        else {
            Nodo actual = primero;
            while (actual.getSig()!= null){
                actual = actual.getSig();

            }
            actual.setNext(nuevo);
        }
    }
    
    public int ContarElementos(){
        int Cant=0;
        Nodo actual = primero;
        while (actual!= null){
            Cant++;
            actual = actual.getSig();
        }
        return Cant;
    } 
    
    public void borrar (String nombre){
        if (primero == null) 
            System.out.println("lista vacía");
        else
            if (primero.getDato().getNombre().equals(nombre)){
            primero = primero.getSig();
            }
            else {
                Nodo actual = primero;
                while (actual.getSig()!=null && actual.getSig().getDato().getNombre().equals(nombre))
                 {
                   actual = actual.getSig(); 
                 }
                if (actual.getSig()== null )
                        System.out.println ("elemento "+estudiante+" no esta en la lista");
                    else{
                        actual.setNext(actual.getSig().getSig());
                    }
            }
    }
    
     public boolean ListaVacia(){
       
        if (primero==null)
              return true;
         else
              return false;   
    } 
     
    public void MostarLista(){

        Nodo actual = primero;
        while (actual!= null){
            System.out.println(actual.getDato().getNombre()+" "+actual.getDato().getEdad()+" "+actual.getDato().getSexo()+" "+actual.getDato().getCarrera());
            actual = actual.getSig();
        }
     } 
    
    public void CantGen(){
        Nodo actual = primero;
        while (actual!= null){
            actual.getDato();
            actual = actual.getSig();
    }
}
    */
    
}
