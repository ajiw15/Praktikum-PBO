package Aji07209SistemInformasiPendataanKorbanBencana;
import java.util.Date;

public class Aji07209KorbanEntity {
    String Aji07209_nama,Aji07209_pekerjaan,Aji07209_goldarah,
            Aji07209_agama,Aji07209_jeniskelamin, Aji07209_nik,Aji07209_notelp,Aji07209_bantuan;
    int  Aji07209_indexstatus;
    Date Aji07209_TanggalLahir;
    
       public Aji07209KorbanEntity(String Aji07209_nama, String Aji07209_kerja, 
               String Aji07209_goldar, String Aji07209_agama, 
               String Aji07209_gender, String Aji07209_bantuan, String Aji07209_nik,
               String Aji07209_notelp, Date Aji07209_tanggal,int Aji07209_indexstatus) {
        this.Aji07209_nama = Aji07209_nama;
        this.Aji07209_pekerjaan = Aji07209_kerja;
        this.Aji07209_goldarah = Aji07209_goldar;
        this.Aji07209_agama = Aji07209_agama;
        this.Aji07209_jeniskelamin = Aji07209_gender;
        this.Aji07209_bantuan = Aji07209_bantuan;
        this.Aji07209_nik = Aji07209_nik;
        this.Aji07209_notelp = Aji07209_notelp;
        this.Aji07209_TanggalLahir = Aji07209_tanggal;
        this.Aji07209_indexstatus = Aji07209_indexstatus;
    }
 }

    
    
