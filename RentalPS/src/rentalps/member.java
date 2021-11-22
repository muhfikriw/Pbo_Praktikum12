/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalps;

import java.util.ArrayList;
import static java.util.Collections.binarySearch;

/**
 *
 * @author Asus
 */
public class member{
    String member;
    
    // array untuk id pelanggan
    ArrayList<String> id = new ArrayList<String>();
    
    
    // array multidimensi untuk data pelanggan
    String[][] data = {
        {"Mr.X","silver"},{"Mr.Y","gold"},{"Mr.Z","platinum"}
    };
    
    
    //method untuk mengetahui index dari id pelanggan
    int indexmember(){
        // tambah data id
        id.add("M001");
        id.add("M002");
        id.add("M003");

        // mencari index array dari id pelanggan
        int index = binarySearch(id, member);
        return index;
    }

    
    //method untuk pengecekan jenis membership
    int jenismember(){
        int n = indexmember();
        String x = data[n][1];
        int a = 0;
        if (x == "silver") {
            a=1;
        } else if (x == "gold"){
            a=2;
        } else if (x == "platinum"){
            a=3;
        }
        System.out.println("ID Member       : " + id.get(n));
        System.out.println("Nama Member     : " + data[n][0]);
        System.out.println("Jenis Member    : " + data[n][1]);
        return a;
    }
}
