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

    public void TampilkanAtribut(){
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
        String insertCreate = "INSERT INTO HANDPHONE VALUES ('"+merek+"','"+tipe+"','"+tahun+"')";
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

    //constructor

    public Handphone(){
        System.out.println("=================================");
        merek = "please Isi Nama Handphone";
        tipe =  "Please Isi Jenis Handphone";
        tahun = "Please Isi warna Handphone";
        layar = "Please Isi Layar Handphone";
    }
    public Handphone(String merekHandphone, String tipeHandphone){
        this.merek = merekHandphone;
        this.tipe = tipeHandphone;
    }
    public Handphone(String tahunHandphone, String layarHandphone, String merekHandphone){
        this.tahun = tahunHandphone;
        this.layar = layarHandphone;
        this.merek = merekHandphone;
    }

    //Getter And Setter

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getTahun() {
        return tahun;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    public String getBuatan() {
        return buatan;
    }

    public void setBuatan(String buatan) {
        this.buatan = buatan;
    }

    public String getLayar() {
        return layar;
    }

    public void setLayar(String layar) {
        this.layar = layar;
    }

    public String getKontak() {
        return kontak;
    }

    public void setKontak(String kontak) {
        this.kontak = kontak;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
}
