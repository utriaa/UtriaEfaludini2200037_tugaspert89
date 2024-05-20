public class Student extends Person {
    public static final String MAHASISWA_BARU = "Mahasiswa Baru";
    public static final String MAHASISWA_TAHUN_KEDUA = "Mahasiswa Tahun Kedua";
    public static final String JUNIOR = "Junior";
    public static final String SENIOR = "Senior";

    private String statusKelas;

    public Student(String nama, String alamat, String nomorTelepon, String email, String statusKelas) {
        super(nama, alamat, nomorTelepon, email);
        this.statusKelas = statusKelas;
    }

    @Override
    public String toString() {
        return "Kelas: Student, Nama: " + super.toString() + ", Status Kelas: " + statusKelas;
    }
}
