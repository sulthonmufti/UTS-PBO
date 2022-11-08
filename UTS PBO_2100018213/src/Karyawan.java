public class Karyawan {
    protected int no_pegawai, thn_masuk;
    protected double gaji;
    protected String nama, alamat, tanggal_lahir, jenis_kelamin;

    public Karyawan(int no_pegawai, String nama, String alamat, String tanggal_lahir, String jenis_kelamin, int thn_masuk, double gaji){
        this.no_pegawai = no_pegawai;
        this.nama = nama;
        this.alamat = alamat;
        this.tanggal_lahir = tanggal_lahir;
        this.jenis_kelamin = jenis_kelamin;
        this.thn_masuk = thn_masuk;
        //gaji = 2000000;
    }

    public double gaji(){
        return 2000000;
    }



}

