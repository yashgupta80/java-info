package info;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkLins {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
        inOrder(placesToVisit, "Mumbai");
        inOrder(placesToVisit, "Delhi");
        inOrder(placesToVisit, "Agra");
        inOrder(placesToVisit, "NewDelhi");
        inOrder(placesToVisit, "TamilNadu");
        inOrder(placesToVisit, "Etah");
        inOrder(placesToVisit, "Aligarh");
        inOrder(placesToVisit, "Mathura");
        printPlaces(placesToVisit);



    }

    private static void printPlaces(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();

        while (i.hasNext()){
            System.out.println("places --> " + i.next());
        }
        System.out.println("===================================");
    }
    // short in order
    private static boolean inOrder(LinkedList<String> stringLinkedList, String newCity){
        ListIterator<String> listIterator = stringLinkedList.listIterator();
        while (listIterator.hasNext()){
            int comparison = listIterator.next().compareTo(newCity);
            if (comparison == 0){
                System.out.println(newCity + " city is already exist in you list.");
                return false;
            }else if (comparison > 0){
                listIterator.previous();
                listIterator.add(newCity);
                return true;
            }else if (comparison < 0){
                // move on next city

            }
        }
        stringLinkedList.add(newCity);
        return true;
    }
}
