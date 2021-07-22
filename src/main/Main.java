package main;

public class Main {

    public static void main(String[] args){


        printHelloName();

        sumOfNumbers();

        impartireNumere();

        operatiiNumere();
        afisare();

        System.out.println("Rezultatul adunarii este = " + adunare(4,5));
        System.out.println("Rezultatul scaderii este = " + scadere(12,5));
        System.out.println("Rezultatul inmultirii este = " + inmultire(4,5));
        System.out.println("Rezultatul impartirii este = " + impartire(8,4));
        System.out.println("Rezultatul mediei este = " + medieNumere(8,4, 9));
        System.out.println("Rezultatul restului este = " + restImpartireNumere(9,4));
        System.out.println("Temperatura in celsius este: " + temperatura(120));
        System.out.println("Distanta in inch este: " + distanta(120));
        viteza(1000, 10, 5,7);

    }


    public static void printHelloName(){
        System.out.println("Hello");
        System.out.println("Adelina");
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

    public static int adunare(int a, int b){

        int res = a + b;

        return res;

    }
    public static int scadere(int a, int b){

        int res = a - b;

        return res;

    }
    public static int inmultire(int a, int b){

        int res = a * b;

        return res;

    }
    public static int impartire(int a, int b){

        int res = a / b;

        return res;

    }

    public static int medieNumere(int a, int b, int c){

        int res = (a + b + c) / 3;

        return res;

    }

    public static int restImpartireNumere(int a, int b){

        int res = a % b;

        return res;

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

    public static void afisare(){
        System.out.println(" +\"\"\"\"\"+");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  |");
        System.out.println(" | '-' |");
        System.out.println(" +-----+");
    }

}
