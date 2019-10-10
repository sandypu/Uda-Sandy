/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.pkg7;

/**
 *
 * @author sandi1713
 */
import java.util.ArrayList;
import java.util.Collections;

public class No2list {
    public static void main(String args[]){
        ArrayList nama = new ArrayList();
        nama.add("sandy");
        nama.add("Putra");
        nama.add("Utama");
        nama.add("Pratama");
        Collections.sort(nama);
        System.out.println(nama);
        
        for(int i=0;i<nama.size();i++){
            System.out.println(nama.get(i));
        }
        }
    }
