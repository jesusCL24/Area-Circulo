package Circulo;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sx=new Scanner(System.in);
        double r;
        System.out.println("ingrese radio: ");
        r=sx.nextDouble();
        Circulo cir= new Circulo();
        cir.resp((int) r);
    }
}
