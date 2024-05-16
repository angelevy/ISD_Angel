import java.util.PriorityQueue;
import java.util.Scanner;

class Tugas implements Comparable<Tugas> {
    private int deadline;
    private String nama;

    public Tugas(int deadline, String nama) {
        this.deadline = deadline;
        this.nama = nama;
    }

    public int getDeadline() {
        return deadline;
    }

    public String getName() {
        return nama;
    }

    @Override
    public int compareTo(Tugas other) {
        return Integer.compare(this.deadline, other.deadline);
    }

    @Override
    public String toString() {
        return nama + " (deadline: " + deadline + ")";
    }
}

public class main {
    private PriorityQueue<Tugas> tasks;

    public main() {
        tasks = new PriorityQueue<>();
    }

    public void addTask(int deadline, String nama) {
        tasks.offer(new Tugas(deadline, nama));
    }

    public void showNextTask() {
        if (tasks.isEmpty()) {
            System.out.println("Tidak ada tugas yang harus diselesaikan.");
        } else {
            System.out.println("Task terdekat yang harus diselesaikan: " + tasks.peek().getName());
        }
    }

    public void completeNextTask() {
        if (tasks.isEmpty()) {
            System.out.println("Tidak ada tugas yang harus diselesaikan.");
        } else {
            Tugas completedTask = tasks.poll();
            System.out.println(completedTask.getName() + " selesai dilaksanakan, berikutnya " + tasks.peek().getName());
            showNextTask();
        }
    }

    public void clearAllTasks() {
        tasks.clear();
        System.out.println("Semua tugas telah dihapus.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        main toDoList = new main();

        System.out.println("Masukkan tugas dengan format: deadline, nama tugas (ketik 'selesai' untuk mengakhiri input)");
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("selesai")) {
                break;
            }
            String[] parts = input.split(",\\s*");
            if (parts.length == 2) {
                try {
                    int deadline = Integer.parseInt(parts[0].trim());
                    String nama = parts[1].trim();
                    toDoList.addTask(deadline, nama);
                } catch (NumberFormatException e) {
                    System.out.println("Input tidak valid.");
                }
            } else {
                System.out.println("Input tidak valid.");
            }
        }

        toDoList.showNextTask();

        System.out.println("\nMasukkan perintah \n1. Selesai, \n2. Hapus semua, \n3. Lihat Berikutnya, \n4. Selesaikan Tugas");
        while (true) {
            String command = scanner.nextLine();
            if (command.equalsIgnoreCase("1")) {
                break;
            } else if (command.equalsIgnoreCase("2")) {
                toDoList.clearAllTasks();
            } else if (command.equalsIgnoreCase("3")) {
                toDoList.showNextTask();
            } else if (command.equalsIgnoreCase("4")) {
                toDoList.completeNextTask();
            } else {
                System.out.println("Perintah tidak valid");
            }
        }

        scanner.close();
    }
}