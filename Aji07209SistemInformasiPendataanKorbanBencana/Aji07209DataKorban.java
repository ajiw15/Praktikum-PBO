package Aji07209SistemInformasiPendataanKorbanBencana;

import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Aji07209DataKorban {
    private ArrayList <Aji07209KorbanEntity> datakorban =new ArrayList();
    Scanner Aji07209_input = new Scanner (System.in);
    Aji07209StatusEntity data1 = new Aji07209StatusEntity();
    
    public void Aji07209_Korban(String Aji07209_nama, String Aji07209_kerja, 
               String Aji07209_goldar, String Aji07209_agama, 
               String Aji07209_gender, String Aji07209_bantuan, String Aji07209_nik,
               String Aji07209_notelp, Date Aji07209_tanggal,int Aji07209_indexstatus){
    datakorban.add(new Aji07209KorbanEntity(Aji07209_nama,Aji07209_kerja,Aji07209_goldar,
            Aji07209_agama,Aji07209_gender,Aji07209_bantuan,Aji07209_nik,Aji07209_notelp,
            Aji07209_tanggal,Aji07209_indexstatus));
    }
    public void Aji07209_view (){
    System.out.println("\n DATA TERKINI KORBAN BENCANA");
    System.out.println(" ===========================");
    for(int i=0;i<datakorban.size();i++){
            System.out.println("NIK = "+datakorban.get(i).Aji07209_nik);
            System.out.println("Nama = "+datakorban.get(i).Aji07209_nama);
            System.out.println("Pekerjaan = "+datakorban.get(i).Aji07209_pekerjaan);
            System.out.println("No Telp = "+datakorban.get(i).Aji07209_notelp);
            System.out.println("Tanggal Lahir = "+new SimpleDateFormat("dd-MM-"
                    + "yyyy").format(datakorban.get(i).Aji07209_TanggalLahir));
            System.out.println("Jenis Kelamin = "+datakorban.get(i).Aji07209_jeniskelamin);
            System.out.println("Golongan Darah = "+datakorban.get(i).Aji07209_goldarah);
            System.out.println("Agama = "+datakorban.get(i).Aji07209_agama);
            System.out.println("Bantuan Yang Diberikan = "+datakorban.get(i).Aji07209_bantuan);
            System.out.println("Status = "+data1.Aji07209_Status
                    [datakorban.get(i).Aji07209_indexstatus]);
        }
    }
    private int carinik(String Aji07209_nik){
        int index=-1;
        for(int i=0;i <datakorban.size();i++) {
           if(Aji07209_nik.equals(datakorban.get(i).Aji07209_nik))
               index=i;
       }
       return index;
    }
     public void Aji07209_hapus(String Aji07209_nik){
        if(carinik(Aji07209_nik)!=-1){
             datakorban.remove(carinik(Aji07209_nik));
             System.out.println("Data Terhapus");
          }else{
              System.out.println("Data tidak ditemukan");
          }        
    }
    public void Aji07209_update(String Aji07209_nik){
        if(carinik(Aji07209_nik)!=-1){
            for(int i=0;i<data1.Aji07209_Status.length;i++){
                        System.out.println(i+". "+data1.Aji07209_Status[i]);
                    }
            System.out.print("Update Status = ");
            int statusbaru=Aji07209_input.nextInt();
            datakorban.get(carinik(Aji07209_nik)).Aji07209_indexstatus=statusbaru;
        }
        else {
            System.out.println("Data tidak Ditemukan");
        }
    }
  }


