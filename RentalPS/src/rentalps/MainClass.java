/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalps;

import java.util.Scanner;

/**
 *
 * @author muhfikriw
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //
        
        System.out.println("----- INPUT -----");
        
        // mencari id pelanggan
        member m = new member();
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan ID Member              : ");
        m.member = input.nextLine();
        
        
        // pengecekan id
        int n = m.indexmember();
        if(n < 0){
            System.out.println("");
            System.out.println("id member tidak ada dalam data");
            System.exit(0);
        }
        
        
        //input tanggal
        tanggal t = new tanggal();
        t.inputtanggal();

        System.out.println("\n\n----- OUTPUT -----");
        System.out.println("");

        
        //pengecekan jenis membership ( silver(1) /gold(2) /platinum(3) )
        int x = m.jenismember();
        switch (x){
            case 1:
                silver s = new silver();
                s.disc = 1;
                s.sewa = 25000;
                s.poin = 1;
                s.banyakhari = t.banyakhari();
                
                //output tanggal pengembalian
                System.out.println("");
                t.outputtanggal();
                System.out.println("");
                
                //attribut dari membership
                System.out.println("Total Sewa	: " + s.totalsewa());
                System.out.println("Jumlah Poin	: " + s.poin());
                break;
                
            case 2:
                gold g = new gold();
                g.disc = 2;
                g.sewa = 30000;
                g.poin = 5;
                g.cashback = 5000;
                g.banyakhari = t.banyakhari();
                System.out.println(g.sewa);
                
                //output tanggal pengembalian
                System.out.println("");
                t.outputtanggal();
                System.out.println("");
                
                //attribut dari membership
                System.out.println("Total Sewa	: " + g.totalsewa());
                System.out.println("Jumlah Poin	: " + g.poin());
                System.out.println("Jumlah Cashback : " + g.cashback());
                break;
                
            case 3:
                platinum p = new platinum();
                p.disc = 3;
                p.sewa = 45000;
                p.poin = 10;
                p.cashback = 10000;
                p.pulsa = 5000;
                p.banyakhari = t.banyakhari();
                
                //output tanggal pengembalian
                System.out.println("");
                t.outputtanggal();
                System.out.println("");
                
                //attribut dari membership
                System.out.println("Total Sewa	: " + p.totalsewa());
                System.out.println("Jumlah Poin	: " + p.poin());
                System.out.println("Jumlah Cashback : " + p.cashback());
                System.out.println("Bonus Pulsa     : " + p.pulsa());
                break; 
        }
    }
}
