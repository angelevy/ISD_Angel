public class data {
    private String mataKuliah;
    private String namaTugas;
    private String deadline;

    public data(String mataKuliah, String namaTugas, String deadline) {
        this.mataKuliah = mataKuliah;
        this.namaTugas = namaTugas;
        this.deadline = deadline;
    }

    public data() {
    }

    @Override
    public String toString() {
        return "Mata Kuliah : " + mataKuliah + " || " + "Tugas : " + namaTugas + " || " + "Deadline : " + deadline;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public String getNamaTugas() {
        return namaTugas;
    }

    public String getDeadline() {
        return deadline;
    }
}