package main;

import java.util.*;

public class Read {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an int number: ");
        int x = scan.nextInt();
        System.out.println(tratat(x));

        System.out.println("Enter a float number: ");
        float y = scan.nextFloat();
        System.out.println(tratat(y));

        System.out.println("Enter a double number: ");
        double z = scan.nextDouble();
        System.out.println(tratat(z));

        System.out.println("Enter a long number: ");
        long j = scan.nextLong();
        System.out.println(tratat(j));

        System.out.println("How many nums? ");
        int a = scan.nextInt();
        System.out.println(listOfNums(a));
        System.out.println(returningAList());


    }

    public static int tratat (int x) {
        return x;
    }

    public static float tratat (float x) {
        return x ;
    }
    public static double tratat (double x) {

        return x;
    }
    public static long tratat (long x) {

        return x;
    }
//In clasa Read, creati o metoda care sa returneze un array de numere populat de la tastatura. Metoda sa primeasca ca si parametru un numar, care reprezinta cate pozitii are.
    public static String listOfNums(int x){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values for the array: ");
        int array[] = new int[x];
        for (int i = 0; i < array.length;i++){
            array[i] = sc.nextInt();
        }
        return Arrays.toString(array);
    }

    // In clasa Read, creati o metoda care sa returneze o lista de numere populate de la tastatura. Metoda nu v-a primii parametru lungimea. In rezolvarea ei trebuie folosit try-catch. (Hint: a se citi de la tastatura atata timp cat valoarea primita e numar, cand nu mai e numar, sa se intrerupa citirea)

    public static List<Integer> returningAList(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter ONLY numbers for the list: ");
        try {
            List<Integer> lista = new ArrayList<>();
            lista.add(scan.nextInt());
            for(int i : lista){
                return lista;
            }

        }catch (InputMismatchException e){
            System.out.println("You have entered an incorrect value!");

        }

         return null;
    }
}