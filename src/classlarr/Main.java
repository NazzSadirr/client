package classlarr;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int count = -1; //diqqet ele, hemise 0 olmaya biler
//        for (int i = 0; i < 50; i++) { //i=0 1 2 3 4 5 6 7 8 9
//            count++; //1
//            if (count==5){
//
//                System.out.println();
//                count=0; //0
//            }
//            System.out.print(i + " "); //0 1 2 3
//                                       //4 5 6 7
//                                       //8
//        }

//        //ic-ice for, nested for
//
//        for (int j = 0; j < 5; j++) {// j=0, 1
//
//            for (int i = 0; i <5; i++) { //i=0
//                System.out.print("*");  //*****
//                                        //*****
//                                       //*****
//            }
//            System.out.println();
//
//        }

        for (int j = 0; j < 5; j++) { //0, 1 , 2

            for (int i = 0; i < 5; i++) {
                System.out.print("*"); // *****
            }                          // *****
                                       // *****

            System.out.println();
        }



        for (int i = 0; i <5; i++) {
            System.out.println(i); //0, 1

            System.out.println("naz"); //naz, naz

            System.out.println(i+5); //5, 6
        }















    }
}
