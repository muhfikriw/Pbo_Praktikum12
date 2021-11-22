/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalps;

/**
 *
 * @author Asus
 */
public class silver{
    //attribute yang digunakan untuk membership (silver,gold,platinum)
    public int disc, sewa, poin, cashback,pulsa,banyakhari;
    
    //method poin
    int poin(){
        int banyakpoin = poin*banyakhari;
        return banyakpoin;
    }
    
    //method untuk menghitung total biaya sewa selama n hari
    int totalsewa(){
        int totalsewa = (sewa*(100-disc)/100)*banyakhari;
        return totalsewa; 
    }
}
