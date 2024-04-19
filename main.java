import java.util.*;

public class main {
    public static void main(String[] args) {
        LinkedList<data> list = new LinkedList<>();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Masukkan tugas\n2. Hapus tugas\n3. Tampilkan semua tugas\n4. Keluar");
            int pilih = input.nextInt();
            input.nextLine();
            switch (pilih) {
                case 1:
                    System.out.println("Input Matkul : ");
                    String mataKuliah = input.nextLine();
                    System.out.println("Nama Tugas : ");
                    String namaTugas = input.nextLine();
                    System.out.println("Deadline : ");
                    String deadline = input.nextLine();
                    list.addFirst(new data(mataKuliah, namaTugas, deadline));
                    break;

                case 2:
                    System.out.println("1. Hapus tugas terakhir\n2. Hapus tugas sesuai mata kuliah\n3. Hapus tugas pertama");
                    int pilih2 = input.nextInt();
                    input.nextLine(); 

                    if (pilih2 == 1) {
                        list.removeLast();
                    } else if (pilih2 == 2) {
                        System.out.println("Masukkan nama mata kuliah:");
                        String namaMataKuliah = input.nextLine();

                        ListIterator<data> it1 = list.listIterator();
                        while (it1.hasNext()) {
                            if (it1.next().getMataKuliah().equals(namaMataKuliah)) {
                                it1.remove();
                                break;
                            }
                        }
                    } else if (pilih2 == 3) {
                        list.removeFirst();
                    } else {
                        System.out.println("Input salah");
                    }
                    break;

                case 3:
                    System.out.println("\n1. Urut dari akhir\n2. Urut dari awal");
                    ListIterator<data> it2 = list.listIterator();
                    int pilih3 = input.nextInt();
                    input.nextLine(); 

                    if (pilih3 == 1) {
                        System.out.println("\nMenampilkan daftar tugas dari akhir: ");
                        while (it2.hasNext()) {
                            System.out.println(it2.next());
                        }
                    } else if (pilih3 == 2) {
                        System.out.println("\nMenampilkan daftar tugas dari awal:");
                        ListIterator<data> it2Awal = list.listIterator(list.size());
                        while (it2Awal.hasPrevious()) {
                            System.out.println(it2Awal.previous());
                        }
                    } else {
                        System.out.println("Input salah");
                    }
                    break;

                case 4:
                    input.close();
                    System.exit(0);

                default:
                    System.out.println("Input salah");
                    break;
            }
        }
    }
}