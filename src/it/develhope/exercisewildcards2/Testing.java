package it.develhope.exercisewildcards2;

public class Testing {

    public static void main(String[] args) {

        /*
        Ho crato poi i quattro oggetti di tipo GenericClass, i primi due di tipo Integer e gli ultimi due di tipo
        Stringa.
        Ho poi fatto il set degli oggetti
         */
        GenericClass<Integer> firstElement = new GenericClass<>();
        firstElement.setT(12);

        GenericClass<Integer> secondElement = new GenericClass<>();
        secondElement.setT(13);

        GenericClass<String> thirdElement = new GenericClass<>();
        thirdElement.setT("This is a string");

        GenericClass<String> fourthElement = new GenericClass<>();
        fourthElement.setT("This is a string");

        /*
        Ho fatto l'uguaglianza due primi due oggetti e degli ultimi due richiamando il metodo isEqual.
         */
        System.out.println("First element is equal to second element? " + GenericClass.isEqual(firstElement, secondElement));
        System.out.println("Third element is equal to fourth element? " + GenericClass.isEqual(thirdElement, fourthElement));


    }
}
