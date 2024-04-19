import java.util.*;

public class main {
    public static void main(String[] args) {
        Map<String, mahasiswa> listMahasiswa = new HashMap<>();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Masukkan Data Mahasiswa\n2. Hapus Data Mahasiswa\n3. Input Nilai Mahasiswa\n4. Tampilkan Nilai Mahasiswa\n5. Exit");
            System.out.print("Pilih menu : ");
            int choose = input.nextInt();
            input.nextLine();

            switch (choose) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    String nim = input.nextLine();
                    System.out.print("Masukkan kelas: ");
                    String kelas = input.nextLine();
                    System.out.print("Masukkan nama mahasiswa: ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan nilai mahasiswa: ");
                    double nilai = input.nextDouble();
                    input.nextLine();
                    mahasiswa mahasiswa = new mahasiswa(nim, kelas, nama, nilai);
                    listMahasiswa.put(nim, mahasiswa);
                    break;
                case 2:
                    System.out.print("Masukkan NIM yang akan dihapus: ");
                    String nimDelete = input.nextLine();
                    listMahasiswa.remove(nimDelete);
                    break;
                case 3:
                    System.out.print("Masukkan NIM: ");
                    String masukkanNIM = input.nextLine();
                    System.out.print("Masukkan kelas: ");
                    String masukkanKelas = input.nextLine();
                    System.out.print("Masukkan nama: ");
                    String masukkanNama = input.nextLine();
                    System.out.print("Masukkan nilai: ");
                    double masukkanNilai = input.nextDouble();
                    input.nextLine();
                    mahasiswa mahasiswaInput = new mahasiswa(masukkanNIM, masukkanKelas, masukkanNama, masukkanNilai);
                    listMahasiswa.put(masukkanNIM, mahasiswaInput);
                    break;
                case 4:
                    if (listMahasiswa.isEmpty()) {
                        System.out.println("Data masih kosong.");
                    } else {
                        System.out.println("Nilai:");
                        double totalNilai = 0;
                        for (mahasiswa Mahasiswa : listMahasiswa.values()) {
                            System.out.println(Mahasiswa + " - Nilai: " + Mahasiswa.getNilai());
                            totalNilai += Mahasiswa.getNilai();
                        }
                        double rataRata = totalNilai / listMahasiswa.size();
                        System.out.println("Rata-rata Nilai: " + rataRata);
                    }
                    break;
                case 5:
                    input.close();
                    System.exit(0);
                default:
                    System.out.println("Tidak Valid.");
                    break;
            }
        }
    }
}
