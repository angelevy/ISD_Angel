public class mahasiswa {
    private String nim;
    private String kelas;
    private String nama;
    private double nilai;

    public mahasiswa(String nim, String kelas, String nama, double nilai) {
        this.nim = nim;
        this.kelas = kelas;
        this.nama = nama;
        this.nilai = nilai;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getNilai() {
        return nilai;
    }

    public void setNilai(double nilai) {
        this.nilai = nilai;
    }

    @Override
    public String toString() {
        return "NIM : " + nim + " Nama : " + nama + " Kelas : " + kelas + " ";

    }
}