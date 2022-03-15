package xeyale;

import java.util.Arrays;
import java.util.Scanner;

public class Xeyale2 {
    public static void main(String[] args) {
        //while -  loop - serti dovr= natamam dovr = natamam serti dovr

        //bank emelyatlari
        // Scanner sc = new Scanner(System.in);
//        int hesab = 1000; //guya kartimda min manat var
//
//        String emeliyyatlar = """
//                0. Cixis
//                1. Balans
//                2. Pul cekme
//                3. Medaxil
//                """;
//
//        System.out.println(emeliyyatlar);
//
//        label:
//        while (true){
//            System.out.println("Emelyati secin:");
//            int emel = sc.nextInt(); //istifadeci yeni user daxil edir
//
//            switch (emel){
//                case 0: //while'mizi qiran reqem sifirdir
//                    System.out.println("Cixis oldu..");
//                    break label;
//                case 1:
//                    System.out.println("Hesabiniz: " + hesab);
//                    break;
//                case 2:
//                    System.out.println("Cekmek istediyiniz mebleg:");
//                    int cek = sc.nextInt(); //500
//
//                    if ((hesab-cek)<0){
//                        System.out.println("Kafi mebleg movcud deyil");
//                    }else{
//                        hesab -= cek; //bu setri yazmasan balansin deyismeyecek //hesab = hesab - cekilmis pul
//                        System.out.println("Hesabdan cixaris :" + cek);
//                    }
//                    break;
//                case 3:
//                    System.out.println("Medaxil edeceyin mebleg:");
//                    int med = sc.nextInt();
//                    hesab += med; //hesab = hesab + medaxil
//                    System.out.println("Yeni hesabiniz: " + hesab);
//                    break;
//                default:
//                    System.out.println("Default..");
//            }
//        }


//        //TASK 1. ededin reqemleri cemini ve hemin ededin nece reqemden ibaret oldugunu tapin
//        //TASK 2. Ededi reverse tap. meselen 456 verilse capa 654 cixsin
//
//        //2345 --> 2+3+4+5
//        Scanner sc = new Scanner(System.in);
//        System.out.println("EDED DAXIL EDIN: ");
//        int eded = sc.nextInt(); //user eded daxil edir
//
//        int count = 0;
//        int cem = 0; //baza, depo, baqaj
//        int qaliq; //ededi parcalayacam. niye? cunki reqemlerini isteyir
//
//        while (eded>0){ //123
//            qaliq = eded%10;  //3, 2, 1
//            cem += qaliq; //cem = 0+3=3,,, 3+2 = 5, 5+1=6
//            eded = eded/10; //12, 1
//
//            System.out.print(qaliq);
//            count++;
//        }
//
//        System.out.println();
//        System.out.println(cem);
//        System.out.println("Eded nece reqemlidir: " + count);


        //TASK 4 . vurma cedveli yaz

//        for (int i = 1; i <= 9 ; i++) {
//
//            for (int j = 0; j <= 9; j++) {
//                System.out.println(i + " * " + j + " = " + (i*j));
//            }
//            System.out.println();
//        }

        //task 5. //inputdan eded gelir. Ededden oz reqemlerin cemin cixaq   ,
        //alinan ededden de yene oz reqemlerin cemini cixaq. bu prosesi ne qeder ki
        // alinan eded musbetdir davam edeceyik. Tapmalisiz: emelyat nece defe icra olundu


//        Scanner sc = new Scanner(System.in);
//        System.out.println("Eded daxil edin: ");
//        int n = sc.nextInt(); //45
//
//        int count = 0;
//        int temp =n;
//
//        while (n>0){ //45
//
//            int cem =0;
//
//            while(temp>0){ //45
//                cem += temp%10; //5, 9
//                temp /=10; //4
//            }
//
//            count++; //prosesi sayiram
//            n = n-cem; //36
//            temp = n;
//        }
//
//        System.out.println("Say : " + count);

//        // Task 3 ArmStrong. eded geldi,
//
//        //bize lazimdi? ededin reqemlerin tapmaq, ededin nece reqemli olmasi, cemlemek
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter the number");
//
//        int eded = sc.nextInt(); //153
//
//        int temp = eded; //153
//        int temp2 = eded; //153
//
//        //ededin reqemlerin sayin tapdig
//        int count = 0; //saygacdi, depo, baqaj
//
//        while (temp2 > 0) { //153
//            int qaliq = temp2 % 10; //3, 5, 1
//            temp2 /= 10; //15, 1, 0
//
//            count++; //1,2, 3
//        }
//
//
//
//        //quvvet ve cemleme:
//        int cem = 0; //baqaj
//        while (temp > 0) {
//            int qaliq = temp % 10; //3, 5, 1
//            temp /= 10; //15
//                                    //3      //3
//            double quvvet = Math.pow(qaliq, count);
//
//            cem += quvvet; //cem = 0+27=27 // cem = 27+125=152 //cem = 152+1=153
//
//        }
//
//            //153 == 153
//        if (cem == eded){
//            System.out.println("eded armstrong ededdir");
//        }else{
//            System.out.println("eded armstrong eded deyil");
//        }


//        int box = 0;
//        int r;  //reminder
//        int t;  //temperory
//        t = num; //compare
//
//        while (num > 0) {
//            r = num % 10;
//            num = num / 10;
//            box = box + (r * r * r * r);
//        }
//        if (t == box) {
//            System.out.println("this is armstrong number");
//        } else {
//            System.out.println("this is not armstrong number");
//        }


    }
}
