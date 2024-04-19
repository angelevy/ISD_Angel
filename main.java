import java.util.*;

public class main {
    public static void main(String[] args) {
        Queue<String> list = new LinkedList<>();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println(
                    "1. Tambah Pekerjaan\n2. Tugas yg Pertama kali dikerjakan\n3. Hapus tugas yang sudah selesai\n4. menampilkan semua pekerjaan");
            int pilih = input.nextInt();
            switch (pilih) {
                case 1:
                    String tugas = input.next();
                    list.offer(tugas);
                    break;
                case 2:
                    System.out.println("\nanda harus mengerjakan " + list.peek() + " terlebih dahulu");
                    break;
                case 3:
                    list.poll();
                    break;
                case 4:
                    int i = 1;
                    for (String namatugas : list) {
                        System.out.println(i + ". " + namatugas);
                        i++;
                    }
                default:
                    System.out.println("salah input");
                    break;
            }
        }
    }
}