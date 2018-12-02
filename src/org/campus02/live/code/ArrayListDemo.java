package org.campus02.live.code;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(7);
        numbers.add(-1);
        numbers.add(0);

        System.out.println("numbers.size() = " + numbers.size());

        System.out.println("numbers = " + numbers);

        System.out.println("contains 10 ? "+ numbers.contains(10));
        System.out.println("contains 7 ? "+ numbers.contains(7));

        Integer num1 = numbers.get(0);
        System.out.println("num1 = " + num1);
        Integer num3 = numbers.get(2);
        System.out.println("num3 = " + num3);

        int index = 20;

        if(index < numbers.size()) {
            Integer numN = numbers.get(index);
            System.out.println("numN = " + numN);
        } else {
            System.out.println("index not available! sorry :(");
        }

        numbers.remove(1);

        System.out.println("numbers.size() = " + numbers.size());
        System.out.println("numbers = " + numbers);


        ArrayList<String> texts = new ArrayList<>();
        texts.add("hello");
        texts.add("hallo");
        texts.add("wie gehts?");
        texts.add("hallo");

        System.out.println("texts = " + texts);

        for(String t : texts) {
            System.out.println("t = " + t);
        }

        for(int t = 0; t < texts.size(); t++) {
            if(t == 2) {
                texts.remove(t);
            }
        }

        System.out.println("texts = " + texts);


        numbers = new ArrayList<>();

        for(int n = 0; n < 100; n++) {
            numbers.add(n);
        }

        System.out.println("numbers = " + numbers);
        System.out.println("numbers.size() = " + numbers.size());


    }

}
