package Aji07209SistemInformasiPendataanKorbanBencana;

import java.util.Date;
import java.util.Scanner;

public class Aji07209SistemInformasiPendataanKorbanBencana {
   
    public static void main(String[] args) {
        Aji07209StatusEntity data1 = new Aji07209StatusEntity();
        Aji07209DataKorban data = new Aji07209DataKorban();
        System.out.println("INFORMASI KORBAN BENCANA");
        int pil;
        do {
            System.out.println("\n1.Input Data Korban");
            System.out.println("2.Cetak Data");
            System.out.println("3.Hapus");
            System.out.println("4.Update");
            System.out.println("5.Exit");
            System.out.print("pilih = ");
            pil = data.Aji07209_input.nextInt();
            switch (pil){
                case 1 :
                    System.out.print("Input NIK = ");
                    String Aji07209_nik = data.Aji07209_input.next();
                    System.out.print("Input Nama = ");
                    String Aji07209_nama = data.Aji07209_input.next();
                    System.out.print("Input Pekerjaan = ");
                    String Aji07209_kerja = data.Aji07209_input.next();
                    System.out.print("Input No Telp = ");
                    String Aji07209_notelp = data.Aji07209_input.next();
                    System.out.print("Input Tgl Lahir (mm/dd/yyyy) = ");
                    Date Aji07209_tanggal = new Date(data.Aji07209_input.next());
                    System.out.print("Input Jenis Kelamin = ");
                    String Aji07209_gender = data.Aji07209_input.next();
                    System.out.print("Input Golongan Darah = ");
                    String Aji07209_goldar = data.Aji07209_input.next();
                    System.out.print("Input Agama = ");
                    String Aji07209_agama = data.Aji07209_input.next();
                    System.out.print("Input Bantuan Yang Diberikan = ");
                    String Aji07209_bantuan = data.Aji07209_input.next();
                    for(int i=0;i<data1.Aji07209_Status.length;i++){
                        System.out.println(i+". "+data1.Aji07209_Status[i]);
                    }
                    System.out.print("Pilih Status Korban = ");
                    int Aji07209_indexstatus = data.Aji07209_input.nextInt();
                    
                 data.Aji07209_Korban(Aji07209_nama, Aji07209_kerja, Aji07209_goldar, 
                      Aji07209_agama, Aji07209_gender, Aji07209_bantuan, Aji07209_nik, 
                      Aji07209_notelp, Aji07209_tanggal, Aji07209_indexstatus);
                    break;
                case 2 :
                    data.Aji07209_view();
                    break;
                case 3 :
                    System.out.print("Data NIK berapa Yang ingin dihapus = ");
                    String hapus=data.Aji07209_input.next();
                    data.Aji07209_hapus(hapus);
                    break;
                case 4 :
                    System.out.print("Data NIK berapa Yang ingin diupdate = ");
                    String nik=data.Aji07209_input.next();
                    data.Aji07209_update(nik);
                    break;
            }
    }while (pil!=5);
  }  
}
   
