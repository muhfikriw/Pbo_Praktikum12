/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalps;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class tanggal {
    private int d1,m1,y1,d2,m2,y2,d,m,y,banyakhari;
    
    // method untuk input tanggal peminjaman
    void inputtanggal(){
        Scanner input = new Scanner(System.in);
        
        // input tanggal pinjam
        System.out.print("Masukkan Tanggal Pinjam (1-31) 	: ");
        d1 = input.nextInt();
        System.out.print("Masukkan Bulan Pinjam (1-12)	: ");
        m1 = input.nextInt();
        System.out.print("Masukkan Tahun Pinjam           : ");
        y1 = input.nextInt();
        
        // input tanggal pengembalian
        System.out.print("Masukkan Tanggal Kembali (1-31) : ");
        d2 = input.nextInt();
        System.out.print("Masukkan Bulan Kembali (1-12)	: ");
        m2 = input.nextInt();
        System.out.print("Masukkan Tahun Kembali          : ");
        y2 = input.nextInt();
    }

    
    // method untuk output tanggal pinjam
    void outputtanggal(){
        LocalDate from = LocalDate.of(y1, m1, d1);
        LocalDate to = LocalDate.of(y2, m2, d2);

        Period period = Period.between(from, to);
        
        System.out.println("Tanggal Pinjam	: " + d1 + "-" + m1 + "-" + y1);
        System.out.println("Tanggal Kembali	: " + d2 + "-" + m2 + "-" + y2);
        System.out.print("Lama Sewa	: ");
        System.out.println( banyakhari() +" hari");
    }
    
    // method untuk menghitung banyak hari peminjaman
    public int banyakhari(){
        LocalDate from = LocalDate.of(y1, m1, d1);
        LocalDate to = LocalDate.of(y2, m2, d2);

        Period period = Period.between(from, to);
        
        
        d = period.getDays();
        m = period.getMonths()*30;
        y = period.getYears()*360;
        
        banyakhari = d + m + y;
        return  banyakhari;
    }
}
