package main;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.*;

public class LogicalOp {

    // In clasa LogicalOp, creati o metoda de tip int, care sa se numeasca checkBiggerNumber(), si sa primeasca doua int-uri ca si parametrii.
    public int checkBiggerNumber(int first, int second) {

        if (first > second) {
            return first;
        } else {
            return second;
        }

    }
//Creati o metoda de tip String, care sa primeasca un parametru de tip String. Verificati daca textul ce vine ca si parametru este egal cu “FastTrackIT”. Daca da, atunci metoda sa returneze “Learning text comparison”. Daca nu, atunci metoda sa returneze “Got to try some more”.
    public String learningSchool(String first) {
        String second = "FastTrackIT";
        String pos = "Learning text comparison";
        String neg = "Got to try some more";

        if (first.equals(second)) {
            return pos;
        } else if (!first.equals(second)) {
            return neg;
        }
        return null;
    }
//Creati o metoda de tip String, care sa primeasca un parametru de tip String, si un parametru de tip int. Daca textul primit ca si parametru este egal cu “FastTrackIT”, si numarul primit ca si parametru este mai mic sau egal cu 3, returnati textul si numarul, in ordinea asta. Daca textul nu este “FastTrackIT” si numarul este mai mare sau egal cu 4, returnati numarul si textul, in ordinea asta.
    public String learningNumber(String first, int x) {
        String second = "FastTrackIT";
        String pos = "Learning text comparison";
        String neg = "Got to try some more";
        if (first.equals(second) & x <= 3) {
            return first + " " + x;
        } else if (!first.equals(second) & x >= 4) {
            return x + " " + first;
        }
        return null;
    }
//Creati o metoda de tip String, care sa primeasca un parametru de tip int. Daca numarul primit este mai mare de 8, SAU egal cu 6, atunci sa se returneze “The amount of snow this winter was(cm): “ si numarul. Daca nu, sa printeze “The forecast snow is(cm):” si numarul.
    public String snowSituation(int x) {
        String amount = "The amount of snow this winter was(cm): ";
        String forecast = "The forecast snow is(cm): ";
        if (x > 8 || x == 6) {
            return amount + x;
        } else {
            return forecast + x;
        }
    }
// Creati o metoda de tip String, care sa primeasca un parametru de tip numar. Daca numarul e mai mare decat 3, SI nu egal cu 4, returnati “The number is greater than 3 and not equal to 4”. Daca numarul este egal cu 4, returnati “The number is equal to 4”, iar daca numarul este mai mic de 3 returnati “The number is lower than 3”.
    public String numbersSituation(int x) {
        String s1 = "The number is greater than 3 and not equal to 4";
        String s2 = "The number is equal to 4";
        String s3 = "The number is lower than 3";
        if (x > 3 & x != 4) {
            return s1;
        } else if (x == 4) {
            return s2;
        } else if (x < 3) {
            return s3;
        }
        return null;
    }
//Creati o metoda care primeste un numar ca si parametru si sa afiseze ce numar a primit. Folosind constructia Switch-Case, verificati ce numar s-a primit si afisati textul "The number is:  x !" unde x trebuie sa reprezinte numarul apasat. Pentru exemplul de fata sa nu se foloseasca concatenarea stringului "The number is:" cu numarul de la parametru, ci sa se scrie intreg textul cu tot cu numar pentru fiecare caz din Switch-Case.
    public String guessTheNumber(int x) {

        switch (x) {
            case 2:
                return "The number is:  2 !";

            case 4:
                return "The number is:  4 !";

            case 5:
                return "The number is:  5 !";

            case 8:
                return "The number is:  8 !";

            default:
                return "Unknown value";
        }

    }
//Creati o metoda care sa se numeasca isNumberEven. Metoda trebuie sa primeasca ca parametru un numar, si sa returneze adevarat sau fals. Daca numarul e par sa returneze true iar daca e impar sa returnese false.
    public boolean isNumberEven(int x) {
        if (x % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
//Creati o metoda care sa se numeasca isEligibleToVote. Metoda sa primeasca ca si parametru un numar, care sa reprezinte varsta, iar metoda sa iti zica daca daca persoana are drept de vot. Daca varsta e peste 18, sa se returneze true iar daca nu, sa returneze false.
    public boolean isEligibleToVote(int x) {
        if (x >= 18) {
            return true;
        } else {
            return false;
        }
    }
//Creati o metoda care sa primeasca 3 numere ca si parametrii si sa returneze cel mai mare numar.
    public int theGreatestNum(int x, int y, int z) {
        if (x > y) {
            if (x > z) {
                return x;
            } else {
                return z;
            }
        } else if (y > z) {
            return y;
        } else {
            return z;
        }
    }

    //For loops
    //1Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru. Metoda sa verifice numarul primit, si sa afiseze in consola o numaratoare pana la 100, pornind de la numarul primit ca si parametru.
    public void numaratoare(int x) {
        for (int i = x; i < 100; i++) {
            x = x + 1;
            System.out.print(x + " , ");
        }
    }

    //2Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru. Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana la -100, pornind de la numarul primit ca si parametru.
    public void numaratoareInversa(int x) {
        for (int i = x; i > -100; i--) {
            x = x - 1;
            System.out.print(x + " , ");
        }
    }

    //3Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar. Metoda sa afiseze o numaratoare intre cele doua numere primite, pornind de la primul parametru primit, pana la cel de-al doilea(ex: daca int xe primul parametru iar int y  este cel de-al doilea, numaratoarea sa se faca de la x, la y.
    public void countingBetweenNumbers(int x, int y) {
        if(x < y) {
            for (int i = x; i <= y; i++) {
                System.out.print(x + " , ");
                x = x + 1;
            }
        }else{
            System.out.println("x is greater than y!");
        }

    }

    //4Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar. Metoda trebuie sa verifice care dintre cele doua numere este mai mare, si sa execute o numaratoare crescatoare de la cel mai mic la cel mai mare.(ex: daca int x e primul parametru iar int y  este cel de-al doilea, daca x  este mai mare decat y,  atunci numaratoarea sa fie de la y la x).
    public void comparingCountingNumbers(int x, int y) {
        if (x > y) {
            for (int i = y; i <= x; i++) {
                System.out.print(y + " , ");
                y = y + 1;
            }
        } else if (y > x) {
            for (int i = x; i <= y; i++) {
                System.out.print(x + " , ");
                x = x + 1;
            }
        }
    }

    //5Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100.
    public void evenNumbers() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " , ");
            }
        }

    }

    //6Creati o metoda in clasa LogicalOp care sa afiseze toate numerele impare de la 1 la 100.
    public void oddNumbers() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " , ");
            }
        }
    }

    //7Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar. Metoda sa adune toate numerele pana la 100, pornind de la numarul primit ca si parametru, iar la final sa returneze rezultatul.
    public void sumNumbers(int x) {
        int sum = 0;
        for (int i = x; i <= 100; i++) {
            sum += i;

        }
        System.out.println("The sum is = " + sum);
    }

    //8Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar. Metoda sa adune toate numerele pana la 100, pornind de la numarul primit ca si parametru, si sa calculeze media numerelor.
    public void averageOfNumbers(int x) {
        int sum = 0;
        int average = 0;
        int count = 0;
        for (int i = x; i <= 100; i++) {
            count++;
            sum += i;
            average = sum / count;
        }
        System.out.println("The arithmetic average is = " + average);
    }

    //9Creat o metoda in clasa LogicalOp care sa afiseze urmatorul tipar:
    public void asterisks() {
        String asterisk = "*";
        for (int i = 7; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(asterisk);
            }
            System.out.println();
        }
    }

    //WHILE LOOP
    //1
    public void countingFromX(int x) {

        while (x <= 100) {
            System.out.print(x + " , ");
            x = x + 1;
        }
    }

    //2
    public void countingReverse(int x) {
        while (x >= -100) {
            System.out.print(x + " , ");
            x = x - 1;
        }
    }

    //3 Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar. Metoda sa afiseze o numaratoare intre cele doua numere primite, pornind de la primul parametru primit, pana la cel de-al doilea(ex: daca int x e primul parametru iar int y  este cel de-al doilea, numaratoarea sa se faca de la x, la y.
    public void countingBetweenXY(int x, int y) {
        if (x <= y) {
            while (x <= y) {
                System.out.print(x + " , ");
                x++;
            }

        }else if (x >= y){
            while (x >= y){
                System.out.print(x + " , ");
                x = x -1;
            }
        }
    }
    //4.Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar. Metoda trebuie sa verifice care dintre cele doua numere este mai mare, si sa execute o numaratoare crescatoare de la cel mai mic la cel mai mare.

    public void compareXY(int x, int y){
        if (x > y) {

            while (x >= y) {
                System.out.print(y + " , ");
                y++;
            }
        } else if (y > x) {

            while (y >= x) {

                System.out.print(x + " , ");
                x++;
            }
        }
    }
    //5. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100.
    public void printEvenNumbers(){
        int count = 0;
            while (count <= 100) {
                System.out.print(count + " , ");
                count = count + 2;
            }
        }

        //6.Creati o metoda in clasa LogicalOp care sa afiseze toate numerele impare de la 1 la 100.
    public void printOddNumbers(){
        int count = 1;
        while (count <= 100) {
            System.out.print(count + " , ");
            count = count + 2;
        }
    }
    //7.Creati o metoda care sa adune toate numerele din intervalul 111 si 8899. Sa se afiseze suma totala, iar dupa aceea sa se calculeze si afiseze media numerelor din acel interval. Introduceti o variabila int count in metoda, pentru a numara toate numerele din interval.

    public void sumOfDefinedNums(){
        int count = 1;
        int min = 111;
        int max = 8899;
        int sum = 0;

        while(min <= max){
            sum += min;
            min++;
            count++;

        }
        System.out.println("suma este : " + sum);
        System.out.println("media este: " + sum/count);

    }
    //8.Creati o metoda care sa primeasca doi parametrii de tip numar, si sa returneze media numerelor divizibile cu 7, din acel interval. Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.

    public float divisibilityBySeven(int x, int y){
        int sum = 0;
        int count = 0;
        int aux;
        if(x>y)
        {
            aux = x;
            x = y;
            y = aux;
        }
        while (x <= y)
        {
            if (x % 7 == 0) {
                sum += x;
                count++;
            }
            x++;
        }
        if(count == 0) {
            return 0;
        }
            float average = sum / count;
            return average;

    }

    //9.Creati o metoda care sa afiseze primele 20 de numere din sirul lui Fibonacci.
    public void fibonacciNums(){
        int i = 1;
        int first = 0;
        int second = 1;
        while (i <= 20){
            System.out.print(first + " , ");
            int next = first + second;
            first = second;
            second = next;
            i++;
        }
    }
    //10.Creati o metoda numita CozaLozaWoza.
    public void CozaLozaWoza(){
        int x = 1;
        while(x <= 110) {
            for (int i = 0; i < 11; i++) {
                if ((x % 3 == 0) && (x % 5 == 0) && (x % 7 == 0)) {
                    System.out.print("CozaLozaWoza ");
                } else if ((x % 5 == 0) & (x % 7 == 0)) {
                    System.out.print("WozaLoza ");
                } else if (x % 3 == 0 & x % 7 == 0) {
                    System.out.print("CozaWoza ");
                } else if (x % 3 == 0 & x % 5 == 0) {
                    System.out.print("CozaLoza ");
                } else if (x % 7 == 0) {
                    System.out.print("Woza ");
                } else if (x % 5 == 0) {
                    System.out.print("Loza ");
                } else if (x % 3 == 0) {
                    System.out.print("Coza ");
                }else{
                    System.out.print(x + " ");
                }
                x++;
            }
            System.out.println();
        }




    }
