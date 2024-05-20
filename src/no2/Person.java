public class Person {
    private String nama;
    private String alamat;
    private String nomorTelepon;
    private String email;

    public Person(String nama, String alamat, String nomorTelepon, String email) {
        this.nama = nama;
        this.alamat = alamat;
        this.nomorTelepon = nomorTelepon;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Kelas: Person, Nama: " + nama + ", Alamat: " + alamat + ", Nomor Telepon: " + nomorTelepon + ", Email: " + email;
    }
}
