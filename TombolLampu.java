package com.dicoding.java.controlflow;
import java.util.Objects;
import java.util.Scanner;

public class TombolLampu {
    public static void main(String[] args){
        var run = true;
        while (run){
            System.out.print("tekan tombol lampu? y/n : ");
            Scanner input = new Scanner(System.in);
            var power = input.next();
            boolean isOn;
            if (Objects.equals(power, "y")){
                isOn = true;
                System.out.println("*Menyalakan lampu*");
                System.out.println("Lampunya nyala? : " + isOn);
                System.out.println("   ====    ");
                System.out.println("   ||||    ");
                System.out.println(" *{ |_|} * ");
                System.out.println("**{____}   ");
                System.out.println(" *");
                System.out.println("*    *    *");
                System.out.println(" *      *");





            } else if (Objects.equals(power, "n")) {
                isOn = false;
                System.out.println("*Mematikan lampu*");
                System.out.println("Lampunya nyala? : " + isOn);
                System.out.println("   ====    ");
                System.out.println("   ||||    ");
                System.out.println("  {    }   ");
                System.out.println("  {____}   ");
            } else{
                System.out.println("Keluar");
                run = false;
            }

        }



        }



    }