// In clasa LogicalOp, creati o metoda care sa scrie pe un array de 100 de pozitii, valorile de la 1 la 100. Sa se afiseze progresul in consola pe tot parcursul.
    public void populateArray(){
        int [] myArray = new int[100];
        for (int i = 0; i < 100; i++){

            for (int j = 1; j <= 100; i++){
                myArray[i] = j;
                System.out.println(Arrays.toString(myArray) + " ");
                j++;
            }
            i++;
        }
    }
    //Creati o metoda care primeasca un parametru de tip array de numere intregi gol, si sa il returneze populat cu toate valorile pare de la 1 la 100. Apelati metoda in main() pentru a verifica daca functioneaza. Atentie, metoda returneaza un array, deci acesta va trebui surprins si afisat folosind o bucla.
    public int[] myArrays(int[] arr){
        int pos = 0;
        for (int i = 1; i <= 100; i++){
               if(i % 2 == 0) {
                   arr[pos] = i;
                   pos++;
               }
            }
        return  arr;
        }
        //Creati o metoda care sa primeasca un parametru de tip array de numere, si sa fie populat cu valori. Metoda sa calculeze si sa returneze media numerelor din array.

    public double averageArray(int[] arra){

        int sum =0;

        for(int i = 0; i < 7; i++){
            sum += arra[i];
        }
        double average = sum/arra.length;
        return average;
    }

    //Creati o metoda care sa primeasca un parametru de tip array de string-uri, populat cu valori, si un parametru de tip String. Metoda sa verifice daca valoarea string-ului primit se regaseste in array-ul primit, iar daca da sa returneze true iar daca nu, sa returneze false.
    public boolean isItThere(String[] arrSrg, String animal){

        for(int i = 0; i < arrSrg.length; i++){
            while (animal == arrSrg[i]){
                return true;
            }
        }
        return false;
    }

    //Creati o metoda care sa primeasca un parametru de tip array de numere, populat cu valori, si un parametru de tip numar. Metoda sa verifice daca numarul primit se afla in array-ul primit, si daca da, atunci sa returneze pozitia pe care se afla numarul.
    public int isItReceived(int[] arrayRec, int x){
        for(int i = 0; i < arrayRec.length;i++){
            while (x == arrayRec[i]){
                return i;
            }
        }
        return 0;
    }

   // Creati o metoda care sa afiseze urmatoarea grila, folosind un array:
   public void lines(){
        int[][] array = new int[10][10];
        for(int row = 0; row <10; row++){
            for( int col = 0; col < 10;col++){
                System.out.print("-");
            }
            System.out.println();
        }
   }
   //De refacut pentru duplicate**
   //Creati o metoda care sa primeasca un parametru de tip array de numere, populat cu valori, si un parametru de tip numar. Metoda sa verifice daca numarul exista in array, si daca da, sa returneze array-ul primit, fara acel numar.
    public int[] onlyOne(int[] arry, int x){
        int j = 0;
        int count = 1;
        int[] arry2 = new int[arry.length -  count];
        for(int i = 0; i < arry.length; i++){
                if (x != arry[i]) {

                        arry2[j] = arry[i];
                         j++;

                } else if (x == arry[i]) {
                    count++;
                }

            }
        return arry2;
        }

        //Creati o metoda care sa primeasca un array, si sa returneze al doilea cel mai mic numar din array.
    public int theSmallerOne(int[] arRa){

        int min;
        int secondMin;
        if(arRa[0] > arRa[1]){
            min = arRa[1];
            secondMin = arRa[0];
        }else{
            min = arRa[0];
            secondMin = arRa[1];
        }

        for(int i = 2; i < arRa.length; i++){
            if(arRa[i] < min) {
                secondMin = min;
                min = arRa[i];

            }else if((arRa[i] > min) && (arRa[i] < secondMin)){
                secondMin = arRa[i];

            }
            return secondMin;
        }
        return 0;

    }
