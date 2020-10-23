/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulators;

/**
 *
 * @author User
 */
public class testerKalkulator {
    public static void main(String[] args){

        double Penambahan;
        double Pengurangan;
        double Perkalian;
        double Pembagian;


        Kalkulators kalkulator = new Kalkulators();
        Penambahan = Kalkulators.getPenambahan(20,2);
        Pengurangan = Kalkulators.getPengurangan(10.2,2);
        Perkalian = Kalkulators.getPerkalian(20,10);
        Pembagian = Kalkulators.getPembagian(11,2);

        System.out.println("Hasil penambahan adalah "+Penambahan);
        System.out.println("Hasil pengurangan adalah "+Pengurangan);
        System.out.println("Hasil perkalian adalah "+Perkalian);
        System.out.println("Hasil pembagian adalah "+Pembagian);
    }
}
