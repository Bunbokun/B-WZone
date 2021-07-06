package com.robotics.gui;



//public class Random {
//    public static void main(String[] args) {
//        usingMathClass();
//    }
//    static void usingMathClass() {
//        //Vòng lặp in ra 5 số ngẫu nhiên
//        for (int i=0; i<164; i++) {
//            double randomDouble = Math.random();
//            randomDouble = randomDouble * 100 + 1;
//            int randomInt = (int) randomDouble;
//            System.out.println("" + randomInt);
//        }
//    }
//}
import java.util.ArrayList;
import java.util.Random;

public class Randomm {
    public static void main(String[] args) {
        int size = 59;

        ArrayList<Integer> list = new ArrayList<Integer>(size);
        for(int i = 1; i <=841 ; i++) {
            list.add(i);
        }

        Random Rand = new Random();
        while(list.size() > 0) {
            int index = Rand.nextInt(list.size());
            System.out.println(""+list.remove(index));
        }
    }
}

