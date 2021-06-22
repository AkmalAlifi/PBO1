package Model;

import java.sql.SQLOutput;
//superClass/Parent-Class
public class Handphone
{
    // Atribut
    public String merek;
    public String tipe;
    public String warna;
    public String tahun;
    public String buatan;
    public String layar;
    public String kontak;
    public String deskripsi;

    public void TampilkanInfoLaptop(){
        System.out.println("====================================");
        System.out.println("Merek Handphone :"+merek);
        System.out.println("Tipe Handphone :"+tipe);
        System.out.println("Warna Handphone :"+warna);
        System.out.println("Tahun Handphone :"+tahun);
        System.out.println("Buatan Handphon :"+buatan);
        System.out.println("Layar Handphone :"+layar);
        System.out.println("Kontak Handphone :"+kontak);
        System.out.println("Deskripsi Handphone :"+deskripsi);
    }
    public void TampikanInfoHandphone(){
        System.out.println("====================================");
        System.out.println("Merek Handphone :"+merek);
        System.out.println("Tipe Handphone :"+tipe);
        System.out.println("Tahun Handphone :"+tahun);
        System.out.println("Layar Handphone :"+layar);
    }
    public boolean create(){
        String insertCreate = "INSERT INTO HANDPHONE VALUES ('"+merek"','"+tipe"','"+tahun+"')";
        System.out.println(insertCreate);
        boolean berhasil = true;
        if(berhasil){
            return true;
        }else{
            return false;
        }
    }
    public boolean create(String tipe){
        String insertCreate = "INSERT INTO HANDPHONE VALUES TIPE HANDPHONE "+ tipe;
        System.out.println(insertCreate);
        return false;
    }
}
