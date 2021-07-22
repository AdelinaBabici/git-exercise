package main;

import java.util.Scanner;

public class Raza {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti raza cercului: ");
        int a = scanner.nextInt();
        System.out.println("Perimetrul cercului este " + 2*3.14f*a);
        System.out.println("Aria cercului este " + 3.14f*a*a);


    }
}
