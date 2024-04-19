import java.util.ArrayList;

class daftarBarang<T> {
    private ArrayList<T> List;

    public daftarBarang() {
        this.List = new ArrayList<>();
    }

    public void addData(T data) {
        List.add(data);
    }

    public void removeData(T data) {
        List.remove(data);
    }

    public void editData(int index, T newData) {
        List.set(index, newData);
    }

    public void displayData() {
        for (T data : List) {
            System.out.println(data.toString());
        }
    }
}

class ATK {
    private String JudulBuku;
    private String Penulis;
    private int TahunTerbit;

    public ATK(String KodeBarang, String JenisBarang, String NamaBarang, int Stok) {
        this.KodeBarang = KodeBarang;
        this.JenisBarang = JenisBarang;
        this.NamaBarang = NamaBarang;
        this.Stok = Stok;
    }
    public String toString() {
        return "Kode: " + KodeBarang + ", Jenis: " + JenisBarang + ", Nama: " + NamaBarang + ", Stok: " + Stok;
    }
}
class Bag {
    private String KodeBarang;
    private String JenisBarang;
    private String NamaBarang;
    private int Stok;

    public Bag(String KodeBarang, String JenisBarang, String NamaBarang, int Stok) {
        this.KodeBarang = KodeBarang;
        this.JenisBarang = JenisBarang;
        this.NamaBarang = NamaBarang;
        this.Stok = Stok;
    }
    public String toString() {
        return "Kode: " + KodeBarang + " | " + JenisBarang + " | " + NamaBarang + " | " + Stok;
    }
}
public class jurnal02 {
    public static void main(String[] args) {
        daftarBarang<ATK> atkInventory = new daftarBarang<>();
        atkInventory.addData(new ATK("A001", "Pulpen", "Pilot", 35));
        atkInventory.addData(new ATK("A002", "Pensil", "Joyko", 25));
        atkInventory.addData(new ATK("A003", "Spidol", "Snowman", 25));
        atkInventory.addData(new ATK("B015", "Buku Tulis", "Collage", 40));
        atkInventory.addData(new ATK("B021", "Kertas", "Staedtler Noris 2B", 50));

        System.out.println("ATK Data:");
        atkInventory.displayData();
        atkInventory.toString();

        daftarBarang<Bag> bagInventory = new daftarBarang<>();
        bagInventory.addData(new Bag("C001", "Koper", "Singapore bag", 5));
        bagInventory.addData(new Bag("C002", "Tas Selempang", "Enji", 30));
        bagInventory.addData(new Bag("C003", "Tas Ransel", "Elizabeth", 45));
        bagInventory.addData(new Bag("C004", "Tas Jinjing", "Gucci", 33));
        bagInventory.addData(new Bag("C005", "Tas Carier", "Arei", 56));

        System.out.println("\nBAG Data:");
        bagInventory.displayData();
        bagInventory.toString();
    }
}