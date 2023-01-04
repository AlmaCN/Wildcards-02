package it.develhope.exercisewildcards2;

/*
Ho creato la classe GenericClass a cui ho aggiuto il generico <T>
 */
public class GenericClass <T>{

    /*
    Ho creato la variabile privata t di tipo T
     */
    private T t;

    /*
    Ho crato il metodo getT che ritorna t
     */
    public T getT() {
        return t;
    }

    /*
    Ho creato il metodo setT, che prende come parametro un oggetto di tipo T e l'ho riassegnato a t
     */
    public void setT(T t) {
        this.t = t;
    }

    /*
    Ho creto il metodo isEqual che prende come parametri due oggetti di tipo GenericClass e ritorna la loro uguaglianza.
    Inizialmente avevo creato una variabile dentro al metodo a cui assegnare l'uguaglianza e poi ritornare la variabile.
    Come nell'esempio commentato
     */
    public static boolean isEqual(GenericClass gc1, GenericClass gc2){
        //boolean equal = gc1.getT().equals(gc2.getT());
        //return equal;
        return gc1.getT().equals(gc2.getT());
    }
}
