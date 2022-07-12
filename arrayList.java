package info;


import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<String> fruitList = new ArrayList<>();
        fruitList.add("apple");
        fruitList.add("mango");
        fruitList.add("banana");


        // for get anyElement from arrayList .. arrayLint.get(int index);

        fruitList.set(0,"papaya");
        System.out.println(fruitList);
        System.out.println(fruitList.size());

    }
}

