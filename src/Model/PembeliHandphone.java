package Model;

//SubClass/Child-Class
public class PembeliHandphone extends Handphone {

    public String namapembeliHandphone;
    public String namapenjualHandphone;
    public String jumlahHandphoneyangdibeli;

    public void infopenjualHandphone(){
        System.out.println("=============================");
        System.out.println("Nama Pembeli Handphone :"+namapembeliHandphone);
        System.out.println("Nama Riseller Cemilan :"+namapenjualHandphone);
        System.out.println("jumlah Handphone Yang Dibeli :"+jumlahHandphoneyangdibeli);
    }
    public void jumlahinfo(){
        String jc = "INSERT INTO HANDPHONE VALUES ('"+jumlahHandphoneyangdibeli+"')";
        System.out.println(jc);
    }
}
