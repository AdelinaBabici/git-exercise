package main;

public class Calculator {

// In proiectul de Calculator, in clasa Calculator, supraincarcati toate metodele conform principiului polimorfismului. Creati cel putin cate doua metode polimorfe pentru fiecare metoda pe care o aveti in clasa.

    public int adunare(int a, int b){

        int res = a + b;

        return res;

    }
    public float adunare(float a, float b){
        float res = a + b;

        return res;
    }
    public int adunare(int a, int b, int c){
        int res = a + b + c;

        return res;
    }





    public int scadere(int a, int b){

        int res = a - b;

        return res;

    }
    public float scadere(float a, float b, float c){
        float res = a - b - c;

        return res;
    }
    public double scadere(double a, double b){
        double res = a - b;

        return res;
    }


    public int inmultire(int a, int b){

        int res = a * b;

        return res;

    }
    public int inmultire(int a, int b, int c, int d){

        int res = a * b * c * d;

        return res;

    }
    public double inmultire(double a, double b){

        double res = a * b;

        return res;

    }



    public int impartire(int a, int b){

        int res = a / b;

        return res;

    }
    public float impartire(float a, float b){

        float res = a / b;

        return res;

    }
    public double impartire(double a, double b){

        double res = a / b;

        return res;

    }

    public  int medieNumere(int a, int b, int c){

        int res = (a + b + c) / 3;

        return res;

    }
    public  float medieNumere(float a, float b, float c){

        float res = (a + b + c) / 3;

        return res;

    }
    public  double medieNumere(double a, double b, double c){

        double res = (a + b + c) / 3;

        return res;

    }

    public  int restImpartireNumere(int a, int b){

        int res = a % b;

        return res;

    }
    public  float restImpartireNumere(float a, float b){

        float res = a % b;

        return res;

    }
    public  double restImpartireNumere(double a, double b){

        double res = a % b;

        return res;

    }

}
