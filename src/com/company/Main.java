package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите валюту в гривнях");
      double hrn = in.nextDouble();
voidhr(hrn);
        System.out.println("Введите валюту в рублях");
        double rub = in.nextDouble();
        voidhr(rub);
        }




    public static void voidhr(double hrn){

        double rub;
        double evro;
        double dollor;
        rub=hrn*5;
        System.out.println(rub+"  Рублей");
        evro=hrn*8;
        System.out.println(evro+"  Евро");
        dollor=hrn*10;
        System.out.println(dollor+"  Доллор");

    }
    public  static void voidrub(double rub) {

        double hrn;
        double evro;
        double dollor;
        hrn = 6 * rub;
        System.out.println(hrn + " Гривен");
        evro = rub * 8;
        System.out.println(evro + "  Евро");
        dollor = rub * 10;
        System.out.println(dollor + "  Доллор");


    }



    }



