

//NAMA  : MUHAMMAD SULTHON MUFTI
//NIM   : 21000181213
//KELAS : D


public class Main {
    public static void main(String[] args) {

        Dosen dsn = new Dosen(123,"Admad  Sandi", "Jogja","20 Juni 1999", "Laki - laki",2012, 2000000);

        System.out.println("DATA DOSEN :");
        System.out.println("No Pegawai     : " +dsn.no_pegawai);
        System.out.println("Nama Dosen     : " +dsn.nama);
        System.out.println("Jurusan        : " +dsn.jurusan("Pemgrograman Berorientasi Objek"));
        System.out.println("No Induk Dosen : " +dsn.no_induk(19000023));
        System.out.println("Alamat         : " +dsn.alamat);
        System.out.println("Tanggal Lahir  : " +dsn.tanggal_lahir);
        System.out.println("Jenis Kelamin  : " +dsn.jenis_kelamin);
        System.out.println("Tahun Masuk    : " +dsn.thn_masuk);
        System.out.println("Gaji Pokok     : " +dsn.gaji());
        System.out.println("Total gaji     : " +dsn.total_gaji(24));

        System.out.println("=================================");

        Tendik tndk = new Tendik(178, "Asih sulasih", "Bantul", "15 Januari 1993", "Perempuan", 2018, 200000);

        System.out.println("DATA TENDIK :");
        System.out.println("No Pegawai     : " +tndk.no_pegawai);
        System.out.println("Nama Dosen     : " +tndk.nama);
        System.out.println("Alamat         : " +tndk.alamat);
        System.out.println("Tanggal Lahir  : " +tndk.tanggal_lahir);
        System.out.println("Jenis Kelamin  : " +tndk.jenis_kelamin);
        System.out.println("Tahun Masuk    : " +tndk.thn_masuk);
        System.out.println("Gaji Pokok     : " +tndk.gaji());
        System.out.println("Total gaji     : " +tndk.total_gaji(20));
    }
}