/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.text.DecimalFormat;

/**
 *
 * @author edisucipto
 */
public class KalkulasiUtils {
    
    
   public static double bobotHarapan(int jmlHari, double indeksPbbh, int bobotAwal){
       return (jmlHari * indeksPbbh) + bobotAwal;
   }
   
   public static double ransum(int bobot, double indeks){
       return bobot * indeks / 100;
   }
   
   public static double beratPakanByRasio(double rasio, double bahanKeringSapi){
       return rasio / 100 * bahanKeringSapi;
   }
   
   public static double bahanSegarPakan(double beratPakan, double bahanKeringPakan){
       return 100 / bahanKeringPakan * beratPakan;
   }
   
   public static double nilaiNutrisi(double nilai, double beratPakan){
       return nilai / 100 * beratPakan;
   }
   
   public static double kebProteinMin(double ransum){
       return 0.09 * ransum;
   }
   
   public static double kebEnergiMin(double ransum){
       return 0.5 * ransum;
   }
   
   
}
