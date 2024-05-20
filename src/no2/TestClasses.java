public class TestClasses {
    public static void main(String[] args) {
        Person orang = new Person("Shazia Alatas", "Jl. Utama 123", "555-5555", "shaniaa@gmail.com");
        Student mahasiswa = new Student("Anita Wijaya", "Jl. Manggis 456", "555-1234", "anitawijaya@gmail.com", Student.SENIOR);
        MyDate tanggalSewa = new MyDate(2020, 5, 15);
        Employee karyawan = new Employee("Citra Putri", "Jl. Sarijadi 789", "555-9876", "citraputri@gmail.com", "Ruang 101", 50000, tanggalSewa);
        Faculty fakultas = new Faculty("Karel Diandra", "Jl. Maple 101", "555-6789", "kareldian@gmail.com", "Ruang 202", 75000000, tanggalSewa, "9am-5pm", "Professor");
        Staff staf = new Staff("Ibrahim Emran", "Jl. Sena 202", "555-2468", "emranibra@gmail.com", "Ruang 303", 40000000, tanggalSewa, "Manager");

        System.out.println(orang);
        System.out.println(mahasiswa);
        System.out.println(karyawan);
        System.out.println(fakultas);
        System.out.println(staf);
    }
}
 