/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117082_latihan19_saldotabungan;

/**
 *
 *  Nama : WIDIAMEGA K
* Kelas : IF3
* NIM   : 10117082
* Deskripsi Program : program ini berisi program untuk menampilkan saldo 
*tabungan dalam 6 bulan dengan bunga 15%
**/
public class PBO3_10117082_Latihan19_SaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int saldoAwal = 2500000;
        int bunga = 15;
        int jumlahBunga;
        int lamaBulan = 6;
        
      
        
        for(int i = 1; i <= lamaBulan; i ++){
            
            jumlahBunga = saldoAwal*bunga/100;
            saldoAwal += jumlahBunga;
            
            String mataUang = String.format("Rp.%,3d",saldoAwal).replaceAll(","
            +"",".");
                 
            System.out.printf("Saldo dibulan ke-"+i+" %s%n",mataUang);
       
        }
        }
    
}
