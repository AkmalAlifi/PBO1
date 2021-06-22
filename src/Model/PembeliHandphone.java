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

    //Getter And Setter

    public String getNamapembeliHandphone() {
        return namapembeliHandphone;
    }

    public void setNamapembeliHandphone(String namapembeliHandphone) {
        this.namapembeliHandphone = namapembeliHandphone;
    }

    public String getNamapenjualHandphone() {
        return namapenjualHandphone;
    }

    public void setNamapenjualHandphone(String namapenjualHandphone) {
        this.namapenjualHandphone = namapenjualHandphone;
    }

    public String getJumlahHandphoneyangdibeli() {
        return jumlahHandphoneyangdibeli;
    }

    public void setJumlahHandphoneyangdibeli(String jumlahHandphoneyangdibeli) {
        this.jumlahHandphoneyangdibeli = jumlahHandphoneyangdibeli;
    }

    //Overriding

    @Override
    public void TampilkanAtribut() {
        super.TampilkanAtribut();
    }

    @Override
    public boolean create() {
        return super.create();
    }
}
