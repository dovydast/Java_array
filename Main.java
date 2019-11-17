package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int [] Skaiciai  = {4,12,122,-6,-12,-1,-69,36,-199,21,19};
        System.out.println("Lyginiu skaiciu suma = " +skaiciuotiSuma(Skaiciai));
        System.out.println("Lyginiu skaiciu kiekis = " + skaiciuotiKieki(Skaiciai));
        System.out.println("Lyginiu skaiciu vidurkis = " + skaiciuotiVidurki(Skaiciai));
        System.out.println("Didziausias MAX skaicius = " + ieskotiMax(Skaiciai));
        System.out.println("Maziausias MIN skaicius = " + ieskotiMin(Skaiciai));
        System.out.println();
        System.out.println("Masyvas pries sukeitima");
        spausdintiMasyva(Skaiciai);
        System.out.println();
        System.out.println();
        System.out.println("Masyvas po reiksmiu sukeitimo");
        sukeistiMaxMin(Skaiciai);
        System.out.println();
        System.out.println();
        System.out.println("Maksimalus nelyginis teigiamas skaicius - " + ieskotiNelyginiMax(Skaiciai));
    }
        /*
        Funkcija skaiciuojanti masyvo lyginiu elementu suma
        @param A - masyvas Skaiciai aprasytas main funkcijoje
        @return grazina suskaiciuota suma
         */
    public static int skaiciuotiSuma(int A[]){
        int suma = 0;
        for(int i = 0; i < A.length; i++){
            if(A[i] % 2 == 0){
                suma += A[i];
            }
        }
        return suma;
    }
        /*
      Funkcija skaiciuojanti masyvo lyginiu elementu kieki
      @param A - masyvas Skaiciai aprasytas main funkcijoje
      @return grazina suskaiciuota kieki
       */
    public static int skaiciuotiKieki(int A[]){
        int kiekis = 0;
        for(int i = 0; i < A.length; i++){
            if(A[i] % 2 == 0){
                kiekis += 1;
            }
        }
        return kiekis;
    }
        /*
      Funkcija skaiciuojanti masyvo lyginiu elementu vidurki
      @param A - masyvas Skaiciai aprasytas main funkcijoje
      @return grazina suskaiciuota kieki
       */
    public static double skaiciuotiVidurki (int A[]){
        int suma = skaiciuotiSuma(A);
        int kiekis = skaiciuotiKieki(A);
        double vidurkis = 0;
        if (kiekis > 0){
            vidurkis = (double) suma /  (double) kiekis;
        }
        return vidurkis;
    }
        /*
     Funkcija ieskanti didziausios reiksmes indeksa masyve
     @param A - masyvas Skaiciai aprasytas main funkcijoje
     @return grazina didziausia rasta reiksme
      */
    public static int  ieskotiMaxindex (int A[]){
        int  max = Integer.MIN_VALUE;
        int index = 0;
        for(int i = 0; i < A.length; i++){
            if (A[i] > max){
                max = A[i];
                index = i;
            }
        }
        return index;
    }
    /*
   Funkcija ieskanti didziausios reiksmes masyve
   @param A - masyvas Skaiciai aprasytas main funkcijoje
   @return grazina didziausia rasta reiksme
    */
    public static int  ieskotiMax (int A[]){
        int  max = Integer.MIN_VALUE;
        for(int i = 0; i < A.length; i++){
            if (A[i] > max){
                max = A[i];
            }
        }
        return max;
    }
        /*
      Funkcija ieskanti ieskanti maziausia lygini skaiciu
      @param A - masyvas Skaiciai aprasytas main funkcijoje
      @return grazina maziausia rasta reiksme
       */
    public static int ieskotiMin (int A[]){
        int min = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < A.length; i++){
            if (A[i] < min){
                min = A[i];
            }
        }
        return  min;
    }
        /*
      Funkcija ieskanti maziausios reiksmes indeksa masyve
      @param A - masyvas Skaiciai aprasytas main funkcijoje
      @return grazina didziausia rasta reiksme
       */
    public static int ieskotiMinindex (int A[]){
        int min = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < A.length; i++){
            if (A[i] < min){
                min = A[i];
                index = i;
            }
        }
        return  index;
    }
    /*
  Funkcija ieskanti maksimalu nelygini skaiciu
  @param A - masyvas Skaiciai aprasytas main funkcijoje
  @return grazina didziausia nelygine reiksme
   */
    public static int ieskotiNelyginiMax (int A[]){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < A.length; i++){
            if (A[i] > max && A[i] % 2 != 0){
                max = A[i];
            }
        }
        return max;
    }
    /*
    Funkcija spausdinanti masyvo elementus pries pakeitima
    @param A - masyvas Skaiciai aprasytas main funkcijoje
     */
    public static void spausdintiMasyva(int A[]){
        for (int i = 0; i < A.length ; i++){
            System.out.print(A[i] + " " );
        }
    }
        /*
       Funkcija sukeicianti min ir max reiksmes
       @param A - masyvas Skaiciai aprasytas main funkcijoje
        */
    public static void sukeistiMaxMin(int A[]){
        int  minIndex = ieskotiMaxindex(A);
        int  maxIndex = ieskotiMinindex(A);
        int temp = A[maxIndex];
        A[maxIndex] = A[minIndex];
        A[minIndex] = temp;
        spausdintiMasyva(A);
    }
}