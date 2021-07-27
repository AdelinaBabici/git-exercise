package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args){

        Calculator calc = new Calculator();
        LogicalOp logicalOp = new LogicalOp();


        printHelloName();

        sumOfNumbers();

        impartireNumere();

        operatiiNumere();

        afisare();



        System.out.println("Rezultatul adunarii este = " + calc.adunare(4,5));
        System.out.println("Rezultatul scaderii este = " + calc.scadere(12,5));
        System.out.println("Rezultatul inmultirii este = " + calc.inmultire(4,5));
        System.out.println("Rezultatul impartirii este = " + calc.impartire(8,4));
        System.out.println("Rezultatul mediei este = " + calc.medieNumere(8,4, 9));
        System.out.println("Rezultatul restului este = " + calc.restImpartireNumere(9,4));
        System.out.println("Celsius temperature is: " + temperatura(120));
        System.out.println("The distance is (inch): " + distanta(120));
        viteza(1000, 10, 5,7);
        System.out.println("The bigger number is: " + logicalOp.checkBiggerNumber(7,3));
        System.out.println("Discussion: " + logicalOp.learningSchool("FastTrackIT"));
        System.out.println("Text/number: " + logicalOp.learningNumber("FastTrackITt", 6));
        System.out.println("Snow situation: " + logicalOp.snowSituation(3));
        System.out.println("Comparison of numbers: " + logicalOp.numbersSituation(1));
        System.out.println(logicalOp.guessTheNumber(5));
        System.out.println(logicalOp.isNumberEven(5));
        System.out.println("Is eligible to vote? " + logicalOp.isEligibleToVote(18));
        System.out.println("The greatest number is: " + logicalOp.theGreatestNum(8,10,7));
        logicalOp.numaratoare(6);
        System.out.println(" ");
        logicalOp.numaratoareInversa(2);
        System.out.println(" ");
        logicalOp.countingBetweenNumbers(23,20);
        System.out.println(" ");
        logicalOp.comparingCountingNumbers(23,12);
        System.out.println(" ");
        logicalOp.evenNumbers();
        System.out.println(" ");
        logicalOp.oddNumbers();
        System.out.println(" ");
        logicalOp.sumNumbers(2);
        System.out.println(" ");
        logicalOp.averageOfNumbers(2);
        System.out.println(" ");
        logicalOp.asterisks();
        System.out.println(" ");
        logicalOp.countingFromX(90);
        System.out.println(" ");
        logicalOp.countingReverse(-90);
        System.out.println(" ");
        logicalOp.countingBetweenXY(9,6);
        System.out.println(" ");
        logicalOp.compareXY(5,2);
        System.out.println(" ");
        logicalOp.printEvenNumbers();
        System.out.println(" ");
        logicalOp.printOddNumbers();
        System.out.println(" ");
        logicalOp.sumOfDefinedNums();
        System.out.println("Divisibility by seven " + logicalOp.divisibilityBySeven(10,30));
        System.out.println(" ");
        logicalOp.fibonacciNums();
        System.out.println(" ");
        logicalOp.CozaLozaWoza();
        System.out.println("Rezultatul adunarii este = " + calc.adunare(4.34f,5.4444f));
        System.out.println("Rezultatul scaderii este = " + calc.scadere(42.4444f,5.6666f,7.422343f));
        System.out.println("Rezultatul inmultirii este = " + calc.inmultire(4,5,7,8));
        System.out.println("Rezultatul impartirii este = " + calc.impartire(8.54f,4.22f));
        System.out.println("Rezultatul mediei este = " + calc.medieNumere(8.44f,4.32f, 9.44f));
        System.out.println("Rezultatul restului este = " + calc.restImpartireNumere(9.433f,4.33f));

        System.out.println("Rezultatul adunarii este = " + calc.adunare(4,5,99));
        System.out.println("Rezultatul scaderii este = " + calc.scadere(12.33,5.422));
        System.out.println("Rezultatul inmultirii este = " + calc.inmultire(4.333,5.888));
        System.out.println("Rezultatul impartirii este = " + calc.impartire(8.3,4.11));
        System.out.println("Rezultatul mediei este = " + calc.medieNumere(8.53,5.33, 9.12));
        System.out.println("Rezultatul restului este = " + calc.restImpartireNumere(9.44,4.012));
        logicalOp.populateArray();
        int[] arr = new int[50];
        System.out.println(Arrays.toString(logicalOp.myArrays(arr)));
        int[] arra = {2,3,6,4,31,6,5};
        System.out.println("The average is " + logicalOp.averageArray(arra));
        String[] arrSrg = {"dog", "cat", "mouse", "bear"};
        System.out.println(logicalOp.isItThere(arrSrg, "cat"));
        int[] arrayRec = {2,4,5,6,3,2,4};
        System.out.println(logicalOp.isItReceived(arrayRec,5));
        logicalOp.lines();
        int[] arry = {2,5,6,4,9,7};
        System.out.println(Arrays.toString(logicalOp.onlyOne(arry, 4)));
        int[] arRa = {3,6,5,6,7};
        System.out.println(logicalOp.theSmallerOne(arRa));
        System.out.println(" ");
        int[] ar1 = {3,2,5,6,7,8};
        int[] ar2 = new int[6];
        logicalOp.arrayPopulate(ar1,ar2);
        List numbers = new ArrayList(Arrays.asList(2,3,5,6,4,3,2,1));
        logicalOp.displayList(numbers);
        List<Integer> nums = new ArrayList<>(Arrays.asList(111,34,15,5,24,33,2,1));
        logicalOp.addNumberToList(nums,6);
        System.out.println(" ");
        List<Integer> numbs = new ArrayList<>(Arrays.asList(3,4,6));
        logicalOp.exListThree(numbs, 8);
        List<Integer> lst = new ArrayList<>(Arrays.asList(2,31,3,4));
        logicalOp.displayReverse(lst);
        List<String> srg1 = new ArrayList<>(Arrays.asList("dog", "frog", "bird"));
        logicalOp.mergeLists(srg1,1,"CAT");
        List<Integer> ints = new ArrayList<>(Arrays.asList(24,312,32,24));
        logicalOp.addOnFirstPosition(ints,3);
        List<Integer> numberss = new ArrayList<>(Arrays.asList(2,3,4,1));
        logicalOp.whatPosition(numberss);
        List<Integer> big = new ArrayList<>(Arrays.asList(55,3,1,2));
        System.out.println(logicalOp.theBiggestNum(big));
        int[] arrayy = {2,3,4,5,3,8};
        logicalOp.numbersOfArray(arrayy, 9);
        System.out.println(" ");
        logicalOp.wait(5);
        System.out.println(" ");
        logicalOp.insertInArr();
        System.out.println(" ");
        logicalOp.smallerAndBigger();
        System.out.println(" ");
        logicalOp.reverseArray();
        System.out.println(" ");
        logicalOp.findDuplicates();
        System.out.println(" ");
        logicalOp.shareNumbers();
        System.out.println(" ");
        logicalOp.sortTheArray();


    }
    public static void afisare(){
        System.out.println(" +\"\"\"\"\"+");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  |");
        System.out.println(" | '-' |");
        System.out.println(" +-----+");
    }

    public static void printHelloName(){
        System.out.println("Hello");
        System.out.println("Adelina");
    }

    public static float temperatura(int a){

        float c = (float)5/9 * (a -32);
        return c;

    }

    public static float distanta(float a){

        float distInch = a * 39.37f;
        return distInch;
    }

    public static void viteza(float dist,float ore, float min, float sec){
        float seco = ore * 3600 + min * 60 + sec;
        float h = ore + min / 60.0f + sec/ 3600.0f;

        System.out.println((float)(dist / seco) + " meters /sec");
        System.out.println((float)(dist  / (1000 * h)) + " km / h");
        System.out.println((float)(dist  / (1609.0f * h)) + " miles / h"); ;
    }
    public static void sumOfNumbers(){

        int x = 10;
        float y= 6.5f;

        System.out.println("Suma dintre a si b este: " + (x + y));
    }

    public static void impartireNumere(){
        //3
        int impartire = 10/2;
        System.out.println("impartirea este egala cu " + impartire);
    }

    public static void operatiiNumere(){

        int a = -5 + 8*6;
        System.out.println("a este egal cu: " + a);

        double b = (55+9) % 9 ;
        System.out.println("b este egal cu: " + b);

        double c = 20 + -3*5 / 8;
        System.out.println("c este egal cu: " + c);

        double d = 5 + 15 / 3 * 2 - 8 % 3 ;
        System.out.println("d este egal cu: " + d);
    }

}