//Creati o metoda care sa primeasca doi parametrii: un array populat cu valori, si un array gol. Metoda sa copieze toate valorile din primul array, parcurgandu-l, in cel de-al doilea.
    public void arrayPopulate(int[]ar1, int[] ar2){

        for (int i = 0; i < ar1.length; i++){
                ar2[i] = ar1[i];
                System.out.println(Arrays.toString(ar2) + " ");
        }
    }

//Lists
    //Scrieti o metoda Java, care sa primeasca parametru o Lista, si sa afiseze, pe rand, toate valorile din lista, fiecare pe rand nou.

    public void displayList(List numbers){

        for(int i =0; i < numbers.size(); i++){
            System.out.println(numbers.get(i));

        }
    }
    //Scrieti o metoda Java, care sa primeasca doi parametrii: un parametru sa fie o lista de numere, si celalalt un numar (real sau intreg). Metoda sa adauge numarul primit ca si parametru la final de lista.
    public void addNumberToList(List<Integer> nums, int x){
        nums.add(nums.size(),x);
        for(int i : nums){
            System.out.print(i + " ");
        }

    }
    //Scrieti o metoda Java, care sa primeasca doi parametrii: un parametru de tip Lista, iar celalalt un numar intreg. Sa se parcurga lista si sa afiseze, pe rand, toate valorile din lista, fiecare pe rand nou, pornind de la numarul intreg primit ca si parametru.
    public void exListThree(List<Integer> numbs, int x){
        numbs.add(0,x);
        for(int i : numbs){
            System.out.println(i);
        }
    }
    //Scrieti o metoda Java, care sa primeasca parametru o Lista, si sa afiseze, pe rand, toate valorile din lista, dar invers(de la capat la inceput).
    public void displayReverse(List<Integer> lst){

        Collections.reverse(lst);
        System.out.println(lst);

    }
    //Scrieti o metoda Java, care sa primeasca trei parametrii: unul de tip Lista de String-uri, unul de tip intreg, si unul de tip String. Metoda sa adauge parametrul de tip String in lista primita, iar parametrul de tip intreg reprezinta pozitia la care sa fie pus acel String.
    public void mergeLists(List<String> srg1, int integ, String srg2){
        srg1.add(integ,srg2);
        for (String i : srg1){
            System.out.println(i);
        }
    }
    //Scrieti o metoda Java, care sa primeasca doi parametrii. Primul dintre ei va fi o Lista, iar metoda sa ia al doilea parametru si sa il adauge pe prima pozitie din lista.
    public void addOnFirstPosition(List<Integer> ints, int x){
        ints.add(0,x);
        for (int i : ints){
            System.out.println(i);
        }
    }
    //Scrieti o metoda Java care sa primeasca parametru o Lista, si sa afiseze ce valori are lista, si ce pe ce pozitie. (Ex: “Pe pozitia 1 valoare este 4”).
    public void whatPosition(List<Integer> numberss){
        for(int i = 0; i < numberss.size(); i++){
            System.out.println("Pe pozitia " + i + " valoarea este " + numberss.get(i));
        }
    }
    //Scrieti o metoda Java care sa primeasca o Lista si sa returneze cel mai mare numar din ea.
    public int theBiggestNum(List<Integer> big){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < big.size();i++){
            if(big.get(i) > max){
                max = big.get(i);
            }
        }return max;
    }

//Lists
    //In clasa LogicalOp, creati o metoda care sa primeasca un array de numere ca si parametru, si un numar. Fara a folosi conditii, si folosind un try-catch, afisati valoarea de pe pozitia numarului primit, iar daca valoarea numarului este mai mare decat numarul de pozitii din array, afisati textul: "Inside catch, number too large".
    public void numbersOfArray(int[] array, int x){

            try {
                    System.out.println(array[x]);

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inside catch, number too large");
            }

    }

//In clasa LogicalOp, creati o metoda  'wait()'. Metoda sa nu returneze nimic, dar sa primeasca un parametru de tip int. In interiorul ei, tratati metoda Thread.sleep(), astfel incat metoda noastra sa primeasca valoarea in secunde, cat sa astepte. Ex: wait(5) -> asteapta 5 secunde.
        public void wait(int x) {
            long sleepy = x * 1000;
            try {
                Thread.sleep(sleepy);
                System.out.println("Heei");

            } catch (InterruptedException e) {
                System.out.println("The thread is interrupted.");
            }
        }
    }


