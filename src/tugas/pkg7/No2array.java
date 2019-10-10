package tugas.pkg7;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sandi1713
 */
public class No2array {
    public static void main (String []args){
        //Array
        String [] nama = {"Sandy","Asep","Reza","Faisal","Deriyz"};
        int [] nilai = {10,11,13,45,15};
        String[][] ukuran = {{ "xl","xxl","l","m"},{"s","xs","xxl"}};
        System.out.println(ukuran[1][0]);
        System.out.println(nama[0]);
        System.out.println(nilai[2]);
        for(int i= 0; i<nama.length;i++){
            System.out.println(nama[i]+" = "+nilai[i]);
        }
        for(int j= 0; j<ukuran.length;j++){
            for(int k= 0; k<ukuran[j].length;k++){
                System.out.print(ukuran[j][k]+"\t");
            }
        }
    }
}
