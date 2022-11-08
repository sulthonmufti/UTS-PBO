public class Dosen extends Karyawan{
    public Dosen(int no_pegawai, String nama, String alamat, String tanggal_lahir, String jenis_kelamin, int thn_masuk, double gaji){
        super(no_pegawai,nama, alamat, tanggal_lahir, jenis_kelamin, thn_masuk, gaji);
    }

    public double total_gaji(double bonus){
        return gaji = gaji() + (bonus * 100000);
    }

    public String jurusan(String jurusan){
        return jurusan;
    }

    public int no_induk(int no_induk){
        return no_induk;
    }



}
