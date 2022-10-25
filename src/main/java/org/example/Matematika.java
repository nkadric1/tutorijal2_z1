package org.example;

public class Matematika {
    public static int Faktorijel(int n){ int f=1;
        while(n>=2){
            f=f*n;
            n--;
        }
        return f;
    }
    public static double Sinus(double n){
        int i=0;
        double s=0;
       n = n * Math.PI/180;
        int stepen = 1, predznak = 1;
        for(i=1;i<=10;i++, stepen+=2, predznak*=(-1)){
            s+=(Math.pow(n,stepen)/Faktorijel(stepen)) * predznak;
        }
        return s;
    }
}
