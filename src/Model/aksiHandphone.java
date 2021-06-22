package Model;

public class aksiHandphone {
    public static void main(String[] args){

        //Object Class 1
        Handphone Handphone = new Handphone();
        Handphone.merek = "Samsung";
        Handphone.tipe = "J2";
        Handphone.warna = "Silver";
        Handphone.tahun = "2012";
        Handphone.buatan = "Singapore";
        Handphone.layar = "5.1 inc";
        Handphone.kontak = "08127845xxxx";
        Handphone.deskripsi = "tahan banting";
        Handphone.TampilkanAtribut();
        Handphone.create();
        Handphone.create("Samsung J2");

        //Object Class 2
        PembeliHandphone pembeli = new PembeliHandphone();
        pembeli.merek = "Iphone";
        pembeli.tipe = "x";
        pembeli.warna = "Merah";
        pembeli.tahun = "2018";
        pembeli.buatan = "America";
        pembeli.layar = "6.2 inc";
        pembeli.kontak = "+62 823 xxxx xxxx";
        pembeli.deskripsi = "kamera jernih";
        pembeli.TampilkanAtribut();
        pembeli.create();
        pembeli.create("Iphone Akmal");

        //Constructor dengan methode (object)
        Handphone hp1 = new Handphone();
        hp1.TampilkanAtribut();
        Handphone hp2 =new Handphone();
        hp2.TampilkanAtribut();

        Handphone hp3 = new Handphone("mito","exp");
        hp3.TampikanInfoHandphone();
        Handphone hp4 = new Handphone("Asus","ROG");
        hp4.TampilkanAtribut();

        Handphone hp5 = new Handphone("Realme","F1");
        hp5.TampikanInfoHandphone();
        Handphone hp6 = new Handphone("Xiomi","note7");
        hp6.TampilkanAtribut();

        //Overriding
        PembeliHandphone riding = new PembeliHandphone();
        riding.create();
        riding.create("Samsung");
    }
}
