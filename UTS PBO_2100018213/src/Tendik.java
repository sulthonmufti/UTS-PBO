public class Tendik extends Karyawan{
    public Tendik(int no_pegawai, String nama, String alamat, String tanggal_lahir, String jenis_kelamin, int thn_masuk, double gaji){
        super(no_pegawai,nama, alamat, tanggal_lahir, jenis_kelamin, thn_masuk, gaji);
    }

    public double total_gaji(double bonus){
        return gaji = gaji() + (bonus * 50000);
    }
}
