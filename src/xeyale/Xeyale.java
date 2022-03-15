package xeyale;

import java.util.Scanner;

public class Xeyale {

    public static void main(String[] args) {

        //*
        //**
        //***
        //****


//        for (int i = 1; i <= 5; i++) {//i= 1, 2,3,4,5
//
//            for (int j = 0; j < i; j++) { //*
//                //**
//                //***
//                //****
//                //*****
//                //
//                System.out.print("*");
//            }
//
//            if (i == 5)
//                break;
//            System.out.println();
//        }

        //*****
        //****
        //***
        //**
        //*

//        for (int i = 0; i < 5; i++) { //i= 0, 1, 2, 3, 4
//
//                           //  j<5-1=4
//                           // j< 5-2=3
//                          // j< 5-3=2
//                          // j< 5-4=1
//            for (int j = 0; j < 5-i; j++) { //j=0, 1
//                System.out.print("*");//*****
//                                      //****
//                                      //***
//                                      //**
//                                      //*
//            }
//            if (i==4)
//                break;
//            System.out.println();
//        }

//        //    *
//        //   **
//        //  ***
//        // ****
//        //*****
//
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 0; j <5-i ; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//
//            System.out.println();
//
//        }

//          //    *
////        //   ***
////        //  *****
////        // *******
//          //*********
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Yolka nece mertebeli olsun?");
//        int t = sc.nextInt(); //5
//        for (int i = 0; i < t; i++) { //i=0, 1
//
//            for (int j = 0; j < t-i-1; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < i*2+1; j++) {
//                System.out.print("*");
//            }
//            for (int j = 0; j < t-i-1; j++) {
//                System.out.print(" ");
//            }
//
//            System.out.println();
//        }
//

//        int count = 0;
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 6; j++) {
//                count++;
//            }
//        }
//
//        System.out.println("Emelyatin sayi, yeni dovrlerin sayi = " + count);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter any number");


        int num = scanner.nextInt(); //5                //i<=25

        for (int i = 1; i <= num*num; i++){
            System.out.print("*");

            if (i%num==0)
                System.out.println();
        }




        System.out.println("\n-----------\n");


        System.out.println("Please anter a number");
        int num1 = scanner.nextInt(); //20
        boolean situ; //elan etdim

        for (int i = 2; i <= num1; i++) { //i = 2;3; 4, 5, 6,7,8, 9, 10
            situ = true;//i=9, situ =true

                            //j<9
            for (int j = 2; j < i; j++) { //j =2, 3
                if (i%j == 0){

                    situ = false; //sitru=false
                    break;
                }
            }

            if (situ){
                System.out.println(i); //2, 3, 5,7,
            }
        }



        System.out.println("Please enter any number");
        int num2 = scanner.nextInt();

        for (int i = 1; i <= num2; i++) {
            for (int j = 0; j <= 10 - i - 1; j++) {
                System.out.print(" ");
            }
            for (int s = 0; s < i * 2 - 1; s++) {
                System.out.print("*");
            }

            for (int j = 0; j < num2 - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();

        }


        System.out.println("Please enter any number");
        int num3 = scanner.nextInt();
        if (num3 % 2 == 0) {
            System.out.println("divisible");

        } else {
            System.out.println("not divisible");
        }

        System.out.println("eded daxil edin:");
        int eded = scanner.nextInt(); //30
        for (int i = 0; i <= eded; i++) {
            if (i%2==0) //true -> cutdur, o xzaman sout
            System.out.println(i);
        }


    }
}