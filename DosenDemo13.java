import java.util.Scanner;
public class DosenDemo13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah dosen: ");
        int jumlahDosen = scanner.nextInt();
        scanner.nextLine();

        Dosen13[] dosenArray = new Dosen13[jumlahDosen];

        for (int i = 0; i < jumlahDosen; i++) {
            System.out.println("Masukkan data dosen ke-" + (i + 1));
            System.out.print("Kode: ");
            String kode = scanner.nextLine();
            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Jenis Kelamin (true untuk Pria, false untuk Wanita): ");
            Boolean jenisKelamin = scanner.nextBoolean();
            System.out.print("Usia: ");
            int usia = scanner.nextInt();
            scanner.nextLine();

            dosenArray[i] = new Dosen13(kode, nama, jenisKelamin, usia);
        }
        System.out.println("\nMenampilkan Data Dosen Menggunakan Perulangan Foreach:");
        for (Dosen13 dosen : dosenArray) {
            dosen.displayInfo();
        }

        Datadosen13 dataDosen = new Datadosen13();

        dataDosen.jumlahDosenPerJenisKelamin(dosenArray);
        dataDosen.rerataUsiaDosenPerJenisKelamin(dosenArray);
        dataDosen.infoDosenPalingTua(dosenArray);
        dataDosen.infoDosenPalingMuda(dosenArray);

        scanner.close();
    }
}